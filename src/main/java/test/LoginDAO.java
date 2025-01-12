package test;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public LivyaUserBean livyaUserBean=null;
    public LivyaUserBean login(HttpServletRequest req){
        try{
            Connection con = DBConnection.getCon();
            PreparedStatement ps = con.prepareStatement("select * from LivyaUser where uname=? and pword=?");
            ps.setString(1,req.getParameter("uname"));
            ps.setString(2,req.getParameter("pword"));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                LivyaUserBean livyaUserBean= new LivyaUserBean();
                livyaUserBean.setuName(rs.getString(1));
                livyaUserBean.setPword(rs.getString(2));
                livyaUserBean.setfName(rs.getString(3));
                livyaUserBean.setlName(rs.getString(4));
                livyaUserBean.setAddr(rs.getString(5));
                livyaUserBean.setmId(rs.getString(6));
                livyaUserBean.setAdhar(rs.getLong(7));
                livyaUserBean.setPhno(rs.getLong(8));
                this.livyaUserBean=livyaUserBean;
//                System.out.println("Obj initialised...");
            }
            else {
                System.out.println("Error..");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
//        System.out.println(livyaUserBean);
        return livyaUserBean;
    }
}
