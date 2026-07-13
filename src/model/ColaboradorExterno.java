package model;

/**
 * Representa a un colaborador externo que presta servicios
 * a la agencia Llanquihue Tour.
 *
 * <p>Hereda de {@link Persona} e implementa
 * el comportamiento definido por {@link Registrable}.</p>
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class ColaboradorExterno extends Persona implements Registrable {

    private String especialidad;
    private String empresa;

    /**
     * Construye un colaborador externo.
     *
     * @param nombre nombre del colaborador
     * @param correo correo electrónico del colaborador
     * @param edad edad del colaborador
     * @param especialidad especialidad del colaborador
     * @param empresa empresa a la que pertenece
     */
    public ColaboradorExterno(
            String nombre,
            String correo,
            int edad,
            String especialidad,
            String empresa
    ) {
        super(nombre, correo, edad);
        this.especialidad = especialidad;
        this.empresa = empresa;
    }

    /**
     * Obtiene la especialidad del colaborador.
     *
     * @return especialidad del colaborador
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Obtiene la empresa del colaborador.
     *
     * @return empresa del colaborador
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Genera un resumen personalizado del colaborador externo.
     *
     * @return resumen con los datos del colaborador
     */
    @Override
    public String mostrarResumen() {
        return "COLABORADOR EXTERNO\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Especialidad: " + especialidad + "\n"
                + "Empresa: " + empresa;
    }
}