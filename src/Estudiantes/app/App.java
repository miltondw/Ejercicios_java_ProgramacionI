package Estudiantes.app;

import Estudiantes.domain.Estudiante;
import Estudiantes.utils.Utils;

public class App {
    /*
     * 
     * Tengo 1 lista de estudiantes con los siguientes datos: el nombre, el código y
     * la edad, ahora necesito dividir la lista en dos, en la primera a los
     * estudiantes
     * con edad impar y en la segunda lista a los estudiantes con la edad par.
     */
    public static void main(String[] args) throws Exception {

        Estudiante estudiante1 = new Estudiante("milton", "192647", 1);
        Estudiante estudiante2 = new Estudiante("miryian", "192647", 2);
        Estudiante estudiante3 = new Estudiante("jesus", "192647", 3);
        Estudiante estudiante4 = new Estudiante("andres", "192647", 4);

        Estudiante[] estudiantes = { estudiante1, estudiante2, estudiante3, estudiante4 };
        Utils.EstudantesParEImpar(estudiantes);

    }
}
