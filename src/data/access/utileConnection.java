package data.access;


import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import java.sql.DriverManager;

public class utileConnection {
	
	
	 public static Connection db_connect() {
	        try {
	            
	           
	            //
	            Class.forName("org.postgresql.Driver");
	            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/UPUPUP","postgres", "123456789");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            //System.out.println(e.getMessage());
	            return null;
	        }
	    }
	 
	 
    //
}
