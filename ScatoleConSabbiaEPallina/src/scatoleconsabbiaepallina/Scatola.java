/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author alessandro_purita
 */
public class Scatola {
    
    private int x;
    private int y;
    private double larghezza;
    private double altezza;
    private double lunghezza;

    

    
    static Sabbia s;
    //static Pallina p;

    public Scatola(int x, int y, double larghezza, double altezza,double lunghezza) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.lunghezza= lunghezza;
    }
    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }
public double getLunghezza() {
        return lunghezza;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
   private void visualizzaSabbia()
  {



 }
   public void visualizzaPallina()
  {



 }
    public void aggiorna(int inclinazioneX,int inclinazioneY)
    {
    this.x=inclinazioneX;
    this.y=inclinazioneY;
    
    
    }
    public void simulaMovimento(int inclinazioneX,int inclinazioneY)
    {
    
        
    }
    
    
}
