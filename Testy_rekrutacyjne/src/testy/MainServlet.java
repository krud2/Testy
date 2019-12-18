package testy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"pl\">\r\n" + 
				"<head>\r\n" + 
				"\r\n" + 
				"	<meta charset=\"utf-8\">\r\n" + 
				"	<title>Testy rekrutacyjne online</title>\r\n" + 
				"	<meta name=\"description\" content=\"Testy rekrutacyjne online\">\r\n" + 
				"	<meta name=\"keywords\" content=\"testy, rekrutacja, online, korpo\">\r\n" + 
				"	<meta name=\"author\" content=\"Mortinez Walles\">\r\n" + 
				"	\r\n" + 
				"	<meta http-equiv=\"X-Ua-Compatible\" content=\"IE=edge,chrome=1\">\r\n" + 
				"	\r\n" + 
				"	\r\n" + 
				"\r\n" + 
				"<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n" + 
				"<script src=\"js/bootstrap.min.js\"></script>\r\n" + 
				"<script src=\"js/jquery.min.js\"></script>\r\n" + 
				"<link rel=\"stylesheet\" href=\"css/style.css\">\r\n" + 
				"<!------ Include the above in your HEAD tag ---------->\r\n" + 
				"\r\n" + 
				"	\r\n" + 
				"	\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n" + 
				"  <a class=\"navbar-brand\" href=\"index.html\">TESTY-REKRUTACYJNE.PL</a>\r\n" + 
				"  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"    <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"  </button>\r\n" + 
				"</nav>\r\n" + 
				"\r\n" + 
				"<div class=\"container\">\r\n" + 
				"<br>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div class=\"card bg-light\">\r\n" + 
				"<article class=\"card-body mx-auto\" style=\"max-width: 400px;\">\r\n" + 
				"	<h4 class=\"card-title mt-3 text-center\">Za³ó¿ konto!</h4>\r\n" + 
				"	<p class=\"text-center\">Zacznij zak³adaj¹c konto zupe³nie za darmo!</p>\r\n" + 
				"	\r\n" + 
				"	\r\n" + 
				"	<form>\r\n" + 
				"	<div class=\"form-group input-group\">\r\n" + 
				"		<div class=\"input-group-prepend\">\r\n" + 
				"		    <span class=\"input-group-text\"> <i class=\"fa fa-user\"></i> </span>\r\n" + 
				"		 </div>\r\n" + 
				"        <input name=\"name\" class=\"form-control\" placeholder=\"login\" type=\"text\">\r\n" + 
				"    </div> <!-- form-group// -->\r\n" + 
				"    <div class=\"form-group input-group\">\r\n" + 
				"    	<div class=\"input-group-prepend\">\r\n" + 
				"		    <span class=\"input-group-text\"> <i class=\"fa fa-envelope\"></i> </span>\r\n" + 
				"		 </div>\r\n" + 
				"        <input name=\"email\" class=\"form-control\" placeholder=\"e-mail\" type=\"email\">\r\n" + 
				"    </div> <!-- form-group// -->\r\n" + 
				"    <div class=\"form-group input-group\">\r\n" + 
				"    	<div class=\"input-group-prepend\">\r\n" + 
				"		    <span class=\"input-group-text\"> <i class=\"fa fa-envelope\"></i> </span>\r\n" + 
				"		 </div>\r\n" + 
				"        <input name=\"\" class=\"form-control\" placeholder=\"Powtórz e-mail\" type=\"email\">\r\n" + 
				"    </div> <!-- form-group// -->\r\n" + 
				"\r\n" + 
				"    <div class=\"form-group input-group\">\r\n" + 
				"    	<div class=\"input-group-prepend\">\r\n" + 
				"		    <span class=\"input-group-text\"> <i class=\"fa fa-lock\"></i> </span>\r\n" + 
				"		</div>\r\n" + 
				"        <input name=\"password\"class=\"form-control\" placeholder=\"has³o\" type=\"password\">\r\n" + 
				"    </div> <!-- form-group// -->\r\n" + 
				"    <div class=\"form-group input-group\">\r\n" + 
				"    	<div class=\"input-group-prepend\">\r\n" + 
				"		    <span class=\"input-group-text\"> <i class=\"fa fa-lock\"></i> </span>\r\n" + 
				"		</div>\r\n" + 
				"        <input class=\"form-control\" placeholder=\"powtórz has³o\" type=\"password\">\r\n" + 
				"    </div> <!-- form-group// -->                                      \r\n" + 
				"    <div class=\"form-group\">\r\n" + 
				"        <button type=\"submit\" class=\"btn btn-primary btn-block\"> Za³ó¿ konto! </button>\r\n" + 
				"    </div> <!-- form-group// -->      \r\n" + 
				"    <p class=\"text-center\">Posiadasz ju¿ konto? <a href=\"login.html\">Zaloguj siê</a> </p>                                                                 \r\n" + 
				"</form>\r\n" + 
				"</article>\r\n" + 
				"</div> <!-- card.// -->\r\n" + 
				"\r\n" + 
				"</div> \r\n" + 
				"<!--container end.//-->\r\n" + 
				"\r\n" + 
				"<br><br>");
	}
}
