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

    private int numRows;//Attributo contenente il numero di righe della matrice
    private int numCols;//Attributo contenente il numero di colonne della matrice
    private ThScatola [][] scatole;//Attributo che permette di impostare il numero di scatole presenti
    private float inclinazioneX;//Attributo contenente il valore dell'inclinazione
    private final boolean running;//Attributo che indica lo stato di funzionamento del programma
    private Pallina p;//Attributo contenente la pallina
    private float minX;//Attributo contenente il valore minimo dove la sabbia può andare sull'asse X
    private float maxX;//Attributo contenente il valore massimo dove la sabbia può andare sull'asse X
    
    
    
    /**
     * @author Mattia
     * @brief Costruttore che imposta il valore running a true
     */
     public DatiCondivisi() {
        this.running = true;
    }

    public synchronized void setValoreInc(int v) {
        inclinazioneX = v;
    }
    
    /**
     * @author Mattia
     * @brief Metodo per impostare a 0 l'inclinazione delle scatole
     */
    public void resetInc() {
        inclinazioneX = 0;
    }

    public synchronized float getInclinazioneX() {
        return inclinazioneX;
    }
    
    /**
     * @author Mattia
     * @brief Metodo per controllare lo stato del programma
     * @return running
     */
    public boolean isRunning() {
        return running;
    }

    public synchronized ThScatola getThScatola(int i, int j) {
        return scatole [i][j];
    }

    public synchronized void setInclinazione(float inclinazione) {
        this.inclinazioneX = inclinazione;
    }

    public void setScatole(ThScatola[][] scatole) {
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

    public synchronized int getNumRows() {
        return numRows;
    }

    public synchronized int getNumCols() {
        return numCols;
    }

 
    
         
    
    
    

}