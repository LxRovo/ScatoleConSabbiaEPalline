/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author Ziz
 */
public class DatiCondivisi {

    
    private int inclinazioneXScatola;
    private int inclinazioneYPallina;
    private int numScatole;
    private boolean running;

    public DatiCondivisi(int numScatole, int inclinazioneXScatola,int inclinazioneYPallina) {
        this.numScatole = numScatole;
        this.inclinazioneXScatola = inclinazioneXScatola;
        this.inclinazioneYPallina= inclinazioneYPallina;
        running = true;
    }

    public synchronized int getNumScatole() {

        return numScatole;

    }

    public synchronized int getInclinazioneXScatola() {

        return inclinazioneXScatola;

    }
    
    
    public synchronized int getInclinazioneYPallina() {

        return inclinazioneYPallina;

    }
    
     public synchronized void setNumScatole(int numScatole) {

       this.numScatole=numScatole;

    }

    public synchronized void setInclinazioneXScatola(int inclinazioneXScatola) {

        this.inclinazioneXScatola = inclinazioneXScatola;

    }
    
     public synchronized void setInclinazioneYPallina(int inclinazioneYPallina) {

        this.inclinazioneYPallina = inclinazioneYPallina;

    }
    
    
    

    public boolean isRunning() {
        return running;
    }

}
