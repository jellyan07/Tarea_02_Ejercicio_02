/**
 * @author Andrea Jiménez
 * @version 1.0
 */

package jimenez.andrea.tarea_03.Ejercicio_02.entidades;

import java.util.Objects;

public class Motor {
    private String serie;
    private int cilindros;

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
     * @return numero de cilindraje
     */

    public int getCilindros() {
        return cilindros;
    }

    /**
     *
     * @param cilindros
     */

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    /**
     * contructor vacío de Motor
     */

    public Motor() {
    }

    /**
     *
     * @param serie
     * @param cilindros
     * crear motor
     */

    public Motor(String serie, int cilindros) {
        this.serie = serie;
        this.cilindros = cilindros;
    }

    /**
     *
     * @return to string de Motor
     */

    @Override
    public String toString() {
        return "Motor{" +
                "serie='" + serie + '\'' +
                ", cilindros=" + cilindros +
                '}';
    }

    /**
     *
     * @param o
     * @return booleano de equals
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return cilindros == motor.cilindros &&
                Objects.equals(serie, motor.serie);
    }

    /**
     *
     * @return hashcode
     */

    @Override
    public int hashCode() {
        return Objects.hash(serie, cilindros);
    }
}
