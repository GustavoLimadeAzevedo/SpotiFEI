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
//
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
        this.con = Conexao.conectar(); // Conexão estabelecida
    }
    

}