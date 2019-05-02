/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author peppe
 */
public class Pallina {
    int rag;
    float xpos;
    double velx;
    int xdirection;
    int widthScreen;
    int heightScreen;
    
    Pallina(){
        rag=20;
        velx=4.8;
        xpos = 0;
        widthScreen = 0;
        heightScreen = 0;
        xdirection=0;
    }
    
    public void aggiornaInformazioni(double vx){
      // xdirection = -1;   Right to Left
        xpos=xpos+(float)(vx*xdirection); 
    }
    
    void setScreen(int width, int height) {
        widthScreen = width;
        heightScreen = height;
        xpos = widthScreen / 2 + (int) (Math.random() * 50);
    }
    
    public float getXpos() {
        return xpos;
    }
}
