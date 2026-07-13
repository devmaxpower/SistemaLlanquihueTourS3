package model;
/**
 * Representa una persona relacionada con las operaciones
 * de la agencia Llanquihue Tour.
 *
 * <p>Esta clase funciona como superclase de las entidades
 * que comparten nombre, correo electrónico y edad.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Persona {

    private String nombre;
    private String correo;
    private int edad;

    /**
     * Construye una persona con sus datos básicos.
     *
     * @param nombre nombre de la persona
     * @param correo correo electrónico de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return correo electrónico de la persona
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }
}