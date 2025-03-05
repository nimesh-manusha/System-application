/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author WORK
 */
public class DBconnecter {
    
    static Connection conn = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pcmanagement_system", "root", "");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
}
