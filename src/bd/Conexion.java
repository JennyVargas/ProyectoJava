package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jenny
 * @version 29-11-2021
 */
public class Conexion {
    
        public Connection obtenerConexion(){
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citas","root","");
            System.out.println("Conexion Exitosa");
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
   public static void main(String[] args){
       Conexion con = new Conexion();
       con.obtenerConexion();
    }
// 
}
