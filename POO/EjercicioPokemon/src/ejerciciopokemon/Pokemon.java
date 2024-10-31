
package ejerciciopokemon;

public abstract class Pokemon {
    
    private int num_pokedex;
    private String nombrePokemon;
    private double pesoPokemon;
    private String sexo;
    private int temporadaQueAparece;
    private String tipo;
    
    
    public Pokemon(){}

    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }
    
    
    public double atacarPlacaje (){
        danio = 60;
        return danio;
    }
    
    
    
    
}
