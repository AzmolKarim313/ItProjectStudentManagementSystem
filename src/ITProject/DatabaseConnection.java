/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Azmol-IT
 */
public class DatabaseConnection {
    
    private final String schema = "student_managment_db";
    private final String root = "root";
    private final String pass = "azmol";
    
    private Connection con = null;
    
    public void driverConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Status : " + e.getMessage());
        }
    }
    
    public Connection doConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, root, pass);
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
        return con;
    }
    
    public void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Status : " + ex.getSQLState());
            System.out.println("Message : " + ex.getMessage());
        }
    }
    
}
