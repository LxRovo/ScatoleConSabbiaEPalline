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
public class ThSensore extends Thread{
    private float inclinazioneX;
    private DatiCondivisi ptrDati;

    public ThSensore(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    
    
    
    @Override
    public void run(){
        
        while(true){
            
            setInclinazione(ptrDati.getSwing().getValore());
                                
        }
        
    }
    
    
    
    public synchronized void setInclinazione(float inclinazione) {
        this.inclinazioneX = inclinazione;
    }

    public float getInclinazioneX() {
        return inclinazioneX;
    }
    
    
    
    public void resetInc() {
        inclinazioneX = 0;
    }
    
}
