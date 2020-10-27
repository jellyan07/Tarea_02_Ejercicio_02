package jimenez.andrea.tarea_03.Ejercicio_02.controlador;

import jimenez.andrea.tarea_03.Ejercicio_02.UI.UI;
import jimenez.andrea.tarea_03.Ejercicio_02.entidades.Motor;
import jimenez.andrea.tarea_03.Ejercicio_02.entidades.Vehiculo;
import jimenez.andrea.tarea_03.Ejercicio_02.gestor.Gestor;

public class Controlador {
    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 3);
    }

    private void procesarOpcion (int opcion) {
        switch (opcion) {
            case 1:
                registrarVehiculo();
                break;
            case 2:
                listarVehiculos();
                break;
            case 3:

                break;
            default:
                interfaz.imprimir("La opción no es válida");
                break;
        }
    }

    private void registrarVehiculo() {
        interfaz.imprimir("Ingrese el número de serie del vehículo");
        String serie = interfaz.leerTexto();
        interfaz.imprimir("Ingrese la marca del vehículo");
        String marca = interfaz.leerTexto();
        Motor motor = registrarMotor();
        gestor.crearVehiculo(serie, marca, motor);
    }

    private Motor registrarMotor() {
        interfaz.imprimir("Ingrese el número de serie del motor");
        String serie = interfaz.leerTexto();
        interfaz.imprimir("Ingrese el número de cilindros del motor");
        int cilindros = interfaz.leerOpcion();
        Motor motor = gestor.crearMotor(serie, cilindros);
        return motor;
    }

    private void listarVehiculos () {
        interfaz.imprimir("**** Lista de vehículos ****");
        for (Vehiculo vehiculo:
             gestor.getVehiculos()) {
            interfaz.imprimir(vehiculo.toString());
        }
    }

}
