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
public interface TareaBD {
    
    ArrayList<Tarea>listaTareas=new ArrayList<Tarea>();
    public void Crear();
    public void Actualizar();
    public void Eliminar();
    public void Leer();
}
