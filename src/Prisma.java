/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Prisma extends Segitiga{
    private int tinggip;
    private double volum;

    public int getTinggip() {
        return tinggip;
    }

    public void setTinggip(int tinggip) {
        this.tinggip = tinggip;
    }

    public double getVolum() {
        return volum;
    }

    public void setVolum() {
        this.volum = super.getLuas()*tinggip;
    }
    
    
}
