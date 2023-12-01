/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Albergue;
import Modelo.AlbergueBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class AlbergueController implements AlbergueBD{
    
    public String query;
    
    
    @Override
    public boolean Crear(Connection link, Albergue albergue){
        try
        {
            Statement s = link.createStatement();
            query="INSERT INTO Albergue(IdAlbergue,Calle,Numero,Region,Comuna,Encargado,Capacidad)"
                    + "VALUES('"+albergue.getIdAlbergue()+"','"+albergue.getCalle()+"','"+albergue.getNumero()+"','"+albergue.getRegion()
                    +"','"+albergue.getComuna()+"','"+albergue.getEncargado()+"','"+albergue.getCapacidad() +"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public ArrayList<Albergue> Leer(Connection link){
        
        try
        {
            Statement s = link.createStatement();
            query="select * from Voluntario";
            ResultSet rs=s.executeQuery(query);
            while (rs.next())
            {
               Albergue albergue=new Albergue();
               //SETS
               albergue.setIdAlbergue(rs.getInt("IdAlbergue"));
               albergue.setCalle(rs.getString("Calle"));
               albergue.setNumero(rs.getInt("Numero"));
               albergue.setRegion(rs.getString("Region"));
               albergue.setComuna(rs.getString("Comuna"));
               albergue.setEncargado(rs.getString("Encargado"));
               albergue.setCapacidad(rs.getInt("Capacidad"));
               
               listaAlbergue.add(albergue);
                
            }
            
            return listaAlbergue;
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    @Override
    public boolean Actualizar(Connection link, Albergue albergue){
        
         try
        {
            Statement s = link.createStatement();
            query="UPDATE Albergue set IdAlbergue='"+albergue.getIdAlbergue()+"',Calle='"+albergue.getCalle()+"',Numero='"+albergue.getNumero()
                    +"',Region='"+albergue.getRegion()+"',Comuna='"+albergue.getComuna()+"',Encargado='"+albergue.getEncargado()
                    +"',Capacidad='"+albergue.getCapacidad() +"' WHERE IdAlbergue='"+albergue.getIdAlbergue()+"'";
            //Ya que es un update se debe utilizar executeUpdate(Lo mismo para el caso del delete)
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public boolean Eliminar(Connection link, int idAlbergue){
        
        try 
        {
            Statement s = link.createStatement();
            query="DELETE FROM Albergue WHERE idAlbergue='"+idAlbergue+ "'";
            s.executeUpdate(query);
            
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public Albergue Buscar(Connection link, int IdAlbergue)
    {
        Albergue albergue = new Albergue();
        
        try 
        {
            Statement s = link.createStatement();
            query="select * from Albergue where IdAlbergue='"+IdAlbergue+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
            while (rs.next())
            {
               albergue.setIdAlbergue(rs.getInt("IdAlbergue"));
               albergue.setCalle(rs.getString("Calle"));
               albergue.setNumero(rs.getInt("Numero"));
               albergue.setRegion(rs.getString("Region"));
               albergue.setComuna(rs.getString("Comuna"));
               albergue.setEncargado(rs.getString("Encargado"));
               albergue.setCapacidad(rs.getInt("Capacidad"));
            }
            return albergue;
  
            
        } catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
}
