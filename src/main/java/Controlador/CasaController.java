/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Casa;
import Modelo.CasaBD;
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
public class CasaController implements CasaBD{
    
    public String query;
    
    @Override
    public boolean Crear(Connection link, Casa casa){
        try
        {
            Statement s = link.createStatement();
            query="INSERT INTO Casa(IdCasa,Calle,Numero,Region,Comuna,Estado)"
                    + "VALUES('"+casa.getIdCasa()+"','"+casa.getCalle()+"','"+casa.getNumero()+"','"+casa.getRegion()+"','"+casa.getComuna()
                    +"','"+casa.getEstado()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public ArrayList<Casa>Leer(Connection link){
        try
        {
            Statement s = link.createStatement();
            query="select * from Casa";
            ResultSet rs=s.executeQuery(query);
            while (rs.next())
            {
               Casa casa=new Casa();
               //Los sets
               casa.setIdCasa(rs.getInt("IdCasa"));
               casa.setCalle(rs.getString("Calle"));
               casa.setNumero(rs.getInt("Numero"));
               casa.setRegion(rs.getString("Region"));
               casa.setComuna(rs.getString("Comuna"));
               casa.setEstado(rs.getString("Estado"));
               listaCasa.add(casa);
                
            }
            
            return listaCasa;
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    
    @Override
    public boolean Actualizar(Connection link, Casa casa){
        
        try
        {
            Statement s = link.createStatement();
            query="UPDATE Casa set IdCasa='"+casa.getIdCasa()+"',Calle='"+casa.getCalle()+"',Numero='"+casa.getNumero()+"',Region='"+casa.getRegion()
                    +"',Comuna='"+casa.getComuna()+"',Estado='"+casa.getEstado()
                    +"' WHERE IdCasa='"+casa.getIdCasa()+"'";
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
    public boolean Eliminar(Connection link, int IdCasa){
        
        try 
        {
            Statement s = link.createStatement();
            query="DELETE FROM Casa WHERE IdCasa='"+IdCasa+ "'";
            s.executeUpdate(query);
            
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public Casa Buscar(Connection link, int IdCasa)
    {
        Casa casa = new Casa();
        try 
        {
            Statement s = link.createStatement();
            query="select * from Casa where IdCasa='"+IdCasa+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next())
            {
               casa.setIdCasa(rs.getInt("IdCasa"));
               casa.setCalle(rs.getString("Calle"));
               casa.setNumero(rs.getInt("Numero"));
               casa.setRegion(rs.getString("Region"));
               casa.setComuna(rs.getString("Comuna"));
               casa.setEstado(rs.getString("Estado"));
            }
            return casa;
  
            
        } catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
}
