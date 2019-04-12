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
    
    private int numScatole;
    private boolean running;

    public DatiCondivisi(int numScatole) {
        this.numScatole = numScatole;
        running = true;
    }
    
    public synchronized int getNumScatole(){
    
        return numScatole;
        
    }

    public boolean isRunning() {
        return running;
    }
    
    
}
