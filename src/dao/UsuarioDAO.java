/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Usuario;
import Conexao.Conexao;
=======
import connect.ConnectFactory;
import java.sql.Connection;
import model.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
>>>>>>> c3955feaf6277336ffc0722dc1d59c1604fbab82

/**
 *
 * @author gusta
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
<<<<<<< HEAD
        this.con = Conexao.conectar(); // agora usando sua classe personalizada
    }
    
    public void cadastrarUsuario(Usuario usu) {
        // Verifique se o nome da tabela e os campos batem com o seu banco
        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";
=======
        this.con = new ConnectFactory().getConnection();
    }
    
    public void cadastrarUsuario(Usuario usu){
        
        String sql = "Insert into pessoa (nome, usuario, senha)" + "values(?,?,?)";
>>>>>>> c3955feaf6277336ffc0722dc1d59c1604fbab82
             
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usu.getNome());
            ps.setString(2, usu.getUsuario());
            ps.setString(3, usu.getSenha());
            
            ps.execute();
            ps.close();
            
<<<<<<< HEAD
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    }
}
=======
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, Usuário não foi cadastrado!");
            
        }
    }
    
    
    
}
>>>>>>> c3955feaf6277336ffc0722dc1d59c1604fbab82
