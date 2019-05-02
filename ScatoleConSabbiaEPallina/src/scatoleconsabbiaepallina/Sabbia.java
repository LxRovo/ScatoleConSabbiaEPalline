
package scatoleconsabbiaepallina;

import processing.core.PImage;
import java.lang.*;
/**
 *
 * @author alessandro_purita
 */
public class Sabbia {
    
    private int volume;
    private int accellerazione;
    private int posX;
    PImage img;
    DatiCondivisi dati;

    public Sabbia(int volume, int posX, DatiCondivisi dati) {
        this.volume = volume;
        this.accellerazione = 0;
        this.posX = posX;
        img= loadImage("sabbia.jpg");
        this.dati = dati;
    }

    

    

    public int getVolume() 
    {
        return volume;
    }

    public void setVolume(int volume) 
    {
        this.volume = volume;
    }
    void draw() 
    {
    image(img, posX, 0);
}
    

    public void aggiornaInfo()
    {
    double x = Math.toRadians(dati.getInclinazioneXScatola());   
    accellerazione = (int) (9.8 * Math.sin(x));
    posX= posX+accellerazione;
    draw();
        
    
    
    }

   


}
