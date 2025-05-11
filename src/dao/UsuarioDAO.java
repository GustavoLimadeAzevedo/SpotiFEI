/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexao.Conexao; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author gusta
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = Conexao.conectar(); // Conexão estabelecida
    }
    
    public void cadastrarUsuario(Usuario usu) {
        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";
             
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            // Preenche os parâmetros
            ps.setString(1, usu.getNome());
            ps.setString(2, usu.getUsuario());
            ps.setString(3, usu.getSenha());
            
            // Executa e fecha
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }
       } 
    
    public Usuario logarUsuario(String usuario, String senha) {
    String sql = "SELECT id, nome, usuario FROM usuarios WHERE usuario = ? AND senha = ?";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, usuario);
        ps.setString(2, senha);
        
        // Modificação principal está aqui ↓
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Usuario usuarioLogado = new Usuario();
                usuarioLogado.setId(rs.getInt("id"));
                usuarioLogado.setNome(rs.getString("nome"));
                usuarioLogado.setUsuario(rs.getString("usuario"));
                return usuarioLogado;
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao fazer login: " + e.getMessage());
    }
    return null;
}
}