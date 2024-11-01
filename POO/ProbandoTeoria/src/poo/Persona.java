/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Lisandro
 */
public class Persona {
    String Nombre;
    String Apellido; 
    int dni;
    
    public Persona (){}
    
    public Persona(String nombre, String apellido, int dni){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.dni = dni;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public void setApellido (String apellido){
        this.Apellido = apellido;
    }
    public void setDni (int dni){
        this.dni = dni;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    
    
}
