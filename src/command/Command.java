package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {

	public static void move(HttpServletRequest request, HttpServletResponse response,String dir,String page)throws ServletException, IOException {
		request.getRequestDispatcher((page.equals("index"))?"index"+Constant.JSP:
			Constant.VIEW + dir+"/"+page + Constant.JSP).forward(request, response);
	}
	
		
	
	
}
