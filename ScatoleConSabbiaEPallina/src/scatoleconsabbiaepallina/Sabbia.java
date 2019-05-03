
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

    public void draw(ThScatola s) 
    {
    
    fill(204, 102, 0);
        
    rect(posX, posY, s.getLarghezza()+ posX,s.getLunghezza()+ posY);
    
    }
      
    

    public void aggiornaInfo()
    {
    double x = Math.toRadians(dati.getInclinazioneX());   
    accellerazione = (float) (9.8 * Math.sin(x));
    posX= posX+accellerazione;
    draw();
        
    
    
    }

   


}
