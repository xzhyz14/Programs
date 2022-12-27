package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		
		UserDao ud = new UserDao();
		ArrayList<User> list = ud.findAllUser();

		String emali =  request.getParameter("email");
		String pwd =  request.getParameter("pwd");
		
		System.out.println(emali);
		System.out.println(pwd);
		
		boolean login = false;
		if(emali != null && pwd != null) {
			for(User temp : list) {
				if(temp.getEmail().equals(emali) && temp.getPassword().equals(pwd)) {
					login = true;
					User user = new User(pwd,emali);
					request.getSession().setAttribute("user", user);
					response.sendRedirect("/CourseDesign-HeYunZhong/NewsController");
					break;
				}
			}
			if(login == false) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			 request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
