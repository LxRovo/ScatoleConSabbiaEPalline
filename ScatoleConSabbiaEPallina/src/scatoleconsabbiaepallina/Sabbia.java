
package scatoleconsabbiaepallina;

import processing.core.PImage;
import processing.core.PApplet;
import java.lang.*;
/**
 *
 * @author alessandro_purita
 */
public class Sabbia extends PApplet  {
    
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
    @Override
    public void draw() 
    {
    image(img, posX, 0);
    }
    

    public void aggiornaInfo()
    {
    double x = Math.toRadians(dati.getInclinazioneX());   
    accellerazione = (int) (9.8 * Math.sin(x));
    posX= posX+accellerazione;
    draw();
        
    
    
    }

   


}
