/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.MusicaDAO;
import model.Musica;
import java.util.List;

/**
 *
 * @author gusta
 */
public class controllerMusica {
    private MusicaDAO musicaDAO;
    
    
    
    public controllerMusica() {
        this.musicaDAO = new MusicaDAO();
    }
    
    public List<Musica> listarTodasMusicas() {
        return musicaDAO.listarTodas();
    }
    
    public List<Musica> buscarMusicas(String termo) {
        return musicaDAO.buscar(termo);
    }
    
   
    
}
