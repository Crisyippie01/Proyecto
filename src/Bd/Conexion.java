/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CPU
 */
public class Conexion {
    
    public Connection conexion(){
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopofpets","root","contrasenadificil");
            System.out.println("Conexion exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo conectar");
        }
        return conexion;
    }
    
}
