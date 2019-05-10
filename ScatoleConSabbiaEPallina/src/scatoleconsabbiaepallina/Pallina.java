/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import static java.lang.Math.sin;

/**
 *
 * @author caliendo_giuseppe
 */
public class Pallina {
    private int rag;  /*indica il raggio della pallina*/
    private float xpos;/*indica la posizione sull'asse x della pallina*/
    private float ypos;/*indica la posizione sull'asse y della pallina*/
    private DatiCondivisi ptrdati;/*puntatore alla classe DatiCondivisi*/
    
    public Pallina(int rag,float xpos,float ypos){
        this.rag= rag;
        this.xpos = xpos;
        this.ypos=ypos;
    }
    /**
     * permette alla pallina di muoversi attraverso le scatole in base alla loro inclinazione
     */
    public void aggiornaInformazioni(){
        xpos=xpos+(float)(9.8*sin(ptrdati.getInclinazioneX())); 
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
