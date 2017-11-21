package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyConnectDB;

/**
 * Servlet implementation class SuaTK
 */
@WebServlet("/SuaTK")
public class SuaTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id="";
	String name="";
	String message="";
       
    public SuaTK() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stt=request.getParameter("stt");
		Integer x=Integer.parseInt(stt);
		ResultSet rs;
		try {
			rs = new MyConnectDB().chonDuLieuTuDTB("select * from GuestBook where stt='"+x+"'");
			while(rs.next()){
				id=rs.getString(2);
				name=rs.getString(3);
				message=rs.getString(4);
			}
			response.setContentType("text/html");
			ServletContext context = getServletContext();
			context.setAttribute("stt", stt);
			context.setAttribute("ID", id);
			context.setAttribute("name", name);
			context.setAttribute("message", message);
			
			
			response.sendRedirect("SuaTaiKhoan.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("ID");
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		response.setContentType("text/html");
		ServletContext context = getServletContext();
		Integer stt=(Integer) context.getAttribute("stt");
		
		
		try {
			new MyConnectDB().thucThiCauLenhSQL("update GuestBook set stt='"+stt+"',ID='"+id+"',Ten='"+name+"',message='"+message+"' where stt='"+stt+"'");
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
