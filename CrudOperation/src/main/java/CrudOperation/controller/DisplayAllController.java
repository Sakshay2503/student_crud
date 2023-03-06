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

@WebServlet("/displayAllRecords")
public class DisplayAllController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DataBase dataBase = new DataBase();
		List<Details> list = dataBase.getAll();

		RequestDispatcher dispatcher = req.getRequestDispatcher("displayAllpage.jsp");
		req.setAttribute("details", list);
		dispatcher.forward(req, resp);
	}

}
