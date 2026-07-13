package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

/**
 * Clase principal de la aplicación Llanquihue Tour.
 *
 * <p>Presenta una interfaz gráfica básica mediante
 * {@link JOptionPane}, permitiendo registrar y visualizar
 * distintas entidades de la agencia.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class LlanquihueTourApp {

    private static GestorEntidades gestor = new GestorEntidades();

    /**
     * Inicia la aplicación y muestra el menú principal.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    /**
     * Muestra el menú principal hasta que el usuario
     * seleccione la opción de salida.
     */
    private static void mostrarMenuPrincipal() {
        int opcion;

        do {
            String menu = """
                    LLANQUIHUE TOUR
                                        
                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar entidades registradas
                    5. Salir
                                        
                    Seleccione una opción:
                    """;

            String entrada = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "Llanquihue Tour",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                opcion = 5;
            } else {
                opcion = convertirEntero(entrada);
            }

            switch (opcion) {
                case 1:
                    registrarGuiaTuristico();
                    break;

                case 2:
                    registrarVehiculo();
                    break;

                case 3:
                    registrarColaboradorExterno();
                    break;

                case 4:
                    mostrarEntidades();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado.",
                            "Llanquihue Tour",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Seleccione una opción válida.",
                            "Opción incorrecta",
                            JOptionPane.WARNING_MESSAGE
                    );
            }

        } while (opcion != 5);
    }

    /**
     * Solicita los datos y registra un guía turístico.
     */
    private static void registrarGuiaTuristico() {
        String nombre = solicitarTexto("Ingrese el nombre del guía:");
        String correo = solicitarTexto("Ingrese el correo del guía:");
        int edad = solicitarNumero("Ingrese la edad del guía:");
        String idioma = solicitarTexto("Ingrese el idioma principal:");
        int aniosExperiencia = solicitarNumero(
                "Ingrese los años de experiencia:"
        );

        GuiaTuristico guia = new GuiaTuristico(
                nombre,
                correo,
                edad,
                idioma,
                aniosExperiencia
        );

        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente.\n\n"
                        + guia.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Solicita los datos y registra un vehículo.
     */
    private static void registrarVehiculo() {
        String patente = solicitarTexto("Ingrese la patente del vehículo:");
        String modelo = solicitarTexto("Ingrese el modelo del vehículo:");
        int capacidad = solicitarNumero(
                "Ingrese la capacidad de pasajeros:"
        );

        Vehiculo vehiculo = new Vehiculo(
                patente,
                modelo,
                capacidad
        );

        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente.\n\n"
                        + vehiculo.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Solicita los datos y registra un colaborador externo.
     */
    private static void registrarColaboradorExterno() {
        String nombre = solicitarTexto(
                "Ingrese el nombre del colaborador:"
        );
        String correo = solicitarTexto(
                "Ingrese el correo del colaborador:"
        );
        int edad = solicitarNumero(
                "Ingrese la edad del colaborador:"
        );
        String especialidad = solicitarTexto(
                "Ingrese la especialidad:"
        );
        String empresa = solicitarTexto(
                "Ingrese la empresa del colaborador:"
        );

        ColaboradorExterno colaborador = new ColaboradorExterno(
                nombre,
                correo,
                edad,
                especialidad,
                empresa
        );

        gestor.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                null,
                "Colaborador registrado correctamente.\n\n"
                        + colaborador.mostrarResumen(),
                "Registro exitoso",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Muestra todos los objetos almacenados en la colección.
     */
    private static void mostrarEntidades() {
        String resumen = gestor.mostrarEntidades();

        resumen += "\nCantidad total de registros: "
                + gestor.obtenerCantidadEntidades();

        JOptionPane.showMessageDialog(
                null,
                resumen,
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Solicita un texto y evita que se almacenen valores vacíos.
     *
     * @param mensaje texto que se mostrará al usuario
     * @return texto ingresado por el usuario
     */
    private static String solicitarTexto(String mensaje) {
        String texto;

        do {
            texto = JOptionPane.showInputDialog(
                    null,
                    mensaje,
                    "Ingreso de datos",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (texto == null || texto.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "El dato no puede quedar vacío.",
                        "Dato obligatorio",
                        JOptionPane.WARNING_MESSAGE
                );
            }

        } while (texto == null || texto.trim().isEmpty());

        return texto.trim();
    }

    /**
     * Solicita un número entero positivo.
     *
     * @param mensaje texto que se mostrará al usuario
     * @return número entero positivo ingresado
     */
    private static int solicitarNumero(String mensaje) {
        int numero;

        do {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    mensaje,
                    "Ingreso de datos",
                    JOptionPane.QUESTION_MESSAGE
            );

            numero = convertirEntero(entrada);

            if (numero <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese un número entero mayor que cero.",
                        "Dato incorrecto",
                        JOptionPane.WARNING_MESSAGE
                );
            }

        } while (numero <= 0);

        return numero;
    }

    /**
     * Convierte un texto a número entero.
     *
     * @param texto texto que se desea convertir
     * @return número convertido o -1 si el texto no es válido
     */
    private static int convertirEntero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException | NullPointerException error) {
            return -1;
        }
    }
}