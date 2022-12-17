/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mark Ian Ebuen
 */
public class database {
    
    public static Connection connectDb(){
        
        Connection connection = null;
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6585167?","sql6585167","TJ4sFUtJWV");
          
        }catch (ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
        
        return connection;
        

    }
}
