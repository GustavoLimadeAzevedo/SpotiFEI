/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.PlaylistDAO;
import model.PlayList;
import model.Musica;
import java.util.List;

/**
 *
 * @author gusta
 */
public class controllerPlayList {
    private PlaylistDAO playlistDAO;
    
    public controllerPlayList() {
        this.playlistDAO = new PlaylistDAO();
    }
    
    // 1. Criar playlist
    public boolean criarPlaylist(String nome, int usuarioId) {
        PlayList playlist = new PlayList(nome, usuarioId);
        return playlistDAO.criarPlaylist(playlist);
    }
    
    // 2. Adicionar música à playlist
    public boolean adicionarMusica(int playlistId, int musicaId) {
        return playlistDAO.adicionarMusica(playlistId, musicaId);
    }
    
    // 3. Remover música da playlist
    public boolean removerMusica(int playlistId, int musicaId) {
        return playlistDAO.removerMusica(playlistId, musicaId);
    }
    
    // 4. Listar playlists do usuário
    public List<PlayList> listarPlaylistsUsuario(int usuarioId) {
        return playlistDAO.listarPlaylistsUsuario(usuarioId);
    }
    
    // 5. Listar músicas da playlist
    public List<Musica> listarMusicasPlaylist(int playlistId) {
        return playlistDAO.listarMusicasPlaylist(playlistId);
    }
    
    // 6. Excluir playlist
    public boolean excluirPlaylist(int playlistId) {
        return playlistDAO.excluirPlaylist(playlistId);
    }
    
    // 7. Fechar conexão
    public void fecharConexao() {
        playlistDAO.fecharConexao();
    }
    
}
