/**
 * @author Andrea Jiménez
 * @version 1.0
 */
package jimenez.andrea.tarea_03.Ejercicio_02.gestor;

import jimenez.andrea.tarea_03.Ejercicio_02.entidades.Motor;
import jimenez.andrea.tarea_03.Ejercicio_02.entidades.Vehiculo;

import java.util.ArrayList;

public class Gestor {
    ArrayList<Vehiculo> vehiculos;

    /**
     * constructor de Gestor
     */

    public Gestor() {
        this.vehiculos = new ArrayList<>();
    }

    /**
     *
     * @return arrayList de vehiculos
     */

    public ArrayList<Vehiculo> getVehiculos () {
        return this.vehiculos;
    }

    public void crearVehiculo (String serie, String marca, Motor motor) {
        Vehiculo vehiculo = new Vehiculo(serie, marca, motor);
        vehiculos.add(vehiculo);
    }

    public Motor crearMotor (String serie, int cilindros) {
        Motor motor = new Motor(serie, cilindros);
        return motor;
    }


}
