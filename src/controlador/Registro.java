package controlador;

import bd.conexion;
import java.util.Date;
import modelo.Datoscita;
import java.sql.Connection;
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
            
            String query = "dd/mm/yyyy";
            
            
        }catch (Exception e){
        }
        return false;
    }
 }