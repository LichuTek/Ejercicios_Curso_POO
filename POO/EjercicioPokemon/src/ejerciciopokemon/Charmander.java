/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopokemon;

/**
 *
 * @author lichu
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    public Charmander(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, tipo);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Soy charmander y estoy atacando con arañazo");

    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Soy charmander y estoy atacando con mordizco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y estoy atacando con mordizco");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y estoy atacando con mordizco");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y estoy atacando con mordizco");
    }
    
    
    
}
