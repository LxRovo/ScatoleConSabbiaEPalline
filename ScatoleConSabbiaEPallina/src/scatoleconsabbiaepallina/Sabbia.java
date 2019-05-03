
package scatoleconsabbiaepallina;

import processing.core.PImage;
import processing.core.PApplet;
import java.lang.*;
/**
 *
 * @author alessandro_purita
 */
public class Sabbia extends PApplet  {
    
    private float volume;
    private float accellerazione;
    private float posX;
    private float posY;

    

    
   
    DatiCondivisi dati;

    public Sabbia(float volume, float posX, float posY, DatiCondivisi dati) {
        this.volume = volume;
        this.accellerazione = 0;
        this.posX = posX;
        this.posY = posY;
        
        this.dati = dati;
    }
public float getVolume() {
        return volume;
    }

    public float getAccellerazione() {
        return accellerazione;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setAccellerazione(float accellerazione) {
        this.accellerazione = accellerazione;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }
    public void draw(float larghezza, float lunghezza) 
    {
    
    fill(204, 102, 0);
        
    rect(posX, posY, larghezza+ posX,lunghezza+ posY);
    
    }
      
    

    public void aggiornaInfo(float larghezza, float lunghezza)
    {
    double x = Math.toRadians(dati.getInclinazioneX());   
    accellerazione = (float) (9.8 * Math.sin(x));
    posX= posX+accellerazione;
    
    draw(larghezza,lunghezza);
        
    
    
    }

   


}
