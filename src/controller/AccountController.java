package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;


@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = AccountServiceImpl.getInstance();
		String cmd = request.getParameter("cmd");
		cmd =(cmd==null)?"move":cmd;
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1,request.getServletPath().indexOf("."));
		String dest = request.getParameter("dest");
		if(dest==null) {page="NONE";}
		}
		String dest = request.getParameter("dest");
		if(dest==null) {dest="NONE";}
		HttpSession session = request.getSession();
		switch(cmd) {
		case"open-account":
			String money = request.getParameter("money");
			accountService.openAccount(Integer.parseInt(money));
			AccountBean account = AccountServiceImpl.getInstance().findByAccountNum("");
			request.setAttribute("dest", dest);
			session.setAttribute("account", account);
			break;
		case"move" :
			request.setAttribute("dest", dest);
			break;
		case"account-detail":
			
			break;
		case"findAllAccountNum":
			AccountServiceImpl.getInstance().findAllAccountNums();
			break;
		case"findByAccountNum":
			String accountNum =request.getParameter("accountNum");
			AccountServiceImpl.getInstance().findByAccountNum(accountNum);
			break;
		case"countAccount":
			AccountServiceImpl.getInstance().createAccountNum();
			break;
		case"deposit":
			money = request.getParameter("money");
			AccountServiceImpl.getInstance().updateDeposit(Integer.parseInt(money));
			break;
		case"withdraw":
			money = request.getParameter("money");
			AccountServiceImpl.getInstance().updateDeposit(Integer.parseInt(money));
			break;
		case"delet":
			accountNum = request.getParameter("accountNum");
			AccountServiceImpl.getInstance().removeAccountNum(accountNum);
			break;
		}
		Command.move(request, response, dir, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
