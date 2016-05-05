package cn.imeixi.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.imeixi.java.pojo.StudentDao;

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteStudentServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuId = request.getParameter("stuId");
		
		StudentDao studentDao = new StudentDao();
		studentDao.deleteStudent(Integer.parseInt(stuId));
		
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}


}
