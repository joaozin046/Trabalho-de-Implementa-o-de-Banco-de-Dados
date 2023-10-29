/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shein_proj;


/* Feito por ...
João Pedro Flausino*/ 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SheinDBConnector{

    public static Connection getConnection() throws SQLException {
        
    Connection connection = null;
    
    String URL = "";
    String USERNAME = "";
    String PASSWORD = "";
    
    try{
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Erro Conection", "Erro", 2);
    }
        return connection;
    }
}
