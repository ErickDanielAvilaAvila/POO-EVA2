/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia;

/**
 *
 * @author avila
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int nocontrol;
    
     public Estudiante(){
    }

    public Estudiante(String nombre, String apellido, int nocontrol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nocontrol = nocontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(int nocontrol) {
        this.nocontrol = nocontrol;
    }
    
    
    
}
