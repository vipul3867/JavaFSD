package simplilearn.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
    public static void main(String[]args) {
    	
    	String driver="com.mysql.cj.jdbc.Driver";
    	String url="jdbc:mysql://localhost:3306/simplilearn";
    	String username="root";
    	String password="Vipul@4567";
    	
    	try {
    		Class.forName(driver);
    		
    		Connection con=DriverManager.getConnection(url,username,password);
    		
    		if (con!=null)
    			System.out.println("Connection Established");
    		else
    			System.out.println("Error while connecting with Database");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
