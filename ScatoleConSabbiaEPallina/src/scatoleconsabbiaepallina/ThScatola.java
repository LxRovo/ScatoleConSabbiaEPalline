/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author rovelli_andrea
 */
public class ThScatola extends Thread {

    private final float altezza;
    private final float lunghezza;
    private final float larghezza;
    private final float raggioFinestre;
    private float x;
    private float y;
    private DatiCondivisi ptrDati;
    private Sabbia sabbia;

    public ThScatola(float altezza, float x, float y, float lunghezza, float larghezza, DatiCondivisi ptrDati) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.raggioFinestre = 20;
        this.x = x;
        this.y = y;
        this.ptrDati = ptrDati;
        
    }
    
    @Override
    public void run(){
    
        sabbia.move();
    
    }
    

    public float getAltezza() {
        return altezza;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public float getRaggioFinestre() {
        return raggioFinestre;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Sabbia getSabbia() {
        return sabbia;
    }
    
    

}
