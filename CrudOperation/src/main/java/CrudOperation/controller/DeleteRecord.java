package CrudOperation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CrudOperation.dao.DataBase;
import CrudOperation.dto.Details;

@WebServlet("/deleteid")
public class DeleteRecord extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("deleteid"));
		 
		 DataBase base=new DataBase();
		 		
	    
	     base.delete(id);
	     
	     
	     List<Details> list=base.getAll();
	     
	     RequestDispatcher dispatcher=req.getRequestDispatcher("displayAllpage.jsp");
	     req.setAttribute("details",list);
	     dispatcher.forward(req, resp);
	     
	}
}
