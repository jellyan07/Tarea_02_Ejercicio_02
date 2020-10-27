package jimenez.andrea.tarea_03.Ejercicio_02.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public static void mostrarMenu () {
        output.println("*******  Escoja una opción  ******");

        output.println("1. Registrar Automóvil");
        output.println("2. Listar Automóviles");
        output.println("4. Salir");
    }
    public static void imprimir (String msj) {
        output.println(msj);
    }

    public static String leerTexto () {
        String texto = input.next();
        return texto;
    }

    public int leerOpcion() {
        int opcion = Integer.parseInt(input.next());
        return opcion;
    }

}
