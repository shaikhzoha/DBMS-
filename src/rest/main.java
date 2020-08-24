/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import static rest.dbconnect.connect;

/**
 *
 * @author Zoha
 */
public class main {
    /**

     * @param args the command line arguments

     * @throws java.lang.ClassNotFoundException

     */
    public static void main(String[] args) throws ClassNotFoundException {

        // TODO code application logic here

        connect(); 
 

    }
}
