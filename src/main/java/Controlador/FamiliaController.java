/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Familia;
import Modelo.FamiliaBD;
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
public class FamiliaController implements FamiliaBD{
    
    public String query;
    
    @Override
    public boolean Crear(Connection link, Familia familia){
        
        //Afuera se crean los familiares, de ahi tambien debemos saber la cantidad total de integrantes
        //Insertar nueva familia(Idfamilia y cantidad de integrantes)
        try
        {
            Statement s = link.createStatement();
            query="INSERT INTO Familia(IdFamilia, CantidadIntegrantes, idCasa, idAlbergue)"
                    + "VALUES('"+familia.getIdFamilia()+"','"+familia.getListaFamilia().size()+"','"+familia.getIdCasa()+"','"+familia.getIdAlbergue()
                    +"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
        
    }
    
    
    @Override
    public ArrayList<Familia>Leer(Connection link){
        try
        {
            Statement s = link.createStatement();
            query="select * from Familia";
            ResultSet rs=s.executeQuery(query);
            while (rs.next())
            {
               Familia familia=new Familia();
               familia.setIdFamilia(rs.getInt("IdFamilia"));
               familia.setCantIntegrantes(rs.getInt("CantidadIntegrantes"));
               familia.setIdCasa(rs.getInt("IdCasa"));
               familia.setIdAlbergue(rs.getInt("IdAlbergue"));
               listaFamilia.add(familia);
                
            }
            
            return listaFamilia;
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    @Override
    public boolean Actualizar(Connection link, Familia familia){
        try
        {
            Statement s = link.createStatement();
            query="UPDATE Familia set IdFamilia='"+familia.getIdFamilia()+"',CantidadIntegrantes='"+familia.getCantIntegrantes()
                    +"',IdCasa='"+familia.getIdCasa()+"',IdAlbergue='"+familia.getIdAlbergue()
                    +"' WHERE IdFamilia='"+familia.getIdFamilia()+"'";
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
    public boolean Eliminar(Connection link, int IdFamilia){
        try 
        {
            Statement s = link.createStatement();
            query="DELETE FROM Familia WHERE IdFamilia='"+IdFamilia+ "'";
            s.executeUpdate(query);
            
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public Familia Buscar(Connection link, int IdFamilia)
    {
        Familia familia = new Familia();
        
        try 
        {
            Statement s = link.createStatement();
            query="select * from Familia where IdFamilia='"+IdFamilia+"'";
            ResultSet rs=s.executeQuery(query);
            
   
            while (rs.next())
            {
               familia.setIdFamilia(IdFamilia);
               familia.setCantIntegrantes(rs.getInt("CantidadIntegrantes"));
               familia.setIdCasa(rs.getInt("IdCasa"));
               familia.setIdAlbergue(rs.getInt("IdAlbergue"));
            }
            return familia;
  
            
        } catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
        
        
    }
    
    
}
