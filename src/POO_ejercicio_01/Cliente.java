package POO_ejercicio_01;

import java.time.LocalDate;

/**
 *
 * @author ivanc
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private LocalDate fNacimiento;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public Cliente(String nombre, String apellidos, String direccion, String localidad, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    public String direccionCompleta() {
        return this.direccion + ", " + this.localidad;
    }

}
