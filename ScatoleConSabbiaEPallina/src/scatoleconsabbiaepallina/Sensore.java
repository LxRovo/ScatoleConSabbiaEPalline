/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author caliendo_giuseppe
 */
public class Sensore extends Thread{
    private float inclinazioneX;
    private DatiCondivisi ptrDati;
    
    
    @Override
    public void run(){
        
        while(true){
            ptrDati.waitSem1();
            
            setInclinazione(ptrDati.getSwing().getValore());
        }
        
    }
    
    
    
    public synchronized void setInclinazione(float inclinazione) {
        this.inclinazioneX = inclinazione;
    }
    
    public void resetInc() {
        inclinazioneX = 0;
    }
    
}
