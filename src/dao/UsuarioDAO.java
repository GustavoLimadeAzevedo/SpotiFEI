/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Usuario;
import Conexao.Conexao;

/**
 *
 * @author gusta
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = Conexao.conectar(); // agora usando sua classe personalizada
    }
    
    public void cadastrarUsuario(Usuario usu) {
        // Verifique se o nome da tabela e os campos batem com o seu banco
        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";
             
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usu.getNome());
            ps.setString(2, usu.getUsuario());
            ps.setString(3, usu.getSenha());
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    }
}