package service_d;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data.access.utileConnection;

public class User_s {
	
	public User_s() {
		
	}
	
	public Boolean checkUNExist(String UN)
	{
		Boolean exist = false;
		Connection connect = utileConnection.db_connect();
		try {
			PreparedStatement ps = connect.prepareStatement("SELECT * FROM \"users\" WHERE username = ?");
			ps.setString(1, UN);
		 
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{ 
				exist = true;
	 
			 
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error is  :  " + e.getMessage());
		}
		
		
		return exist;
		
	}
}
