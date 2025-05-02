/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectFactory;
import java.sql.Connection;
import model.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = new ConnectFactory().getConnection();
    }
    
    public void cadastrarUsuario(Usuario usu){
        
        String sql = "Insert into pessoa (nome, usuario, senha)" + "values(?,?,?)";
             
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usu.getNome());
            ps.setString(2, usu.getUsuario());
            ps.setString(3, usu.getSenha());
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, Usuário não foi cadastrado!");
            
        }
    }
    
    
    
}
