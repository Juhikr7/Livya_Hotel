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

@WebServlet("/bill")
public class FoodBillServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw= res.getWriter();
        res.setContentType("text/html");
        HttpSession hs= req.getSession(false);
        if (hs==null){
            pw.println("Session Expired....");
            RequestDispatcher rd=req.getRequestDispatcher("livyahome.html");
            rd.include(req,res);
        }else {
            OrderUserBean oub = (OrderUserBean) hs.getAttribute("oub");
            pw.println("<h1>Your Bill</h1> ");
            pw.println("Chiken Lollypop - 250rs -"+oub.getChikenLolipop()+"--"+oub.getChikenLolipop()*250+"<br>"+
                    "Crispy Chiken - 250rs -"+oub.getChikenCrispy()+"--"+oub.getChikenCrispy()*220+"<br>"+
                    "Chiken Butter Masala - 350rs -"+oub.getChikenButterMasala()+"--"+oub.getChikenButterMasala()*350+"<br>"+
                    "Chiken Hydrabadi - 330rs -"+oub.getChickenHydrabadi()+"--"+oub.getChickenHydrabadi()*330+"<br>"+
                    "Ice Cream - 99rs -"+oub.getIceCream()+"--"+oub.getIceCream()*99+"<br>"+
                    "Hot Gulab Jamun - 80rs -"+oub.getHotGulabJamun()+"--"+oub.getHotGulabJamun()*80+"<br>");
            pw.println("<br><hr><br> ");
            int total=oub.getChikenLolipop()*250+oub.getChikenCrispy()*220+oub.getChikenButterMasala()*350+oub.getChickenHydrabadi()*330+oub.getIceCream()*99+oub.getHotGulabJamun()*89;
            pw.println("Total Bill is :"+total+"<br><hr>");
        }

    }
}
