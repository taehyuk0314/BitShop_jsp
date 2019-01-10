package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		MemberService memberService = MemberServiceImpl.getInstance();
		System.out.println("멤버서블릿으로 들어옴");
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1,request.getServletPath().indexOf("."));}
		String dest = request.getParameter("dest");
		if(dest==null) {dest=null;}
		switch((cmd==null)?"move":cmd) {
		case"login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			System.out.println("id="+id+ " pass= "+pass);
			boolean loginOk = MemberServiceImpl.getInstance().existMember(id, pass);
			if(loginOk){
				request.setAttribute("dest", "welcome");
				request.setAttribute("member", MemberServiceImpl.getInstance().findMeberById(id));
				System.out.println("로그인성공");
			}else {
				dir ="";
				page="index";
				System.out.println("로그인시패");
			}
			break;
		case"move":
			request.setAttribute("dest",dest);
			break;
		case"join":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			member = MemberServiceImpl.getInstance().findMeberById(member.getId());
			request.setAttribute("member", member);
			System.out.println("조회결과"+member.toString());
			request.setAttribute("dest", request.getAttribute("dest"));
			break;
		case"logout":
			dir="";
			page="index";
			dest="";
			break;
		case"findAll":
			MemberServiceImpl.getInstance().findAllMebers();
			break;
		case"findByName":
			String name=request.getParameter("name");
			MemberServiceImpl.getInstance().findMembersByName(name);
			break;
		case"findById":
			id = request.getParameter("id");
			MemberServiceImpl.getInstance().findMeberById(id);
			break;
		case"count":
			MemberServiceImpl.getInstance().countMembers();
			break;
		case"update":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().changePass(member);
			break;
		case"delet":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().removeMember(member);
			break;
		}
		Command.move(request, response, dir,page);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
