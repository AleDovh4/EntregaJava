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
public interface FamiliarBD {
    
    ArrayList<Familiar>listaFamiliar=new ArrayList<Familiar>();
    public boolean Crear(Connection link, Familiar familiar);
    public boolean Actualizar(Connection link, Familiar familiar);
    public boolean Eliminar(Connection link, String rutFamiliar);
    public Familiar Buscar(Connection link, String rutFamiliar);
    public ArrayList<Familiar>Leer(Connection link);
    
}
