/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Bd.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author CPU
 */
public class RegistroCliente {
    
    public boolean agregar(Cliente cliente){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "INSERT INTO cliente(usuario,contraseña) VALUES(?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,cliente.getUsuario());
            stmt.setString(2,cliente.getContraseña());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos");
            return false;
        }
        
    }
    
    public boolean Consultar(Cliente consulta){
        
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
            System.out.println("Error en la consulta SQL para consultar datos");
            return false;
        }
        
    }
    
}
