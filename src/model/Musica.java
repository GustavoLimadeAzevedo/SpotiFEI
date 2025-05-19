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
    private String genero;

    // Construtor vazio necessário
    public Musica() {
    }

    // Construtor com parâmetros
    public Musica(int id, String titulo, String artista, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}








