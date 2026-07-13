package model;

/**
 * Representa a un guía turístico que trabaja para
 * la agencia Llanquihue Tour.
 *
 * <p>Hereda los datos generales de {@link Persona}
 * e implementa el contrato {@link Registrable}.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class GuiaTuristico extends Persona implements Registrable {

    private String idioma;
    private int aniosExperiencia;

    /**
     * Construye un guía turístico.
     *
     * @param nombre nombre del guía
     * @param correo correo electrónico del guía
     * @param edad edad del guía
     * @param idioma idioma principal que maneja
     * @param aniosExperiencia años de experiencia laboral
     */
    public GuiaTuristico(
            String nombre,
            String correo,
            int edad,
            String idioma,
            int aniosExperiencia
    ) {
        super(nombre, correo, edad);
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Obtiene el idioma principal del guía.
     *
     * @return idioma principal
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Obtiene los años de experiencia del guía.
     *
     * @return años de experiencia
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * Genera un resumen personalizado del guía turístico.
     *
     * @return resumen con los datos del guía
     */
    @Override
    public String mostrarResumen() {
        return "GUÍA TURÍSTICO\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Idioma: " + idioma + "\n"
                + "Años de experiencia: " + aniosExperiencia;
    }
}