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

@WebServlet("/update")
public class UpdateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("updateid"));
		System.out.println("-------id to update------"+id);
		DataBase dataBase=new DataBase();
		Details details=dataBase.findById(id);
		System.out.println(details.toString());
		RequestDispatcher dispatcher=req.getRequestDispatcher("update.jsp");
		req.setAttribute("details", details);
		dispatcher.forward(req, resp);
	}
}
