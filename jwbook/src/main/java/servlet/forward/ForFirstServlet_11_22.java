package servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ForFirstServlet_11_22", urlPatterns = { "/for/first" })
public class ForFirstServlet_11_22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ForFirstServlet_11_22() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("second?name=대한민국");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
