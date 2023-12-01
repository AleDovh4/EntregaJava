/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Familia {
    
    private ArrayList<Familiar> listaFamilia;
    private int idFamilia;
    private int cantIntegrantes;
    private int idAlbergue;
    private int idCasa;

    public Familia() {
    }

    public Familia(ArrayList<Familiar> listaFamilia, int idFamilia, int cantIntegrantes, int idAlbergue, int idCasa) {
        this.listaFamilia = listaFamilia;
        this.idFamilia = idFamilia;
        this.cantIntegrantes= cantIntegrantes;
        this.idAlbergue= idAlbergue;
    }

    public ArrayList<Familiar> getListaFamilia() {
        return listaFamilia;
    }

    public void setListaFamilia(ArrayList<Familiar> listaFamilia) {
        this.listaFamilia = listaFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public int getCantIntegrantes() {
        return cantIntegrantes;
    }

    public void setCantIntegrantes(int cantIntegrantes) {
        this.cantIntegrantes = cantIntegrantes;
    }

    public int getIdAlbergue() {
        return idAlbergue;
    }

    public void setIdAlbergue(int idAlbergue) {
        this.idAlbergue = idAlbergue;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
    
}
