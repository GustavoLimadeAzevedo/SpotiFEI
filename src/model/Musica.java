/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gusta
 */
//
public class Musica {
    private int id;
    private String titulo;
    private String artista;    
    private String genero; // Adicione se precisar
    
    // Construtor
    public Musica(int id, String titulo, String artista, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }
    
    // Getters (os setters são opcionais se não for editar)
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }
    public String getGenero() { return genero; }
    
    // Método útil para exibição
    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + genero + ")";
    }
    
}





