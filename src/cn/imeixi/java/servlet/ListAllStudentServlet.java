package cn.imeixi.java.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.imeixi.java.pojo.StudentDao;
import cn.imeixi.java.pojo.Student;

/**
 * Servlet implementation class ListAllStudent
 */
@WebServlet("/listAllStudent")
public class ListAllStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListAllStudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.getAll();
		
		request.setAttribute("students", students);
		request.getRequestDispatcher("/showStudent.jsp").forward(request, response);
	
	}

}
