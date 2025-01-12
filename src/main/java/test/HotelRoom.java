package test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/room")
public class HotelRoom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw= res.getWriter();
        res.setContentType("text/html");
        HttpSession hs = req.getSession(false);
        if(hs==null){
            pw.println("Session expired....<br>");
            RequestDispatcher rd = req.getRequestDispatcher("livyahome.html");
            rd.include(req,res);
        }else {
            LivyaUserBean livyaUserBean = (LivyaUserBean)req.getAttribute("livyaUserBean");
            pw.println("Order Your Rooms Here..."+livyaUserBean.getfName()+"<br><br>");
            RequestDispatcher rd = req.getRequestDispatcher("roomcategory.html");
            rd.include(req,res);
        }
    }
}
