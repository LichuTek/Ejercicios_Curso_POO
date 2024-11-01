/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopokemon;

/**
 *
 * @author Lisandro
 */
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    
       
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle atacando con Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Squirtle atacando con Arañazo");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Squirtle atacando con Mordizco");

    }

    @Override
    public void atacarHidroBomba() {
         System.out.println("Squirtle atacando con Hidro Bomba");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle atacando con Pistola Agua");

    }

    @Override
    public void atacarBurbuja() {
         System.out.println("Squirtle atacando con Burbuja");

    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle atacando con Hidro Pulso");

    }
    
}
