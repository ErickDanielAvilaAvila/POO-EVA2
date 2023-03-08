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
public class Automovil {
    private String marca;
    private int modelo;
    private int año;
    
    
    //metodo set
     public void setMarca(String valor) {
        marca = valor;
    }

    public void setModelo(int valor) {
        modelo = valor;
    }

    public void setAño(int valor) {
        año = valor;
    }
    
    //metodo get
     public String getNombre() {
        return marca;
    }

    public int getId() {
        return modelo;
    }

    public int getEdad() {
        return año;
    }
        
    public void imprimirdatos(){
    System.out.println("Datos: ");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + año);
        
    
}
}