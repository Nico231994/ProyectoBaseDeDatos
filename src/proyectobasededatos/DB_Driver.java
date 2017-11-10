/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Feder
 */
public class DB_Driver {
    
    public static Connection db_connection(){
        System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return null;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://192.168.56.101:5432/ProyectoBD", "postgres",
					"123");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return connection;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
                        return connection;
		} else {
			System.out.println("Failed to make connection!");
                        return connection;
		}
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    //SELECT rut,ci FROM veterinario_veterinaria  WHERE rut='1234';
    
     public static boolean cargarVet_Vet(String ci, String rut,Veterinario veterinario,Veterinaria veterinaria){
        Connection con = DB_Driver.db_connection();
         PreparedStatement stmtVeterinario;
           PreparedStatement stmtVeterinaria;
            try {
                stmtVeterinaria = con.prepareStatement("SELECT * FROM  veterinaria Where rut = ?");
                stmtVeterinaria.setString(1, veterinaria.getRut());
                
                stmtVeterinario = con.prepareStatement("SELECT * FROM veterinario  where ci =?");
                stmtVeterinario.setString(1,ci);
                
               ResultSet rsVeterinaria = stmtVeterinaria.executeQuery();
               ResultSet rsVeterinario = stmtVeterinario.executeQuery();
                while(rsVeterinaria.next()){
                    String nombreVeterinaria = rsVeterinaria.getString("nombre");
                    veterinaria.setNombre(nombreVeterinaria);    
                }
                 while(rsVeterinario.next()){
                     
                    String nombreVeterinario = rsVeterinario.getString("nombre");
                    String apellidoVeterinario = rsVeterinario.getString("apellido");
                    String fechaNacVeterinario = rsVeterinario.getString("f_nac");
                    String emailVeterinario = rsVeterinario.getString("email");
                    String celular = rsVeterinario.getString("celular");
                    
                    
                    veterinario.setNombre(nombreVeterinario);
                    veterinario.setApellido(apellidoVeterinario);
                    veterinario.setF_nac(fechaNacVeterinario);
                    veterinario.setEmail(emailVeterinario);
                    veterinario.setCelular(celular);
                }
                
                 return comprobarVet_Vet(veterinario.getCi(), veterinaria.getRut());
                 
               
                
            } catch (SQLException ex) {
                
                Logger.getLogger(ProyectoBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
                
            }
        
        
    }
    public static boolean comprobarVet_Vet(String ci, String rut){
        Connection con = DB_Driver.db_connection();
         PreparedStatement stmt;
            try {
                stmt = con.prepareStatement("SELECT * FROM veterinario_veterinaria  where ci =? AND rut=?");
                stmt.setString(1,ci);
                stmt.setString(2, rut);
                
               ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    String ciResult = rs.getString("ci");
                    String rutresult = rs.getString("rut");
                    if((ciResult.compareTo(ci) == 0) && (rutresult.compareTo(rut) == 0)){
                        System.out.println(ciResult + rutresult);        
                        return true;
                    }
                    
                }
                
            // if(resultados[0] = ci){
                 
                
           // }
               
                
            } catch (SQLException ex) {
                
                Logger.getLogger(ProyectoBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        
        return false;
    }
    public static ResultSet mostrarDatosVet(String rut) throws SQLException{
        
        Connection con = DB_Driver.db_connection();
         PreparedStatement stmt;
        
        
            stmt = con.prepareStatement("SELECT * FROM tabla_datos_veterinaria  where rut_veterinaria =?");
            stmt.setString(1,rut);
            ResultSet rs = stmt.executeQuery();
            return rs;    
            
            
       
      
        
    }
    
    
}
