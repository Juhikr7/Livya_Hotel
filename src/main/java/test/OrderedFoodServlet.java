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

@WebServlet("/order")
public class OrderedFoodServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        HttpSession hs=req.getSession(false);
        LivyaUserBean livyaUserBean= (LivyaUserBean) hs.getAttribute("livyaUserBean");
        if (hs==null){
            pw.println("Session Expired....");
            RequestDispatcher rd = req.getRequestDispatcher("livyahome.html");
            rd.include(req,res);
        }else {
            OrderUserBean oub= new OrderUserBean(req);
            hs.setAttribute("oub",oub);
//            pw.println();
//            pw.println(oub);
            RequestDispatcher rd= req.getRequestDispatcher("bill");
            rd.forward(req,res);
        }
    }
}
