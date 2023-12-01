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
public interface CasaBD {
    ArrayList<Casa>listaCasa=new ArrayList<Casa>();
    public boolean Crear(Connection link, Casa casa);
    public boolean Actualizar(Connection link, Casa casa);
    public boolean Eliminar(Connection link, int IdCasa);
    public Casa Buscar(Connection link, int IdCasa);
    public ArrayList<Casa>Leer(Connection link);
}
