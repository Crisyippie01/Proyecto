/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Bd.Conexion;
import Modelo.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CPU
 */
public class RegistroStaff {
    
    public boolean agregar(Staff staff){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "INSERT INTO staff(usuario,contraseña) VALUES(?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,staff.getUsuario());
            stmt.setString(2,staff.getContraseña());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos");
            return false;
        }
        
    }
    
    public boolean Consultar(Staff consulta){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "SELECT * FROM cliente WHERE usuario = ? AND contraseña = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, consulta.getUsuario());
            stmt.setString(2, consulta.getContraseña());
            
            ResultSet rs = stmt.executeQuery();
            
            boolean encontrado = rs.next();
            
            rs.close();
            stmt.close();
            cnx.close();
            return encontrado;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL al consultar datos");
            return false;
        }
        
    }
}
