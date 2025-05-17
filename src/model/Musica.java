/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gusta
 */
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





//private void configurarTabela() {
//        DefaultTableModel model = new DefaultTableModel(
//            new Object[][]{},
//            new String[]{"Título", "Artista", "Gênero"}  // Corrigido para Gênero
//        );
//        jTableMusicas.setModel(model);
//    }
//    
//    
//    private void carregarMusicas() {
//        DefaultTableModel model = (DefaultTableModel) jTableMusicas.getModel();
//        model.setRowCount(0);
//    
//        List<Musica> musicas = controller.listarTodasMusicas();
//        for (Musica musica : musicas) {
//            model.addRow(new Object[]{
//                musica.getTitulo(),
//                musica.getArtista(),
//                musica.getGenero()  // Corrigido para getGenero()
//            });
//        }
