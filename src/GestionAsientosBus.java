import java.util.Scanner;


public class GestionAsientosBus {

    private static final int FILAS = 8;
    private static final int COLUMNAS = 4;

    private final boolean[][] asientos = new boolean[FILAS][COLUMNAS];

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new GestionAsientosBus().ejecutar();
    } 

    private void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> reservarAsiento();
                case 2 -> cancelarReserva();
                case 3 -> consultarAsiento();
                case 4 -> mostrarAsientos();
                case 5 -> contarDisponibles();
                case 0 -> System.out.println("Saliendo ...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("===== SISTEMA DE ASIENTOS DEL BUS =====");
        System.out.println("1. Reservar un asiento");
        System.out.println("2. Cancelar una reserva");
        System.out.println("3. Consultar un asiento");
        System.out.println("4. Mostrar todos los asientos");
        System.out.println("5. Contar asientos disponibles");
        System.out.println("0. Salir");
    }

    
    private void reservarAsiento() {
        int[] pos = leerPosicion();
        if (pos == null) return;

        int fila = pos[0], col = pos[1];

        if (asientos[fila][col]) {
            System.out.println("El asiento ya está ocupado.");
        } else {
            asientos[fila][col] = true;
            System.out.println("Asiento reservado con éxito.");
        }
    }

    private void cancelarReserva() {
        int[] pos = leerPosicion();
        if (pos == null) return;

        int fila = pos[0], col = pos[1];

        if (!asientos[fila][col]) {
            System.out.println("El asiento ya estaba disponible.");
        } else {
            asientos[fila][col] = false;
            System.out.println("Reserva cancelada con éxito.");
        }
    }

    private void consultarAsiento() {
        int[] pos = leerPosicion();
        if (pos == null) return;

        int fila = pos[0], col = pos[1];
        String estado = asientos[fila][col] ? "OCUPADO" : "DISPONIBLE";
        System.out.printf("Asiento [Fila %d, Puesto %d] -> %s%n", fila + 1, col + 1, estado);
    }

    private void mostrarAsientos() {
        System.out.println("Mapa de asientos (O = ocupado, . = disponible):");
        System.out.print("      ");
        for (int c = 1; c <= COLUMNAS; c++) {
            System.out.printf("P%-3d", c);
        }
        System.out.println();

        for (int f = 0; f < FILAS; f++) {
            System.out.printf("Fila %d:", f + 1);
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.print(asientos[f][c] ? "  O " : "  . ");
            }
            System.out.println();
        }
    }

    private void contarDisponibles() {
        int disponibles = 0;
        for (boolean[] fila : asientos) {
            for (boolean ocupado : fila) {
                if (!ocupado) disponibles++;
            }
        }
        System.out.println("Asientos disponibles: " + disponibles + " de " + (FILAS * COLUMNAS));
    }

    
    private int[] leerPosicion() {
        int fila = leerEntero("Ingrese el número de fila (1-" + FILAS + "): ") - 1;
        int col = leerEntero("Ingrese el número de puesto (1-" + COLUMNAS + "): ") - 1;

        if (fila < 0 || fila >= FILAS || col < 0 || col >= COLUMNAS) {
            System.out.println("Posición fuera de rango. Operación cancelada.");
            return null;
        }
        return new int[]{fila, col};
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número: ");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }
}
