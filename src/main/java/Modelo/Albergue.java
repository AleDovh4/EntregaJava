/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Albergue {
    
    private String calle;
    private int numero;
    private String region;
    private String comuna;
    private String encargado;
    private int capacidad;
    private int idAlbergue;

    public Albergue() {
    }

    public Albergue(String calle, int numero, String region, String comuna, String encargado, int capacidad, int idAlbergue) {
        this.calle = calle;
        this.numero = numero;
        this.region = region;
        this.comuna = comuna;
        this.encargado = encargado;
        this.capacidad = capacidad;
        this.idAlbergue= idAlbergue;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdAlbergue() {
        return idAlbergue;
    }

    public void setIdAlbergue(int idAlbergue) {
        this.idAlbergue = idAlbergue;
    }
    
    
    
}
