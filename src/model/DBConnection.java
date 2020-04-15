/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author allen
 */
public class DBConnection { //This class is strictly used to connect to the database.
    
   public Connection conn = null;
    
    public Connection getConn(){
    
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException classNotFoundException) {
            
            JOptionPane.showMessageDialog(null, classNotFoundException);
        }
               
        try{
        String url = "jdbc:postgresql://localhost:5432/schooldiscplinarysystem";
        String username = "postgres";
        String password = "tECH$AV!!!!";
    
        conn = DriverManager.getConnection(url, username, password);
        //JOptionPane.showMessageDialog(null, "Connected");
    }catch(SQLException exception){
        
            exception.printStackTrace();
        }
    return conn;
    }
    public static void main(String[] args) 

    {
        DBConnection dbConnection = new DBConnection();
        dbConnection.getConn();
    }  
}
