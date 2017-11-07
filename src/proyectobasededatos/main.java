/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NicoPlaceres
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*PSQL psql = new PSQL();
        psql.selectPostgresSql("mascota");
        psql.conexion();
        
        */
        Connection con = DB_Driver.db_connection();
         PreparedStatement stmt;
            try {
                stmt = con.prepareStatement("SELECT * FROM personas where ci =?");
                stmt.setString(1,"12781626");
               /* stmt.setString(2, nombre);
                stmt.setString(3, apellido);
                stmt.setDate(4, new java.sql.Date(aDate.getTime()));
                stmt.setString(5, email);
                stmt.setString(6, celular);*/
               
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString("NOMBRE"));
                }
                  stmt = con.prepareStatement("SELECT * FROM personas where ci =?");
                stmt.setString(1,"12781626");
                
            } catch (SQLException ex) {
                Logger.getLogger(ProyectoBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
     
    


    }

}
