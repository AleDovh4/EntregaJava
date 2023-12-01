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
public interface FamiliaBD {
    
    
    ArrayList<Familia>listaFamilia=new ArrayList<Familia>();
    public boolean Crear(Connection link, Familia familia);
    public boolean Actualizar(Connection link, Familia familia);
    public boolean Eliminar(Connection link, int IdFamilia);
    public Familia Buscar(Connection link, int IdFamilia);
    public ArrayList<Familia>Leer(Connection link);
}
