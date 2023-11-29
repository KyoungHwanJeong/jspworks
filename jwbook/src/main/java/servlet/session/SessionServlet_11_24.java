package servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session1")	//웹 페이지 경로 - http://localhost:8080/jwbook/session1
public class SessionServlet_11_24 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SessionServlet_11_24() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//세션 사용하기
		HttpSession session = request.getSession();
		// getId() : 세션 아이디를 얻어오는 메소드
		System.out.println("세션 아이디: " + session.getId());
		// getCreationTime() : 세션 생성 시간 1970.1.1 부터 현재까지의 초, 단위: ms
		System.out.println("최초 세션 생성 시간: "+ new Date(session.getCreationTime()));
		System.out.println("세션 유효 시간: "+ session.getMaxInactiveInterval() + "초");
		System.out.println("웹 브라우저가 마지막으로 세션에 접근한 시간: "+ new Date(session.getLastAccessedTime()));
		//세션 유효시간 변경 10분
		session.setMaxInactiveInterval(10*60);
		System.out.println("세션 유효 시간(갱신 후): "+ session.getMaxInactiveInterval() + "초");
	
		//브라우저에 text/html을 보내기
		response.setContentType("text/html; charset=utf-8");
		// 웹 브라우저에 표시하기
		PrintWriter out = response.getWriter();
		out.println("세션 아이디: " + session.getId() + "<br>");
		out.println("최초 세션 생성 시간: "+ new Date(session.getCreationTime()) + "<br>");
		out.println("세션 유효 시간: "+ session.getMaxInactiveInterval() + "초<br>");
		out.println("웹 브라우저가 마지막으로 세션에 접근한 시간: "+ new Date(session.getLastAccessedTime()));

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
