/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopokemon;

/**
 *
 * @author Lisandro
 */
public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(){}
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu atacando con placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Pikachu atacando con Arañazo");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Pikachu atacando con Mordizco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu atacando con PuñoTrueno");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu atacando con RayoCarga");
    }
    
}
