package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;


@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("홈으로옴");
		String cmd = request.getParameter("cmd");
		cmd =(cmd==null)?"move":cmd;
		System.out.println("cmd ="+cmd);
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		System.out.println("page="+page);
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1,request.getServletPath().indexOf("."));
			
		}
		System.out.println("dir"+dir);
		switch(cmd) {
		case"move" :
			Command.move(request, response, dir,page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
