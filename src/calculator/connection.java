
package calculator;

import java.sql.Connection;
import java.sql.DriverManager;


public class connection {
    public static Connection getconnection(){
       Connection con =null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost","root", "");
            } 
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
        return con;
        
        
    }  
}
