package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalcController_11_27 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcController_11_27() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//컨텐츠 유형 보내기
		response.setContentType("text/html; charset=utf-8");
		
		//폼에 입력된 데이터 받아오기
		int n1 = Integer.parseInt(request.getParameter("n1"));
		String op = request.getParameter("op");	
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int result = 0;					//계산 결과값
		
		//계산하기
		switch(op) {
		case "+": 
			result=n1+n2; break;
		case "-": 
			result=n1-n2; break;
		case "×": 
			result=n1*n2; break;
		case "÷": 
			result=n1/n2; break;
		}
		
		/*
		 PrintWriter out = response.getWriter();
		 out.append("<html><body><h2>계산기</h2><hr>") .append("<p>계산 결과: " + result +
		 "</body></html>");
		 */
		
		//계산결과 - MVC의 모델(Model): 첫 번째 인자 문자열이 view 페이지로 이동
		// request.setAttribute(): 데이터를 보내기 전에 잠시 저장할 때 쓰인다
		// 왼쪽의 문자열과 result가 있는 jsp의 결과 변수 이름이 같아야 한다
		request.setAttribute("result", result);
		
		//계산 결과를 보내기
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/mvc/calcResult_11_27.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
