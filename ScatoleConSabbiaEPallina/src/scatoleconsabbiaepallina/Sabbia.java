package scatoleconsabbiaepallina;

/**
 * @author alessandro_purita
 *
 */
/**
 * Classe per gestire la visualizzazione della sabbia ottenendo la sua posizione
 * tramite l'accelerazione, interagisce con la classe ThScatola * per ottenere
 * le coordinate e con DatiCondivisi per avere l'inclinazione
 */
public class Sabbia {

    private float volume; //spazio occupato dalla sabbia
    private float accellerazione; //variazione velocità sabbia
    private float posX; //posizione sull'asse x 
    private float posY; //posizione sull'asse y
    DatiCondivisi dati; //puntatore alla classe DatiCondivisi 

    /**
     * @brief Costruttore con parametri della classe
     *
     * costruttore che inizializza la posizione x e y della sabbia passandola
     * come parametro, l'immagine con le dimensioni rispettive e il volume
     * passate dalla classe ThScatola
     *
     *
     *
     * @param volume
     * @param posX
     * @param posY
     * @param dati
     *
     */
    public Sabbia(float volume, float posX, float posY, DatiCondivisi dati) {
        this.volume = volume;
        this.accellerazione = 0;
        this.posX = posX;
        this.posY = posY;
        this.dati = dati;
    }

    public float getVolume() {
        return volume;
    }

    public float getAccellerazione() {
        return accellerazione;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setAccellerazione(float accellerazione) {
        this.accellerazione = accellerazione;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    /**
     * @brief metodo per aggiornare la posizione sull'asse x della sabbia
     *
     * La posizione in x viene calcolata in base all'accelerazione e se la nuova
     * posizione è minore della x minima diviene quella, analogamente con la x
     * massima
     *
     */
    public void aggiornaInfo(float larghezza) {
        double x = Math.toRadians(dati.getSens().getInclinazioneX());
        accellerazione = (float) (9.8 * Math.sin(x));
        posX = posX + accellerazione;

        if (posX < dati.getMinX()) {
            posX = dati.getMinX();

        }
        if (posX > dati.getMaxX()) {
            posX = dati.getMaxX();

        }
    }

}


