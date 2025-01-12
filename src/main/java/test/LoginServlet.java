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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try{
            PrintWriter pw= res.getWriter();
            res.setContentType("text/html");
            LivyaUserBean livyaUserBean = new LoginDAO().login(req);//why null
            if (livyaUserBean==null){
                pw.println("Invalid Login Process..");
                RequestDispatcher rd= req.getRequestDispatcher("livyahome.html");
                rd.include(req,res);
            }
            else {
                HttpSession hs= req.getSession();
                hs.setAttribute("livyaUserBean",livyaUserBean);
                pw.println("Welcome "+livyaUserBean.getfName()+"<br><br>");
                RequestDispatcher rd = req.getRequestDispatcher("catogery.html");
                rd.include(req,res);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
