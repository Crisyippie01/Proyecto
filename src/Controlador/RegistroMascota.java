/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Bd.Conexion;
import Modelo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CPU
 */
public class RegistroMascota {

    public boolean agregar(Mascota mascota){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "INSERT INTO mascota(edad,peso,nombre,descripcion,usuario) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, mascota.getEdad());
            stmt.setDouble(2, mascota.getPeso());
            stmt.setString(3, mascota.getNombre());
            stmt.setString(4, mascota.getDescripcion());
            stmt.setString(5, mascota.getUsuario());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos");
            return false;
        }
        
    }
    
    public List<Mascota> listar(){
        
        List<Mascota> lista = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "SELECT * FROM mascota";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            
            
            while   (rs.next()){
                Mascota mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setPeso(rs.getDouble("peso"));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setDescripcion(rs.getString("descripcion"));
                mascota.setUsuario(rs.getString("usuario"));
                
                lista.add(mascota);
            }
            
            
            rs.close();
            stmt.close();
            cnx.close();
 
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para listar datos");
            
        }
        return lista;
    }
    
    public boolean Eliminar(String idMascota){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "DELETE FROM mascota WHERE idMascota = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, idMascota);
   
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para eliminar datos");
            return false;
        }
        
    }
    
}
