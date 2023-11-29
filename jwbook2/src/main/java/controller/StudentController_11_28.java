package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.StudentDAO_11_28;
import student.Student_11_28;

@WebServlet("*.do")	// '*' 루트 경로 아래에 do로 끝나는 확장자인 파일
public class StudentController_11_28 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    StudentDAO_11_28 sDAO;
	
    public StudentController_11_28() {
    	sDAO = new StudentDAO_11_28();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//한글 인코딩
		request.setCharacterEncoding("utf-8");
		
		//컨텐츠 유형 응답하기
		response.setContentType("text/html; charset=utf-8");
		
		//경로(uri) 설정 - 커맨드패턴(command)
		//http://localhost:8080/student/studentlist.jsp
		//맨 뒤 경로 추출 - lastIndexOf('/'),
		// subString(1, 5) : 1번부터 4번까지 추출한다
		// subString(1): 1번 인덱스부터 문자열의 끝까지 추출한다
		String uri = request.getRequestURI();
		String command = uri.substring(uri.lastIndexOf("/"));
		System.out.println(uri);
		System.out.println(uri.lastIndexOf("/"));	//뒤에서 찾은 것에 0번째 위치에 uri가 있다
		System.out.println(command);
		
		//이동할 페이지
		String nextPage= "";
		
		if(command.equals("/studentlist.do")) {
			List<Student_11_28> students = sDAO.getStudentList();
			//모델 생성
			request.setAttribute("students", students);
			//뷰 페이지로 이동
			nextPage = "/student/studentlist_11_28.jsp";
		}else if(command.equals("/studentform.do")) {
			//학생 등록 폼으로 이동
			nextPage = "/student/studentform_11_28.jsp";
		}else if(command.equals("/insertstudent.do")) {
			//폼에 입력된 데이터 받기
			String username = request.getParameter("username");
			String univ = request.getParameter("univ");
			String birth = request.getParameter("birth");
			String email = request.getParameter("email");
			
			//db에 저장(빈 객체에 데이터를 넣어서 db에 보냄)
			Student_11_28 s = new Student_11_28();
			s.setUsername(username);
			s.setUniv(univ);
			s.setBirth(birth);
			s.setEmail(email);
			
			sDAO.insertStudent(s);
			nextPage = "/studentlist.do";
		}

		RequestDispatcher dispatch = 
				request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
