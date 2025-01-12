package test;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class OrderUserBean implements Serializable {
    int chikenLolipop ;//= Integer.parseInt(req.getParameter("cl"));
    int chikenCrispy ;//= Integer.parseInt(req.getParameter("cc"));
    int chikenButterMasala;// = Integer.parseInt(req.getParameter("cbm"));
    int chickenHydrabadi ;//= Integer.parseInt(req.getParameter("ch"));
    int iceCream ;//= Integer.parseInt(req.getParameter("ic"));
    int hotGulabJamun;// = Integer.parseInt(req.getParameter("hgj"));
    public OrderUserBean(HttpServletRequest req){
        this.chikenLolipop = Integer.parseInt(req.getParameter("cl"));
        this.chikenCrispy = Integer.parseInt(req.getParameter("cc"));
        this.chikenButterMasala = Integer.parseInt(req.getParameter("cbm"));
        this.chickenHydrabadi = Integer.parseInt(req.getParameter("ch"));
        this.iceCream = Integer.parseInt(req.getParameter("ic"));
        this.hotGulabJamun = Integer.parseInt(req.getParameter("hgj"));
    }

    public int getChikenLolipop() {
        return chikenLolipop;
    }

    public void setChikenLolipop(int chikenLolipop) {
        this.chikenLolipop = chikenLolipop;
    }

    public int getChikenCrispy() {
        return chikenCrispy;
    }

    public void setChikenCrispy(int chikenCrispy) {
        this.chikenCrispy = chikenCrispy;
    }

    public int getChikenButterMasala() {
        return chikenButterMasala;
    }

    public void setChikenButterMasala(int chikenButterMasala) {
        this.chikenButterMasala = chikenButterMasala;
    }

    public int getChickenHydrabadi() {
        return chickenHydrabadi;
    }

    public void setChickenHydrabadi(int chickenHydrabadi) {
        this.chickenHydrabadi = chickenHydrabadi;
    }

    public int getIceCream() {
        return iceCream;
    }

    public void setIceCream(int iceCream) {
        this.iceCream = iceCream;
    }

    public int getHotGulabJamun() {
        return hotGulabJamun;
    }

    public void setHotGulabJamun(int hotGulabJamun) {
        this.hotGulabJamun = hotGulabJamun;
    }

    @Override
    public String toString() {
        return "OrderUserBean{" +
                "chikenLolipop=" + chikenLolipop +
                ", chikenCrispy=" + chikenCrispy +
                ", chikenButterMasala=" + chikenButterMasala +
                ", chickenHydrabadi=" + chickenHydrabadi +
                ", iceCream=" + iceCream +
                ", hotGulabJamun=" + hotGulabJamun +
                '}';
    }
}
