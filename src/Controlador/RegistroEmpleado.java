/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Empleado;

/**
 *
 * @author CPU
 */
public class RegistroEmpleado {
    
    public boolean agregar(Empleado empleado){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "INSERT INTO empleado(rut,nombre,cargo,sueldo) VALUES(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, empleado.getRut());
            stmt.setString(2, empleado.getNombre());
            stmt.setInt(3, empleado.getCargo());
            stmt.setDouble(4, empleado.getSueldo());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos");
            return false;
        }
        
    }

    public boolean Eliminar(String rut){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "DELETE FROM empleado WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);
   
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para eliminar datos");
            return false;
        }
        
    }
    
    public boolean Editar(Empleado empleado){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "UPDATE empleado SET nombre = ?, cargo = ?, sueldo = ? WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, empleado.getNombre());
            stmt.setInt(2, empleado.getCargo());
            stmt.setDouble(3, empleado.getSueldo());
            stmt.setString(4, empleado.getRut()); 
        
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para editar datos");
            return false;
        }
        
    }
    
}