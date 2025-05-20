/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.AdminDAO;
import model.Usuario;
import java.util.List;
import model.Admin;

/**
 *
 * @author gusta
 */
public class controllerAdmin {
   private AdminDAO adminDAO;

    public controllerAdmin() {
        this.adminDAO = new AdminDAO();
    }

    public void cadastrarAdministrador(Admin administrador) {
        adminDAO.cadastrarAdministrador(administrador);
    }

    public Admin logarAdministrador(String usuario, String senha) {
        return adminDAO.logarAdministrador(usuario, senha);
    }
}