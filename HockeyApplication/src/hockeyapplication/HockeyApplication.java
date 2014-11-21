/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyapplication;

import java.io.*;
/*
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
*/
/**
 *
 * @author Järjestelmänvalvoja
 */
public class HockeyApplication {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        
        //PrintWriter talteen = new PrintWriter("tallessa.txt");
        /*
        java.sql.Connection conn = null;   
        PreparedStatement pst = null;
        ResultSet rs = null;
        String myDriver = "org.gjt.mm.mysql.Driver";
        String url = "jdbc:mysql://localhost:3306/myhockeydatabases";
        String user = "root";
        String password = "jarnhola";
        
        try
        {
            conn = DriverManager.getConnection(url,user,password);
            
        } 
        catch (SQLException ex)
        {
            String message = ex.getMessage();
            System.out.println(message);
        }
        */
        
        Coach c = new Coach();
        
    }
}
