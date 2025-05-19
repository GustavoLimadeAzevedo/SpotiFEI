/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexao.Conexao;
import model.PlayList;
import model.Musica;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author gusta
 */
public class PlaylistDAO {
    private Connection con;

    public PlaylistDAO() {
        this.con = Conexao.conectar();
    
    
        }
    // 1. Criar playlist
    public boolean criarPlaylist(PlayList playlist) {
        String sql = "INSERT INTO playlists (nome, usuario_id) VALUES (?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, playlist.getNome());
            stmt.setInt(2, playlist.getUsuarioId());
            
            int affectedRows = stmt.executeUpdate();
            
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        playlist.setId(generatedKeys.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar playlist: " + e.getMessage());
        }
        return false;
    }
    
    // 2. Adicionar música à playlist
    public boolean adicionarMusica(int playlistId, int musicaId) {
        String sql = "INSERT INTO playlist_musicas (playlist_id, musica_id) VALUES (?, ?)";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, playlistId);
            stmt.setInt(2, musicaId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar música: " + e.getMessage());
        }
        return false;
    }
    
    // 3. Remover música da playlist
    public boolean removerMusica(int playlistId, int musicaId) {
        String sql = "DELETE FROM playlist_musicas WHERE playlist_id = ? AND musica_id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, playlistId);
            stmt.setInt(2, musicaId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover música: " + e.getMessage());
        }
        return false;
    }
    
    // 4. Listar playlists de um usuário
    public List<PlayList> listarPlaylistsUsuario(int usuarioId) {
        List<PlayList> playlists = new ArrayList<>();
        String sql = "SELECT * FROM playlists WHERE usuario_id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, usuarioId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    PlayList playlist = new PlayList();
                    playlist.setId(rs.getInt("id"));
                    playlist.setNome(rs.getString("nome"));
                    playlist.setUsuarioId(rs.getInt("usuario_id"));
                    playlists.add(playlist);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar playlists: " + e.getMessage());
        }
        return playlists;
    }
    
    // 5. Listar músicas de uma playlist
    public List<Musica> listarMusicasPlaylist(int playlistId) {
         List<Musica> musicas = new ArrayList<>();
    String sql = "SELECT m.* FROM musica m " +
                 "JOIN playlist_musicas pm ON m.id = pm.musica_id " +
                 "WHERE pm.playlist_id = ?";
    
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setInt(1, playlistId);
        
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Musica musica = new Musica();
                musica.setId(rs.getInt("id"));
                musica.setTitulo(rs.getString("titulo"));
                musica.setArtista(rs.getString("artista"));
                musica.setGenero(rs.getString("genero"));
                musicas.add(musica);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao listar músicas da playlist: " + e.getMessage());
    }
    return musicas;
}
    
    // 6. Excluir playlist
    public boolean excluirPlaylist(int playlistId) {
        // Primeiro remove as músicas associadas
        String sqlRemoverMusicas = "DELETE FROM playlist_musicas WHERE playlist_id = ?";
        String sqlRemoverPlaylist = "DELETE FROM playlists WHERE id = ?";
        
        try {
            // Inicia transação
            con.setAutoCommit(false);
            
            // Remove músicas da playlist
            try (PreparedStatement stmt = con.prepareStatement(sqlRemoverMusicas)) {
                stmt.setInt(1, playlistId);
                stmt.executeUpdate();
            }
            
            // Remove a playlist
            try (PreparedStatement stmt = con.prepareStatement(sqlRemoverPlaylist)) {
                stmt.setInt(1, playlistId);
                int affectedRows = stmt.executeUpdate();
                
                if (affectedRows > 0) {
                    con.commit();
                    return true;
                }
            }
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao reverter transação: " + ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Erro ao excluir playlist: " + e.getMessage());
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao restaurar auto-commit: " + e.getMessage());
            }
        }
        return false;
    }
    
     // 7. Fechar conexão
    public void fecharConexao() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
        }
    }
    
    
    
    
    
    
}