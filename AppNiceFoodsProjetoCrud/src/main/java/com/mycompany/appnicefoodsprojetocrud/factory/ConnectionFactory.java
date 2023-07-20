/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appnicefoodsprojetocrud.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author audi
 */

/*Conexao com o banco*/

/*A classe Connection Factory é responsável por fornecer uma conexão com o banco de dados em uma
aplicação Java. Ela implementa o padrão de projeto Factory Method, criando objetos de conexão de
acordo com as configurações especificadas, como URL, usuário e senha de conexão. O objetivo desta 
classe é centralizar a criação de objetos de conexão, o que facilita a manutenção e otimização 
da aplicação.*/


public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/AppNiceFoodsProjetoCrud", "root", "minha-senha");
            
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
