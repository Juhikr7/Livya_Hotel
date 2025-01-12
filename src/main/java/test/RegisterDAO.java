package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
public int k =0;
public int register (LivyaUserBean livyaUserBean){
    try {
        Connection con= DBConnection.getCon();
        PreparedStatement ps = con.prepareStatement("insert into LivyaUser values (?,?,?,?,?,?,?,?)");
        ps.setString(1,livyaUserBean.getuName());
        ps.setString(2,livyaUserBean.getPword());
        ps.setString(3,livyaUserBean.getfName());
        ps.setString(4,livyaUserBean.getlName());
        ps.setString(5,livyaUserBean.getAddr());
        ps.setString(6,livyaUserBean.getmId());
        ps.setLong(7,livyaUserBean.getAdhar());
        ps.setLong(8,livyaUserBean.getPhno());
        k = ps.executeUpdate();
    }catch (Exception e){
        e.printStackTrace();
    }
    return k;
}
}
