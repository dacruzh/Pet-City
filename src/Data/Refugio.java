/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ASUS PC
 */
public class Refugio extends Establecimiento {
    private int donaciones;
    public Refugio(){
       donaciones = 0; 
    }
    public int getDonaciones() {
        return donaciones;
    }
    public void setDonaciones(int donaciones) {
        this.donaciones = donaciones;
    }
}
