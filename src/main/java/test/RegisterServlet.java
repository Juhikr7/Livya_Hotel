package test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       try{
           PrintWriter pw = res.getWriter();
           res.setContentType("text/html");
           LivyaUserBean livyaUserBean = new LivyaUserBean();
           livyaUserBean.setuName(req.getParameter("uname"));
           livyaUserBean.setPword(req.getParameter("pword"));
           livyaUserBean.setfName(req.getParameter("fname"));
           livyaUserBean.setlName(req.getParameter("lname"));
           livyaUserBean.setAddr(req.getParameter("addr"));
           livyaUserBean.setmId(req.getParameter("mid"));
           livyaUserBean.setAdhar(Long.parseLong(req.getParameter("adhar")));
           livyaUserBean.setPhno(Long.parseLong(req.getParameter("phno")));
          // pw.println(livyaUserBean);
            int k = new RegisterDAO().register(livyaUserBean);

            if (k>0){
                pw.println("User Register Successfully...");
            }
       }catch (Exception e){
           e.printStackTrace();
       }
        RequestDispatcher rd = req.getRequestDispatcher("livyahome.html");
        rd.include(req,res);

    }
}
