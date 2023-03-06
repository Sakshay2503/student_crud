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

@WebServlet("/add")
public class AddDetailsController extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		String  phone= req.getParameter("phone");
		System.out.println(name+" "+address+" "+phone);
		
		
		DataBase dataBase=new DataBase();
		
		Details details=new Details();
		details.setName(name);
		details.setAddress(address);
		details.setPhone(phone);
		dataBase.add(details);
		
		List<Details> list=dataBase.getAll();
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("displayAllpage.jsp");
		req.setAttribute("details", list);
		dispatcher.forward(req, resp);
		
	}

}
