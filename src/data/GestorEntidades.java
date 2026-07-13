package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

/**
 * Gestiona las entidades registrables de Llanquihue Tour.
 *
 * <p>La clase utiliza una colección genérica
 * {@code ArrayList<Registrable>} para almacenar objetos
 * de diferentes clases mediante polimorfismo.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    /**
     * Construye un gestor con una colección inicialmente vacía.
     */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    /**
     * Agrega una entidad registrable a la colección.
     *
     * @param entidad objeto que implementa Registrable
     */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    /**
     * Obtiene la cantidad de entidades almacenadas.
     *
     * @return cantidad de entidades registradas
     */
    public int obtenerCantidadEntidades() {
        return entidades.size();
    }

    /**
     * Recorre la colección polimórfica y genera un resumen
     * de todos los objetos almacenados.
     *
     * <p>Durante el recorrido se utiliza {@code instanceof}
     * para identificar el tipo real de cada objeto y agregar
     * un mensaje diferenciado.</p>
     *
     * @return resumen de todas las entidades
     */
    public String mostrarEntidades() {
        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        String resumenCompleto = "";

        for (Registrable entidad : entidades) {
            resumenCompleto += entidad.mostrarResumen() + "\n";

            if (entidad instanceof GuiaTuristico) {
                resumenCompleto += "Tipo identificado: personal de guía turística.\n";
            } else if (entidad instanceof Vehiculo) {
                resumenCompleto += "Tipo identificado: recurso de transporte.\n";
            } else if (entidad instanceof ColaboradorExterno) {
                resumenCompleto += "Tipo identificado: colaborador externo.\n";
            }

            resumenCompleto += "\n------------------------------\n\n";
        }

        return resumenCompleto;
    }
}