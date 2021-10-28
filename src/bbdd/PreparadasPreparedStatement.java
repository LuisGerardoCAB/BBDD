/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author xl3_c
 */
public class PreparadasPreparedStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //paso1 Conexxion
             Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
             //Creamos un objeto de tipo statement
             
             PreparedStatement miPrepared =  miConexion.prepareStatement("SELECT * FROM productos WHERE Nombre =?");
            //Establecer parametros de consulta
             miPrepared.setString(1 ,"Petalo");
             //4. Ejeccutar consulta y recorre
            ResultSet resultadoConsulta= miPrepared.executeQuery();
             while(resultadoConsulta.next()){
                 System.out.println(resultadoConsulta.getString("CodigoDeBarras")+ resultadoConsulta.getString(3));
             }
             
        } catch (Exception e) {
        }
        
        
    }
    
}
