/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author NicoPlaceres
 */
public class PSQL {

    public void realizaConexion() {
        String user = "postgres";
        String pass = "123";
        Connection conn = null;
        String urlDatabase = "jdbc:postgresql://192.168.56.101:5432/postgres";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, user, pass);
            java.sql.Statement st = conn.createStatement();
            String sql = "SELECT * FROM public.clientes ";
       
            ResultSet result = st.executeQuery(sql);
            
            
            while (result.next()) {
                String cliente = result.getString("nombrecontacto");
                String cedula = result.getString("cedula_ruc");
                System.out.println("cliente: " + cliente + " CI: " + cedula);
               // System.out.println(todo);
               
            }
            result.close();
            st.close();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        //System.out.println("La conexión se realizo sin problemas! =) ");
    }
    
    
    
    
    public void selectPostgresSql(String tabla) {
        String user = "postgres";
        String pass = "123";
        Connection conn = null;
        String urlDatabase = "jdbc:postgresql://192.168.56.101:5432/ProyectoBD";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, user, pass);
            java.sql.Statement st = conn.createStatement();
            String sql = "SELECT * FROM public."+tabla;
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                String cliente = result.getString("ID_CHIP");
                String cedula = result.getString("CI_DUENIO");
                String nombre = result.getString("NOMBRE");
                String peso = result.getString("PESO");
                String edad = result.getString("EDAD");
                System.out.println("cliente: " + cliente + " CI: " + cedula);
                
                
            }
            result.close();
            st.close();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        System.out.println("La conexión se realizo sin problemas! =) ");
    }
            

    public void conexion() {

        String cadena = "jdbc:postgresql://﻿192.168.56.101:5432/postgres";
        String user = "postgres";
        String pass = "123";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena, user, pass);
            java.sql.Statement st = conex.createStatement();
            String sql = "SELECT clienteid, cedula_ruc FROM public.clientes ";
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                String usuario = result.getString("clienteid");
                String clave = result.getString("cedula_ruc");
                System.out.println("User: " + usuario + " Pass: " + clave);
            }
            result.close();
            st.close();
            conex.close();
        } catch (Exception exc) {
            System.out.println("Errorx:" + exc.getMessage());
        }
    }

}
