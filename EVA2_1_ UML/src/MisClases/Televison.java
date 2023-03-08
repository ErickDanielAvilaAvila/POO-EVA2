/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author avila
 */
public class Televison {
    private int canal;
    private int volumen;
    private String power;
    
    public void setCanal(int valor) {
        canal = valor;
    }

    public void setVolumen(int valor) {
        volumen = valor;
    }

    public void setPower(String valor) {
        power = valor;
    }
    
    // Métodos "get"
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen ;
    }

    public String getPower() {
        return power;
    }
    public void imprimirdatos(){
    System.out.println("Datos: ");
    System.out.println("Canal: " + canal );
    System.out.println("Volumen: " + volumen);
    System.out.println("Power: " + power);
}
}
    
    

