/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopokemon;

/**
 *
 * @author Lisandro
 */
public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur atacando con placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Bulbasaur atacando con arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Bulbasaur atacando con Mordizco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur atacando con drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur atacando con Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur atacando con Latigo Cepa");
    }
    
}
