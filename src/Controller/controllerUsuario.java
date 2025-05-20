/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.UsuarioDAO;
import model.Usuario;
import java.util.List;

/**
 *
 * @author gusta
 */
public class controllerUsuario {
    private UsuarioDAO usuarioDAO;

    public controllerUsuario() {
        this.usuarioDAO = new UsuarioDAO();
    }

    // Cadastrar usuário
    public void cadastrarUsuario(Usuario usuario) {
        usuarioDAO.cadastrarUsuario(usuario);
    }

    // Login de usuário
    public Usuario logarUsuario(String usuario, String senha) {
        return usuarioDAO.logarUsuario(usuario, senha);
    }
}