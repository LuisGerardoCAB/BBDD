/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author xl3_c
 */
public class ConsultasABC {
    public static void main(String [] args){
        try {
             Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
             Statement miStatement = miConexion.createStatement();
             String query="INSERT INTO `productos` (`CodigoDeBarras`, `Nombre`, `Presentacion`, `Tamanio`, `Cantidad`, `Ganancias`, `PrecioCaja`, `Foto`) VALUES (7576, 'Petalo', 'papel', '400 hoja', 40, 5, 430, NULL)";
             miStatement.executeUpdate(query);
             System.out.println("Datos insertados coreectamente");
        } catch (Exception e) {
            System.out.println("error       ");
            e.printStackTrace();
        }
   
    
    }
}
