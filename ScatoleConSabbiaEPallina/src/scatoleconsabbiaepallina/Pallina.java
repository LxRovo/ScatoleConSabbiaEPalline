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
    private DatiCondivisi ptrdati;
    
    public Pallina(int rag,float xpos,float ypos){
        this.rag= rag;
        this.xpos = xpos;
        this.ypos=ypos;
    }
    
    public void aggiornaInformazioni(){
        xpos=xpos+(float)(9.8*sin(ptrdati.getInclinazioneXScatola())); 
    }
    
    public float getXpos() {
        return xpos;
    }
    public float getYpos() {
        return ypos;
    }
    public float getRag() {
        return rag;
    }
}
