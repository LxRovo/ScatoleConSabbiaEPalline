/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import static java.lang.Math.sin;

/**
 *
 * @author peppe
 */
public class Pallina {
    private int rag;
    private float xpos;
    private float ypos;
    private double velx;
    private int xdirection;
    private int widthScreen;
    private int heightScreen;
    private DatiCondivisi ptrdati;
    
    public Pallina(int rag,double velx){
        this.rag= rag;
        this.velx=velx;
        xpos = 0;
        widthScreen = 0;
        heightScreen = 0;
        xdirection=0;
    }
    
    public void aggiornaInformazioni(double vx){
        xpos=xpos+(float)(9.8*sin(ptrdati.getInclinazioneXScatola())); 
    }
    
    public float getXpos() {
        return xpos;
    }
    public float getYpos() {
        return ypos;
    }
}
