/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;
import java.sql.*;
/**
 *
 * @author xl3_c
 */
public class Select {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            //Creamos La coneccion a la base de datos 
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
            //segundo paso crear objeto statement
            Statement MiStatement = miConexion.createStatement();
            //Tercer paso ejecutar sql
            String query = "Select * from productos";
            ResultSet miResultset = MiStatement.executeQuery(query);
            //Recorrer o leer el resulset
             while (miResultset.next()){
                 System.out.print(miResultset.getString("CodigoDeBarras") +" " +miResultset.getString("Nombre")+" "+ miResultset.getString(3));
             }
            
        } catch (Exception e) {
            System.out.println("No conecta");
            
            e.printStackTrace();
            
        }
        
    }
    
}
