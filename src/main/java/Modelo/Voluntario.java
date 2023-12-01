/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Voluntario extends Persona{
    
    private String correo;
    private String profesion;
    private String fortaleza;
    private String debilidad;
    private String calle;
    private int numeroCalle;
    private String Region;
    private int activo;
    private int idTarea;

    public Voluntario() {
        
    }

    public Voluntario(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int telefono, String correo, String profesion, String fortaleza, String debilidad, String calle, int numeroCalle, String Region, int activo, int idTarea) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, edad, telefono);
        this.correo = correo;
        this.profesion = profesion;
        this.fortaleza = fortaleza;
        this.debilidad = debilidad;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.Region = Region;
        this.activo = activo;
        this.idTarea= idTarea;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    
    @Override
    public void cambiarEstado() {
        if(activo == 1)
            activo =0;
        else
            activo=1;
    }
    
}
