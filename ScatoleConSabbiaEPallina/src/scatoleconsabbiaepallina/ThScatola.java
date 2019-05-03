/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rovelli_andrea
 */
public class ThScatola extends Thread {

    private final float altezza;
    private final float lunghezza;
    private final float larghezza;
    private final float raggioFinestre;
    private final float x;
    private final float y;
    private final DatiCondivisi ptrDati;
    private final Sabbia sabbia;

    public ThScatola(float altezza, float x, float y, float lunghezza, float larghezza,Sabbia sabbia, DatiCondivisi ptrDati) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.raggioFinestre = 20;
        this.x = x;
        this.y = y;
        this.ptrDati = ptrDati;
        this.sabbia = sabbia;
    }

    @Override
    public void run() {

            sabbia.aggiornaInfo(larghezza,lunghezza);
        try {
            Thread.sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThScatola.class.getName()).log(Level.SEVERE, null, ex);
        }
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
