package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;


@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = new AccountServiceImpl();
		String cmd = request.getParameter("cmd");
		cmd =(cmd==null)?"move":cmd;
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1,request.getServletPath().indexOf("."));
			
		}
		switch(cmd) {
		case"open-account":
			String money = request.getParameter("money");
			String accountNum =accountService.joinAccount(Integer.parseInt(money));
			AccountBean account = accountService.findByAccountNum(accountNum);
			String dest = request.getParameter("dest");
			if(dest==null) {
				dest="NONE";
			}
			request.setAttribute("dest", dest);
			request.setAttribute("account", account);
			Command.move(request, response, dir, page);
			break;
		case"move" :
			dest = request.getParameter("dest");
			if(dest==null) {
				dest="NONE";
			}
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
