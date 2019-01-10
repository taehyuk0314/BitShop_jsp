package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import command.Command;
import domain.MemberBean;
import service.MemberServiceImpl;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		System.out.println("멤버서블릿으로 들어옴");
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1,request.getServletPath().indexOf("."));
		}
		switch((cmd==null)?"move":cmd) {
		case"login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			if(!(id.equals("aa")&&pass.equals("aa"))){
				dir ="";
				page="index";
			}
			Command.move(request, response, dir,page);
			break;
		case"move":
			System.out.println("여긴왔냐");
			String dest=request.getParameter("dest");
			if(dest==null) {
				dest="NONE";
			}
			request.setAttribute("dest",dest);
			Command.move(request, response, dir,page);
			break;
		case"join":
			System.out.println("여기까진 왔나?");
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			request.setAttribute("dest", "mypage");
			request.setAttribute("member", member);
			Command.move(request, response, dir,page);
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
		case"exist":
			id=request.getParameter("id");
			pass=request.getParameter("pass");
			MemberServiceImpl.getInstance().existMember(id, pass);
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
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
