package web;

import java.io.IOException;
import java.io.PrintWriter;

import dao.ArticleDaoImp;
import dao.IArticleDao;

import service_d.User_s;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import Models.User;

/**
 * Servlet implementation class ControleurMain
 */

public class ControleurMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	private IArticleDao metier; 

	public void init() throws ServletException {
		 metier = new ArticleDaoImp();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/home.asp")) {
			request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		}
		else if(path.equals("/verification.asp") ){
			User_s Us =new User_s();
			Boolean passwordCheckMetier = false;
			String username = request.getParameter("username");
			 String password = request.getParameter("pass");
			 String confirmpassword = request.getParameter("cpass");
			 if(!Us.checkUNExist(username)) {
				 if(password.equals(confirmpassword)) {
					 ArticleDaoImp ADI = new  ArticleDaoImp();
					 User u = new User(username, password ,"guest");
					
					
					
						String outcome =ADI.save(u);
						System.out.println(outcome);
					
						 
						
						 request.getRequestDispatcher("confirmationR.jsp").forward(request, response);
						 
					
					 
				 }
				 
			 }
			 
			 
		}
		else if(path.equals("/verificationL.asp") ){
			User_s Us =new User_s();
			Boolean passwordCheckMetier = false;
			String username = request.getParameter("username");
			 String password = request.getParameter("pass");
			 String confirmpassword = request.getParameter("cpass");
			 System.out.println("got parameters");
			 if(!Us.checkUNExist(username)) {
				 System.out.println("new username");
				 if(password.equals(confirmpassword)) {
					 System.out.println("passwords match");
					 ArticleDaoImp ADI = new  ArticleDaoImp();
					 User u = new User(username, password ,"guest");
				
						String outcome =ADI.save(u);
						System.out.println(outcome);
						 
						
						 request.getRequestDispatcher("confirmationL.jsp").forward(request, response);
						 
					
					 
				 }
				 else {
					 System.out.println("passwords doesnt match");
				 }
			 }
			 else {
				 System.out.println("error user already exist");
			 }
			 
			 
		}
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
