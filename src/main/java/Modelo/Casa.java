/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexa
 */
public class Casa {
    
    private String calle;
    private int numero;
    private String region;
    private String comuna;
    private String estado;
    private int IdCasa;

    public Casa() {
    }

    public Casa(String calle, int numero, String region, String comuna, String estado, int IdCasa) {
        this.calle = calle;
        this.numero = numero;
        this.region = region;
        this.comuna = comuna;
        this.estado = estado;
        this.IdCasa=IdCasa;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCasa() {
        return IdCasa;
    }

    public void setIdCasa(int IdCasa) {
        this.IdCasa = IdCasa;
    }
    
    
    
}
