

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
/**
 *
 * @author gusta
 */
public class Conexao {
    public static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            return java.sql.DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SpotiFEI", // banco
                "postgres", // usuário
                "mingau10"  // senha
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar: " + e.getMessage());
        }
    }

    // Método main só pra testar
    public static void main(String[] args) {
        try {
            Connection c = conectar();
            System.out.println("Conexão bem-sucedida!");
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
