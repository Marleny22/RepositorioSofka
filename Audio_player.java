/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_objects;

/**
 * Representa la clase Reproductor de audio, algunos de sus estados básicos y principios de funcionamiento
 * @author Marleny Fernández Sandoval
 */
public class Audio_player {
    /**
     * Representa el estado del Reproductor de audio, que puede ser encendido o apagado.
     */
    public boolean status;
    /**
     * Representa el estado del volumen del Reproductor, siendo 0 el mínimo volumen y 100 el máximo.
     */
    private int volumeSetting;
    /**
     * Representa el estado del botón de incrementar volumen del Reproductor.
     */
    private boolean increasevolumeButton;
    /**
     * Representa el estado del botón de decrementar volumen del Reproductor.
     */
    private boolean reducevolumeButton;
    /**
     * Representa el estado del botón  detener la reproducción de audio del  Reproductor.
     */
    private boolean stopButton;
    /**
    * Representa el estado del botón pausar la reproducción de audio del  Reproductor.
    */
    private boolean pauseButton;
    /**
    * Representa el estado del botón activar la reproducción de audio del  Reproductor.
    */
    private boolean playButton;
    /**
    * Representa el estado del botón para retornar al audio anterior para reproducir en el Reproductor.
    */
    private boolean previousplayButton;
    /**
    * Representa el estado del botón para reproducir el siguiente audio en el Reproductor.
    */
    private boolean nextplayButton;
    
    /**
     * Crea una instancia de la clase Reproductor de audio sin atributos definidos.
     */
    public Audio_player() {
    }
    
    /**
     * Método que permite verificar el estado del Reproductor.
     * @return True = Encendido, False = Apagado.
     */
    public boolean isStatus() {
        return this.status;
    }

    /**
     * Método para encender el Reproductor de audio.
     * @param status Estado del Reproductor de audio.
     */
    public void turnOn(boolean status) {
        if(this.status==false)
        {
        this.status = true;
        }
    }
    /**
     * Método para apagar el Reproductor de audio.
     * @param status Estado del Reproductor de audio.
     */
    public void turnOff(boolean status) {
        if(this.status==true)
        {
        this.status = false;
        }
    }
    
    /**
     * Método para incrementar el volumen el Reproductor de audio.
     * @param status Estado del botón de incrementar el volumen Reproductor de audio True = Activo, False = Inactivo.
     */
    private void setIncreasevolumeButton(boolean increasevolumeButton) {
        if(volumeSetting < 100)
        {
        this.volumeSetting = volumeSetting++;
        }
        else {
        this.volumeSetting = 100;
        }
    }
     /**
     * Método para reducir el volumen el Reproductor de audio.
     * @param status Estado del botón de decrementar el volumen Reproductor de audio True = Activo, False = Inactivo.
     */
    private void setReducevolumeButton(boolean reducevolumeButton) {
         if(volumeSetting > 0)
        {
        this.volumeSetting = volumeSetting--;
        }
        else
        {
        this.volumeSetting = 0;
        }
    }
    
    
     
    
    
    
}
