package model;
/**
 * Define el comportamiento común que deben implementar
 * las entidades gestionables por Llanquihue Tour.
 *
 * <p>Toda clase que implemente esta interfaz deberá entregar
 * un resumen textual de sus datos mediante el método
 * {@link #mostrarResumen()}.</p>
 *
 * @author Maximiliano VillalobosMaximiliano Villalobos
 * @version 1.0
 */
public interface Registrable {

    /**
     * Genera un resumen con la información principal de la entidad.
     *
     * @return resumen textual de la entidad
     */
    String mostrarResumen();
}