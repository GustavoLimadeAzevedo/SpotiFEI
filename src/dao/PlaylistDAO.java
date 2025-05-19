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
   
    
    
    
    
}