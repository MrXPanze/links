/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livrariashazam.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mvdo
 */
public class Conexao {

    private static final String URL_MYSQL = "jdbc:mysql://localhost/db";
    private static final String DRIVER_CLASS = "com.mysql,jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "007698";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_CLASS);
             return DriverManager.getConnection(URL_MYSQL,USERNAME,PASSWORD);
        } catch (Exception ex) {
            System.out.println("Não conectou no banco");
        }
        return null;
    }
    
}
