package controlador;

import bd.conexion;
import java.util.Date;
import modelo.Datoscita;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author jenny
 * @version 25-11-2021
 */
public class Registro {
    
    public boolean agregar (Datoscita datoscita){
        
        Date date;
        
        try {
            conexion con = new conexion();
            Connection cnx = con.obtenerConexion();
            
            date = datoscita.getFecha();
            
             String query = "INSERT INTO datoscita(rut,nombre,apellido,telefono,edad,prevision,doctor,especialidad,fecha,valor) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, datoscita.getRut());
            stmt.setString(2, datoscita.getNombre());
            stmt.setString(3, datoscita.getApellido());
            stmt.setInt(4, datoscita.getTelefono());
            stmt.setInt(5, datoscita.getEdad());
            stmt.setString(6, datoscita.getPrevision());
            stmt.setString(7, datoscita.getDoctor());
            stmt.setString(8, datoscita.getEspecialidad());
            stmt.setDate(9, new java.sql.Date(date.getTime()));
            stmt.setInt(10, datoscita.getValor());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Rut: " + e.getMessage());
            return false;
        } catch(Exception e){
            System.out.println("Error al agregar Rut (EXCEPTION): " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar (Datoscita datoscita){
        
        
        
        try {
            conexion con = new conexion();
            Connection cnx = con.obtenerConexion();
            
           
            
             String query = "UPDATE libro set datoscita = ?,rut = ?, nombre = ?, apellido = ?, telefono = ?, edad = ?,prevision = ?, doctor = ?, especialidad = ?, fecha = ?, valor = ?  WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, datoscita.getRut());
            stmt.setString(2, datoscita.getNombre());
            stmt.setString(3, datoscita.getApellido());
            stmt.setInt(4, datoscita.getTelefono());
            stmt.setInt(5, datoscita.getEdad());
            stmt.setString(6, datoscita.getPrevision());
            stmt.setString(7, datoscita.getDoctor());
            stmt.setString(8, datoscita.getEspecialidad());
            stmt.setDate(9, new java.sql.Date(datoscita.getFecha().getTime()));
            stmt.setInt(10, datoscita.getValor());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Rut: " + e.getMessage());
            return false;
        } catch(Exception e){
            System.out.println("Error al agregar Rut (EXCEPTION): " + e.getMessage());
            return false;
        }
    }
}
    


      