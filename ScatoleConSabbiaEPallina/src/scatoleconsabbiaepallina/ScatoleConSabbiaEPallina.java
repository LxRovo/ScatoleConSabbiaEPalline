/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.util.Random;
import java.util.Vector;
import processing.core.PApplet;

/**
 *
 * @author rovelli_andrea
 */
public class ScatoleConSabbiaEPallina extends PApplet {

    static DatiCondivisi dati;
    static int numScatole;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();

        numScatole = r.nextInt(3) + 2;

        Vector<ThScatola> scatole = new Vector(numScatole);
        float larghezza = 70;
        float lunghezza = 100;
        float x = 50;
        float y = 50;
        dati = new DatiCondivisi();
        for (int i = 0; i < numScatole; i++) {
            float altezza = r.nextInt(20) + 30;
            Sabbia sabbia;
            if (i <= numScatole / 2) {

                sabbia = new Sabbia(altezza * larghezza * lunghezza / 2, x, y, dati);

            } else {

                sabbia = new Sabbia(0, x, y, dati);

            }
            ThScatola scatola = new ThScatola(altezza, x + (i * larghezza), y, lunghezza, larghezza, sabbia, dati);
            scatole.add(i, scatola);
            if (i == (numScatole / 2)) {
                Pallina p = new Pallina(10, x + scatola.getLarghezza() / 2, scatola.getY() + scatola.getLunghezza() / 2);
                dati.setP(p);
            }

        }

        dati.setScatole(scatole);

        PApplet.main(new String[]{"progetto.Progetto"});

        SwingGui swing = new SwingGui(dati);

        swing.show();

    }

    @Override
    public void settings() {

        size(640, 360);
        for (int i = 0; i < dati.getScatole().size(); i++) {
            dati.getThScatola(i).start();
        }
    }

    @Override
    public void draw() {

        if (!dati.isRunning()) {
            exit();
        }

        // clean the screen
        background(255, 255, 255);

        // display all "balls"
        for (int i = 0; i < numScatole; i++) {
            disegnaThScatola(i);
        }

    }

    public void disegnaThScatola(int i) {

        ThScatola s = dati.getThScatola(i);
        stroke(0, 0, 0);
        noFill();

        //margini scatola
        rect(s.getX(), s.getY(), s.getLarghezza(), s.getLunghezza());
        /*oblò visti dal lato
        if (i != 0) {
            stroke(255, 0, 0);
            ellipse(s.getX(), s.getY() + s.getLunghezza() / 2, s.getRaggioFinestre(), s.getRaggioFinestre());
        }*/

        //oblò visti dall'alto
        if (i != 0) {
            stroke(0, 255, 120);
            fill(0, 255, 120);
            line(s.getX(), s.getY() + s.getLunghezza() / 2 - s.getRaggioFinestre(), s.getX(), s.getY() + s.getLunghezza() / 2 + s.getRaggioFinestre());
        }

        //disegna pallina
        disegnaPallina(s);
    }

    public void disegnaPallina(ThScatola s) {

        noStroke();
        fill(255, 0, 0);
        Pallina p = dati.getP();
        ellipse(p.getXpos(), p.getYpos(), 10, 10);

    }

}
