/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mattia
 */
public class DatiCondivisi {

    private int numRows;//Attributo contenente il numero di righe della matrice
    private int numCols;//Attributo contenente il numero di colonne della matrice
    private ThScatola[][] scatole;//Attributo che permette di impostare il numero di scatole presenti
    private final boolean running;//Attributo che indica lo stato di funzionamento del programma
    private Pallina p;//Attributo contenente la pallina
    private float minX;//Attributo contenente il valore minimo dove la sabbia può andare sull'asse X
    private float maxX;//Attributo contenente il valore massimo dove la sabbia può andare sull'asse X
    private Semaphore sem1;//Semaforo utilizzato per sincronizzare lo SwingGui e la Pallina
    private Sensore sens;//

    /**
     * @author Mattia
     * @brief Costruttore che imposta il valore running a true e il Semaforo a 0
     */
    public DatiCondivisi() {
        this.running = true;
        sem1 = new Semaphore(0);
        sens = new Sensore();
    }

    /**
     * @author Mattia
     * @brief Metodo per impostare a 0 l'inclinazione delle scatole
     */
    /**
     * @author Mattia
     * @brief Metodo per controllare lo stato del programma
     * @return running
     */
    public boolean isRunning() {
        return running;
    }

    public synchronized ThScatola getThScatola(int i, int j) {
        return scatole[i][j];
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
        this.minX = minX;
    }

    public synchronized void setMaxX(float maxX) {
        this.maxX = maxX;
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

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public synchronized Sensore getSens() {
        return sens;
    }

    public void signalSem1() {
        sem1.release();
    }

    public void waitSem1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
