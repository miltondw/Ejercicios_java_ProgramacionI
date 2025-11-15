package services;

import java.util.List;
import domain.Animal;

public class GestionAnimales {
    // Contar perros
    public static int ContarPerros(List<Animal> animales) {
        int contadorPerro = 0;

        for (Animal animal : animales) {
            if (animal.getTipo().equals("perro")) {
                contadorPerro += 1;
            }
        }
        return contadorPerro;

    }

}
