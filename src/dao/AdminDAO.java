/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Admin;
import model.Usuario;

/**
 *
 * @author gusta
 */
public class AdminDAO {
    
      private Connection con;
      
      public AdminDAO() {
        this.con = Conexao.conectar(); // Conexão estabelecida
        
      }
      
      
      public void cadastrarAdministrador(Admin adm) {
        String sql = "INSERT INTO administrador_usuario (nome, usuario, senha) VALUES (?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getUsuario());
            ps.setString(3, adm.getSenha());

            ps.execute();
            ps.close();

            JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar administrador: " + e.getMessage());
        }
    }

    public Admin logarAdministrador(String usuario, String senha) {
        String sql = "SELECT id, nome, usuario FROM administrador_usuario WHERE usuario = ? AND senha = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, senha);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Admin administradorLogado = new Admin();
                    administradorLogado.setId(rs.getInt("id"));
                    administradorLogado.setNome(rs.getString("nome"));
                    administradorLogado.setUsuario(rs.getString("usuario"));
                    return administradorLogado;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer login de administrador: " + e.getMessage());
        }
        return null;
    }
}
      

    

