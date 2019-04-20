/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatoleconsabbiaepallina;

/**
 *
 * @author alessandro_purita
 */
public class Sabbia {
    
    private int volume;
    private int velocitaX;
    private int velocitaY;

    public Sabbia(int volume, int velocitaX, int velocitaY) {
        this.volume = volume;
        this.velocitaX = velocitaX;
        this.velocitaY = velocitaY;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVelocitaX() {
        return velocitaX;
    }

    public void setVelocitaX(int velocitaX) {
        this.velocitaX = velocitaX;
    }

    public int getVelocitaY() {
        return velocitaY;
    }

    public void setVelocitaY(int velocitaY) {
        this.velocitaY = velocitaY;
    }
    public void aggiornaInfo(int inclinazioneX,int inclinazioneY)
    {
        
    this.velocitaX++;
    this.velocitaY--;
    
    
    
    }
}
