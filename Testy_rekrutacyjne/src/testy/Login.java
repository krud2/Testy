package testy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String pass;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter pw = response.getWriter();

			try {
	            
	            Connection con = DriverManager.getConnection("jdbc:mysql://webnec2.hekko24.pl/webnec2_rekrutacja","webnec2_rekrut","rekrutacja32ssi");
	            Statement stmt = (Statement) con.createStatement();
	            String q = "SELECT username, password FROM user;";
	            stmt.executeQuery(q);
	            ResultSet rs = stmt.getResultSet();

	            while(rs.next()){
	                name = rs.getString("username");
	                pass = rs.getString("password");

	                if(name.equals(name) && pass.equals(pass)){
	                    System.out.println("OK");
	                    
	                }
	            }
	        } 
			catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	    }
	}

