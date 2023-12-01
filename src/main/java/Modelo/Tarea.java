/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;



/**
 *
 * @author alexa
 */
public class Tarea {
    
    private String tipoTarea;
    private LocalDate fechaInicio;
    private LocalDate fechaObjetivo;
    private int idCasa;

    public Tarea() {
    }

    public Tarea(String tipoTarea, LocalDate fechaInicio, LocalDate fechaObjetivo, int idCasa) {
        this.tipoTarea = tipoTarea;
        this.fechaInicio = fechaInicio;
        this.fechaObjetivo = fechaObjetivo;
        this.idCasa= idCasa;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaObjetivo() {
        return fechaObjetivo;
    }

    public void setFechaObjetivo(LocalDate fechaObjetivo) {
        this.fechaObjetivo = fechaObjetivo;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    
    
    
}
