/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

import processing.core.PApplet;
/**
 *
 * @author rovelli_andrea
 */
public class ScatoleConSabbiaEPallina extends PApplet {

    static DatiCondivisi dati; 
    static ThScatola[] scatole;    
    static int numScatole;        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingGui swingGui = new SwingGui(dati);
        // shows Swing windows
        swingGui.show();
        
        /*numScatole = 2;
        dati = new DatiCondivisi(numScatole);
        scatole = new ThScatola[numScatole];
        for (int i = 0; i < scatole.length; i++) {
            scatole[i] = new ThScatola(dati, i);
        }

        PApplet.main(new String[]{"nb_processingball.NB_ProcessingBall"});

        SwingGui swingGui = new SwingGui(dati);
        // shows Swing windows
       //swingGui.show();
    }

    @Override
    public void settings() {
        size(640, 360);
        //dati.setScreen(width, height);
        for (int i = 0; i < scatole.length; i++) {
            scatole[i].start();
        }
    }

    @Override
    public void setup() {
        noStroke();
        frameRate(60);
        ellipseMode(RADIUS);
    }

    @Override
    public void draw() {
        if (!dati.isRunning()) {
            exit();
        }

        // clean the screen
        //background(dati.getRed(), dati.getGreen(), dati.getBlue());

        // display all "balls"
        for (int i = 0; i < dati.getNumScatole(); i++) {
            Scatola temp =dati.getScatola(i);
            line(temp.getX(),temp.getY(),temp.getX()+temp.getLarghezza(),temp.getY()+getLunghezza());
            
        }*/
        
        
    }

}
        
        
    
