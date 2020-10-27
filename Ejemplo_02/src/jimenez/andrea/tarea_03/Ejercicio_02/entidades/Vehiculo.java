/**
 * @author Andrea Jiménez
 * @version 1.0
 */

package jimenez.andrea.tarea_03.Ejercicio_02.entidades;

import java.util.Objects;

public class Vehiculo {
    private String serie;
    private String marca;
    private Motor motor;

    /**
     *
     * @return numero de serie
     */

    public String getSerie() {
        return serie;
    }

    /**
     *
     * @param serie
     */

    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     *
     * @return marca de auto
     */

    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return motor de auto
     */

    public Motor getMotor() {
        return motor;
    }

    /**
     *
     * @param motor
     */

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * constructor de automovil
     */

    public Vehiculo() {
    }

    /**
     *
     * @param serie
     * @param marca
     * @param motor
     *
     * contructor de automovil
     */

    public Vehiculo(String serie, String marca, Motor motor) {
        this.serie = serie;
        this.marca = marca;
        this.motor = motor;
    }

    /**
     *
     * @return método toString de automovil
     */

    @Override
    public String toString() {
        return "vehiculo{" +
                "serie='" + serie + '\'' +
                ", marca='" + marca + '\'' +
                ", motor=" + motor +
                '}';
    }

    /**
     *
     * @param o
     * @return equals de automovil
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(serie, vehiculo.serie) &&
                Objects.equals(marca, vehiculo.marca) &&
                Objects.equals(motor, vehiculo.motor);
    }

    /**
     *
     * @return hashcode
     */

    @Override
    public int hashCode() {
        return Objects.hash(serie, marca, motor);
    }
}
