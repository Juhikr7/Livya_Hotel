package test;

import java.io.Serializable;

public class LivyaUserBean implements Serializable {
    private String uName,pword,fName,lName,addr,mId;
    private long adhar,phno;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public long getAdhar() {
        return adhar;
    }

    public void setAdhar(long adhar) {
        this.adhar = adhar;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "LivyaUserBean{" +
                "uName='" + uName + '\'' +
                ", pword='" + pword + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", addr='" + addr + '\'' +
                ", mId='" + mId + '\'' +
                ", adhar=" + adhar +
                ", phno=" + phno +
                '}';
    }
}
