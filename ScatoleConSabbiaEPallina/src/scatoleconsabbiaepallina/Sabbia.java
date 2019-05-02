
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
    PImage img;
    DatiCondivisi dati;

    public Sabbia(float volume, float posX, float posY, DatiCondivisi dati) {
        this.volume = volume;
        this.accellerazione = 0;
        this.posX = posX;
        this.posY = posY;
        img= loadImage("sabbia.jpg");
        img.resize(640, 360);
        this.dati = dati;
    }

    @Override
    public void draw() 
    {
    image(img, posX, posY);
    }
      
    

    public void aggiornaInfo()
    {
    double x = Math.toRadians(dati.getInclinazioneX());   
    accellerazione = (float) (9.8 * Math.sin(x));
    posX= posX+accellerazione;
    draw();
        
    
    
    }

   


}
