package app;

import java.util.ArrayList;
import java.util.List;

import domain.Animal;
import services.GestionAnimales;

public class App {
    public static void main(String[] args) throws Exception {
        // Cuantos perros tengo y cual es el animal de mayor edad

        Animal perro = new Animal("firu", "criolla", 3, "negro", "perro");
        Animal gato = new Animal("miau", "criolla", 5, "azul", "gato");
        Animal loro = new Animal("perico", "criolla", 4, "verde", "loro");
        Animal perro2 = new Animal("keiner", "labrador", 3, "blanco", "perro");

        List<Animal> animales = new ArrayList<>();

        animales.add(perro);
        animales.add(gato);
        animales.add(loro);
        animales.add(perro2);

        int contadorPerro = GestionAnimales.ContarPerros(animales);
        System.out.println("La cantidad de perro es: " + contadorPerro);
    }
}
