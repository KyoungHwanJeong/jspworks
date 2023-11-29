package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class DataController_11_27 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataController_11_27() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//변수
		String season = "가을";
		
		//배열
		String[] seasons = {"봄", "여름", "가을", "겨울"};
		
		//HashMap 자료 - key: value
		Map<String, Object> car = new HashMap<>();
		car.put("brand", "Sonata");
		car.put("cc", 3000);
		
		//모델(Model)
		request.setAttribute("season", season);
		request.setAttribute("seasons", seasons);
		request.setAttribute("car", car);
		
		//모델 전송 및 페이지 이동 - view(화면) 페이지로 전송
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/mvc/mvc01_11_27.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
