package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Formdao;
import dto.Formdto;

public class Mainclass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("slno");
		int slno=Integer.parseInt(s1);
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		
	Formdao form=new Formdao();
	form.setSlno(slno);
	
	
	
	}

}
