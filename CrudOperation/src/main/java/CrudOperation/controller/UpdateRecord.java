package CrudOperation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CrudOperation.dao.DataBase;
import CrudOperation.dto.Details;

@WebServlet("/updaterecord")
public class UpdateRecord extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id=Integer.parseInt(req.getParameter("id")) ;
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String  phone= req.getParameter("phone");
		Details details=new Details();
		details.setId(id);
		details.setName(name);
		details.setAddress(address);
		details.setPhone(phone);
		DataBase db=new DataBase();
		db.update(details);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("displayAllpage.jsp");
		req.setAttribute("details", db.getAll());
		dispatcher.forward(req, resp);
		
	}

}
