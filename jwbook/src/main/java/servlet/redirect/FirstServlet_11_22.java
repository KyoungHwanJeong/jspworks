package servlet.redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dir/first")
public class FirstServlet_11_22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet_11_22() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		
		// Redirect 방법
		//response.sendRedirect("second"); : SecondServlet의 내용을 보여주고 
		//									경로(url)가 SecondServlet의 위치로 바뀐다
		//두 번째 경로 요청
		response.sendRedirect("second");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
