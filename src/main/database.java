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
        
        Connection con = null;
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/transitdatabase","root","");
        }catch (ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
        
        return con;
    }
}
