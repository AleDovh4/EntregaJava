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
public interface AlbergueBD {
    ArrayList<Albergue>listaAlbergue=new ArrayList<Albergue>();
    public boolean Crear(Connection link, Albergue albergue);
    public boolean Actualizar(Connection link, Albergue albergue);
    public boolean Eliminar(Connection link, int idAlbergue);
    public Albergue Buscar(Connection link, int IdAlbergue);
    public ArrayList<Albergue> Leer(Connection link);
}
