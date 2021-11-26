package modelo;

import java.util.Date;

/**
 *
 * @author jenny
 * @version 25-11-2021
 */
public class Datoscita {
    
    private int rut;
    private String nombre,apellido;
    private int telefono;
    private int edad;
    private String prevision, doctor, especialidad;
    private Date fecha;
    private int valor;

    public Datoscita() {
    }

    public Datoscita(int rut, String nombre, String apellido, int telefono, int edad, String prevision, String doctor, String especialidad, Date fecha, int valor) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.prevision = prevision;
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.valor = valor;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
