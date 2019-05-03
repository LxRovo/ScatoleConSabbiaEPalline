/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.util.Vector;

/**
 *
 * @author Mattia
 */
public class DatiCondivisi {

    private Vector<ThScatola> scatole; //Vettore contenente le scatole
    private float inclinazioneX;//Attributo contenente il valore dell'inclinazione
    private final boolean running;//Attributo che indica lo stato di funzionamento del programma
    private Pallina p;//Attributo che contiene la pallina
    private float minX;//Attributo che contiene il valore minimo dell'inclinazione
    private float maxX;//Attributo che contiene il valore massimo dell'inclinazione
    /**
     * @author Mattia
     * Costruttore che imposta il valore running a true
     */
     public DatiCondivisi() {
        this.running = true;
    }

    public synchronized void setValoreInc(int v) {
        inclinazioneX = v;
    }
    
    public synchronized Vector<ThScatola> getScatole(){
        return scatole;
    }
    
    /**
     * @author Mattia
     * Metodo per impostare a 0 l'inclinazione delle scatole
     */
    public void resetInc() {
        inclinazioneX = 0;
    }

    public synchronized float getInclinazioneX() {
        return inclinazioneX;
    }
    
    /**
     * @author Mattia
     * Metodo per controllare lo stato del programma
     * @return running
     */
    public boolean isRunning() {
        return running;
    }

    public synchronized ThScatola getThScatola(int index) {
        return scatole.get(index);
    }

    public synchronized void setInclinazione(float inclinazione) {
        this.inclinazioneX = inclinazione;
    }

    public synchronized void setScatole(Vector<ThScatola> scatole) {
        this.scatole = scatole;
    }

    public Pallina getP() {
        return p;
    }

    public synchronized void setP(Pallina p) {
        this.p = p;
    }
    
    public synchronized void setMinX(float minX) {
        this.minX=minX;
    }
    
      public synchronized void setMaxX(float maxX) {
        this.maxX=maxX;
    }
      
      public synchronized float getMinX() {
        return minX;
    }
         public synchronized float getMaxX() {
        return maxX;
    }
      
    
    
    

}
