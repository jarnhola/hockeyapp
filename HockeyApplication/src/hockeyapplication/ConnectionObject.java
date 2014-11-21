/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

public class ConnectionObject{
    
    private java.sql.Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost:3306/myhockeydatabase";
    private String user = "root";
    private String password = "jarnhola";
    
    public ConnectionObject(){
        try
        {
            // create a mysql database connection
            conn = DriverManager.getConnection(url,user,password);
            
            Statement st = (Statement) conn.createStatement(); 
            st.executeUpdate("INSERT INTO players (name, age, speed, shooting, passing, puckhandling, armstrength, legstrength)\" "
            + " values (?, ?, ?, ?, ?)");
            conn.close();
            
            // the mysql insert statement
          /*  String query = "INSERT INTO players (name, age, speed, shooting, passing, puckhandling, armstrength, legstrength)"
                + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString  (1, "Jarno");
            preparedStmt.setInt     (2, 37);
            preparedStmt.setInt     (3, 38);
            preparedStmt.setInt     (4, 39);
            preparedStmt.setInt     (4, 40);
            preparedStmt.setInt     (4, 41);
            preparedStmt.setInt     (4, 42);
            preparedStmt.setInt     (4, 43);
            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();*/
            
        } 
        catch (SQLException ex)
        {
            String message = ex.getMessage();
            System.out.println(message);
        }
    }
    
    public Connection getConnection(){
        //Here should ne checking for null value. If conn is null we should throw an exception
        return conn;
    }
}

