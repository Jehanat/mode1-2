package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 /** Servlet implementation class AddStockIdServlet
 */
public class AddStockIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStockIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Stock objStock=new Stock();
		String stockid=new StockDAO().generateStockidDao();
		objStock.setStockid(stockid);
		objStock.setItemName(request.getParameter("ItemName"));
		int Price=Integer.parseInt(request.getParameter("Price"));
		objStock.setPrice(Price);
		int QuantityAvail=Integer.parseInt(request.getParameter("QuantityAvail"));
		objStock.setQuantityAvail(QuantityAvail);
		
		String result=StockBAL.addStockidBal(objStock);

		PrintWriter out=response.getWriter();
		out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
