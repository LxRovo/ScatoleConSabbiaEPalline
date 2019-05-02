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

    private Vector<ThScatola> scatole;
    private float inclinazioneX;
    private final boolean running;
    private Pallina p;

    public DatiCondivisi() {
        this.running = true;
    }

    public synchronized void setValoreInc(int v) {
        inclinazioneX = v;
    }

    public void resetInc() {
        inclinazioneX = 0;
    }

    public synchronized float getInclinazioneX() {
        return inclinazioneX;
    }

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

}
