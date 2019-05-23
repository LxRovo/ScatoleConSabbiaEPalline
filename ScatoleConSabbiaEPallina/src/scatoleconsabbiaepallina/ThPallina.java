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
 * @author peppe
 */
public class ThPallina extends Thread {

    private DatiCondivisi ptrDati;  
    /**
     * puntatore alla classe DatiCondivisi
     */


    public ThPallina(DatiCondivisi dati) {
        ptrDati = dati;
    }

    /**
     * metodo per l'aggiornamento delle informazioni sul 
     * movimento della pallina
     */
    @Override
    public void run() {
        while (true) {
            ptrDati.getP().aggiornaInfo();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThPallina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
