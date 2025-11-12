package Estudiantes.utils;

import java.util.ArrayList;
import java.util.List;

import Estudiantes.domain.Estudiante;

public class Utils {

    public static void EstudantesParEImpar(Estudiante[] estudiantes) {
        List<Estudiante> estudiantesPar = new ArrayList<>();
        List<Estudiante> estudiantesImpar = new ArrayList<>();

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getEdad() % 2 == 0) {
                estudiantesPar.add(estudiantes[i]);
            } else {
                estudiantesImpar.add(estudiantes[i]);
            }
        }

        System.out.println("-----Estudiantes Impares--------");
        for (Estudiante estudianteImpar : estudiantesImpar) {
            System.out.println(estudianteImpar.getNombre());
        }

        System.out.println("-----Estudiantes Pares--------");
        for (Estudiante estudiantePar : estudiantesPar) {
            System.out.println(estudiantePar.getNombre());
        }

    }

}
