/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import java.util.Random;
import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author rovelli_andrea
 *
 * @brief main che unisce le varie classi e disegna su schermo i vari
 * compontenti
 */
public class ScatoleConSabbiaEPallina extends PApplet {

    static DatiCondivisi dati;
    static int rows;
    static int cols;
    static int numScatole;
    static PImage img; //immagine della sabbia

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();

        rows = r.nextInt(1) + 2;
        cols = r.nextInt(2) + 2;
        numScatole = rows * cols;

        /**
         * @author rovelli_andrea creazione e inizializzazione dei thread
         * scatola, della sabbia e della pallina
         *
         */
        ThScatola[][] scatole = new ThScatola[rows][cols];
        float larghezza = 70;
        float lunghezza = 100;
        float x = 50;
        float y = 50;
        dati = new DatiCondivisi();
        dati.setMinX(x);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                float altezza = r.nextInt(20) + 30;
                Sabbia sabbia;
                if (j == 0) {

                    sabbia = new Sabbia(altezza * larghezza * lunghezza / 2, x + (j * larghezza), y + (i * lunghezza), dati);

                } else {

                    sabbia = new Sabbia(0, x, y, dati);

                }
                ThScatola scatola = new ThScatola(altezza, x + (j * larghezza), y + (i * lunghezza), lunghezza, larghezza, sabbia, dati);
                scatole[i][j] = scatola;

                dati.setScatole(scatole);

                if (i == 0 && j == 0) {
                    Pallina p = new Pallina(10, x + scatola.getLarghezza() / 2, scatola.getY() + scatola.getLunghezza() / 2);
                    dati.setP(p);

                }
                if (i == rows - 1 && j == cols - 1) {

                    dati.setMaxX(x + (j * larghezza));

                }
            }
        }
        dati.setNumRows(rows);
        dati.setNumCols(cols);
        /*
        *@author rovelli_andrea
        *avvio della canvas e della swing
        *
         */

        SwingGui swing = new SwingGui(dati);
        dati.setSwing(swing);
        dati.getSwing().show();
        ThSensore sens = new ThSensore(dati);
        dati.setSens(sens);

        PApplet.main(new String[]{"scatoleconsabbiaepallina.ScatoleConSabbiaEPallina"});

    }

    /**
     * @author rovelli_andrea impostazione delle dimensioni della finestra e
     * avvio dei thread
     *
     *
     */
    @Override
    public void settings() {

        size(640, 360);

    }

    @Override
    public void setup() {

        dati.getSens().start();
        for (int i = 0; i < dati.getNumRows(); i++) {
            for (int j = 0; j < dati.getNumCols(); j++) {
                dati.getThScatola(i, j).start();
            }
            img = loadImage("src\\scatoleconsabbiaepallina\\sabbia.jpg");

        }
    }

    /**
     * @author rovelli_andrea
     * @brief disegno nella canvas delle scatola, della sabbia e della pallina
     *
     *
     */
    @Override
    public void draw() {

        if (!dati.isRunning()) {
            exit();
        }

        // clean the screen
        background(255, 255, 255);

        // display all "balls"
        for (int i = 0; i < dati.getNumRows(); i++) {
            for (int j = 0; j < dati.getNumCols(); j++) {
                disegnaThScatola(i, j);
            }
        }

    }

    /**
     * @author rovelli_andrea
     *
     * @brief metodo che disegna le varie scatole
     *
     * @param i riga in cui si trova la scatola
     * @param j colonna in cui si trova la scatola
     */
    public void disegnaThScatola(int i, int j) {

        ThScatola s = dati.getThScatola(i, j);

        disegnaSabbia(s.getSabbia());
        //disegna pallina
        disegnaPallina(s);

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
        if (j != 0) {
            stroke(0, 255, 120);
            fill(0, 255, 120);
            line(s.getX(), s.getY() + s.getLunghezza() / 2 - s.getRaggioFinestre(), s.getX(), s.getY() + s.getLunghezza() / 2 + s.getRaggioFinestre());
        }

    }

    /**
     * @author rovelli_andrea
     * @brief metodo che permette di disegnare la pallina
     *
     * @param s scatola nella quale disegnare la pallina
     */
    public void disegnaPallina(ThScatola s) {

        noStroke();
        fill(255, 0, 0);
        Pallina p = dati.getP();

        ellipse(p.getXpos(), p.getYpos(), 10, 10);

    }

    /**
     * @author rovelli_andrea
     *
     * @brief metodo che permette di caricare l'immagine della sabbia in una
     * scatola
     *
     * @param sabbia sabbia contenuta nella scatola
     */
    public void disegnaSabbia(Sabbia sabbia) {

        noStroke();
        fill(230, 140, 40);

        //rect(sabbia.getPosX(), sabbia.getPosY(), dati.getThScatola(0, 0).getLarghezza(), dati.getThScatola(0, 0).getLunghezza());
        image(img, sabbia.getPosX(), sabbia.getPosY(), dati.getThScatola(0, 0).getLarghezza(), dati.getThScatola(0, 0).getLunghezza());

    }

}
