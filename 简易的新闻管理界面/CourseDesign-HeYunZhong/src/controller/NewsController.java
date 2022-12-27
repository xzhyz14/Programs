package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.News;
import bean.User;
import dao.NewsDao;

/**
 * Servlet implementation class NewsController
 */
@WebServlet("/NewsController")
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewsController() {
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
		// 创建或者获取保存用户信息的Session对象
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			// 创建Cookie存放Session的标识号
			Cookie cookie = new Cookie("xiaoMing", session.getId());
			response.addCookie(cookie);
		}

		String op = request.getParameter("op");
		if (op == null) {
			NewsDao nd = new NewsDao();
			ArrayList<News> list = nd.findAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/main.jsp").forward(request, response);
			return;
		}
		if (op.equals("delete")) {
			NewsDao nd = new NewsDao();
			String id = request.getParameter("id");
			nd.delete(Integer.parseInt(id));
			response.sendRedirect("/CourseDesign-HeYunZhong/NewsController");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	
		NewsDao nd = new NewsDao();
		String op = request.getParameter("op");
		if (op.equals("insert")) {
			String strId = request.getParameter("id");
			String title = request.getParameter("title");
			String source = request.getParameter("source");
			String content = request.getParameter("content");
			String strDate = request.getParameter("date");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				int id = Integer.parseInt(strId);
				Date date = sdf.parse(strDate);
				News news = new News();
				news.setId(id);
				news.setTitle(title);
				news.setSource(source);
				news.setContent(content);
				news.setDate(date);
				nd.insert(news);
				response.sendRedirect("/CourseDesign-HeYunZhong/NewsController");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (op.equals("update")) {
			String strId = request.getParameter("id");
			String title = request.getParameter("title");
			String source = request.getParameter("source");
			String content = request.getParameter("content");
			String strDate = request.getParameter("date");
			System.out.println(strDate);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				int id = Integer.parseInt(strId);
				Date date = sdf.parse(strDate);
				News news = new News(id,title,source,content,date);
				nd.update(news);
				response.sendRedirect("NewsController");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (op.equals("find")) {
			System.out.println("find");
			String title = request.getParameter("title");
			ArrayList<News> list = nd.findByTitle(title);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		}

	}

}
