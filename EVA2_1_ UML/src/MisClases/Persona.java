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
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    
    
    // Métodos "set"
     public void setNombre(String valor) {
        nombre = valor;
    }

    public void setId(int valor) {
        id = valor;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
        
// Métodos "get"
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }
        
        // Método para imprimir los datos 
   
public void imprimirdatos(){
    System.out.println("Datos: ");
    System.out.println("Id: " + id );
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    
}
  
    }


    

