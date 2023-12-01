/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public interface VoluntarioBD {
    
    ArrayList<Voluntario>listaVoluntario= new ArrayList<Voluntario>();
    public boolean Crear(Connection link, Voluntario voluntario);
    public boolean Actualizar(Connection link, Voluntario voluntario);
    public boolean Eliminar(Connection link, String rutVoluntario);
    public ArrayList<Voluntario>Leer(Connection link);
    public Voluntario Buscar(Connection link, String rutVoluntario);
    
}
