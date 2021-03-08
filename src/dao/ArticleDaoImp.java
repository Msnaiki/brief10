package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.User;
import data.access.utileConnection;


public class ArticleDaoImp implements IArticleDao{

	

	
	

	

	

	@Override
	public int delete(int id) {
		Connection connect = utileConnection.db_connect();
		int ret =0;
		try {
			
			PreparedStatement ps = connect.prepareStatement("DELETE FROM article WHERE id = ?");
			ps.setInt(1,id);
	 
			ret = ps.executeUpdate();
 
			ps.close();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
		return ret;
	}

	
	



	@Override
	public void test() {
		Connection connect = utileConnection. db_connect();
		try {
			PreparedStatement ps = connect.prepareStatement("INSERT INTO public.testing (\"image\")	VALUES (?)");
			ps.setString(1,"database successfully got");
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






	@Override
	public String save(User U) {
		Connection connect = utileConnection. db_connect();
		String s = "success";
		try {
			PreparedStatement ps = connect.prepareStatement("INSERT INTO  \"users\" (username,password,role)	VALUES (?,?,?)");
			ps.setString(1,U.getUsername());
			ps.setString(2,U.getP());
			ps.setString(3,U.getRole());
			ps.executeUpdate();
			return s;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error: ");
			
		}
		return s;
	
	}








}
