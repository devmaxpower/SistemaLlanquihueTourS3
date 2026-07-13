package model;

/**
 * Representa un vehículo utilizado por la agencia
 * Llanquihue Tour para sus operaciones turísticas.
 *
 * <p>Implementa {@link Registrable} para que pueda
 * almacenarse junto con otras entidades del sistema.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Vehiculo implements Registrable {

    private String patente;
    private String modelo;
    private int capacidad;

    /**
     * Construye un vehículo.
     *
     * @param patente patente del vehículo
     * @param modelo modelo del vehículo
     * @param capacidad cantidad máxima de pasajeros
     */
    public Vehiculo(String patente, String modelo, int capacidad) {
        this.patente = patente;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    /**
     * Obtiene la patente del vehículo.
     *
     * @return patente del vehículo
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene la capacidad del vehículo.
     *
     * @return capacidad máxima de pasajeros
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Genera un resumen personalizado del vehículo.
     *
     * @return resumen con los datos del vehículo
     */
    @Override
    public String mostrarResumen() {
        return "VEHÍCULO\n"
                + "Patente: " + patente + "\n"
                + "Modelo: " + modelo + "\n"
                + "Capacidad: " + capacidad + " pasajeros";
    }
}