package com.hcl.leave;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int user=Integer.parseInt(request.getParameter("EMP_ID"));
		String pwd=request.getParameter("secretcode");
		boolean result=LoginDAO.authenticate(user, pwd);
		if(result==true) {
			HttpSession session=request.getSession(true);
			session.setAttribute("EMP_ID", user);
			session.setAttribute("SecretCode",pwd);
			RequestDispatcher disp=request.getRequestDispatcher("menu.html");
			disp.forward(request, response);
		} else {
			PrintWriter out=response.getWriter();
			out.println("Sorry Invalid User Credentails...Please Re-Enter");
			RequestDispatcher disp=request.getRequestDispatcher("loginpage.html");
			disp.include(request, response);
		}
	}
	}


