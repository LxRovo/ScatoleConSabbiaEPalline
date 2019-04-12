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
public class ThScatola extends Thread{
    
    private DatiCondivisi ptrDati;
    private int idScatola;
    
    
    public ThScatola(DatiCondivisi ptrDati, int idScatola) {
        this.ptrDati = ptrDati;
        this.idScatola = idScatola;
    }
    
    
    
    
}
