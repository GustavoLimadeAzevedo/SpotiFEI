/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Conexao.Conexao;
import model.Musica;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class MusicaDAO {
    private Connection con;
    
    public MusicaDAO() {
        this.con = Conexao.conectar(); // Usa sua conexão existente
        if(this.con == null) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
        }
    }
    
    public List<Musica> listarTodas() {
        String sql = "SELECT * FROM musica"; // Corrigido para tabela 'musica' (singular)
        List<Musica> musicas = new ArrayList<>();
        
        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Musica musica = new Musica(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("artista"),
                    rs.getString("genero") // Alterado para "genero" conforme PDF
                );
                musicas.add(musica);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar músicas: " + e.getMessage());
        }
        return musicas;
    }
    
    public List<Musica> buscar(String termo) {
        String sql = "SELECT * FROM musica WHERE titulo ILIKE ? OR artista ILIKE ? OR genero ILIKE ?";
        List<Musica> resultados = new ArrayList<>();
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, "%" + termo + "%");
            stmt.setString(2, "%" + termo + "%");
            stmt.setString(3, "%" + termo + "%");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                resultados.add(new Musica(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("artista"),
                    rs.getString("genero") // Alterado para "genero"
                ));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na busca: " + e.getMessage());
        }
        return resultados;
    }
    
    
}
