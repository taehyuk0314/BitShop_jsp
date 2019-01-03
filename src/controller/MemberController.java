package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir = request.getServletPath();
			dir = dir.substring(1, dir.indexOf("."));
		}
		switch((cmd==null)?"move":cmd) {
		case"login":
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("멤버서블릿으로 들어옴");
			if(id.equals("aa")&&pass.equals("aa")){
				Command.move(request, response, dir+"/"+page);
			}else {
				Command.move(request, response, "index");
		}
		case"move":
			Command.move(request, response, "member/main");
			break;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
