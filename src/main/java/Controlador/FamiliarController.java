/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Familiar;
import Modelo.FamiliarBD;
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
public class FamiliarController implements FamiliarBD{
 
    public String query;

    public FamiliarController() {
    }
    
    @Override
    public boolean Crear(Connection link, Familiar familiar){
        
        try
        {
            Statement s = link.createStatement();
            query="INSERT INTO Familiar(RutFamiliar,Alojamiento,Nombre,ApellidoPaterno,ApellidoMaterno,Edad,Telefono,IdFamilia)"
                    + "VALUES('"+familiar.getRut()+"','"+familiar.getAlojamiento()+"','"+familiar.getNombre()+"','"+familiar.getApellidoPaterno()
                    +"','"+familiar.getApellidoMaterno()+"','"+familiar.getEdad()+"','"+familiar.getTelefono()+"','"+familiar.getIdFamilia() +"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public ArrayList<Familiar>Leer(Connection link){
        try
        {
            Statement s = link.createStatement();
            query="select * from Familiar";
            ResultSet rs=s.executeQuery(query);
            while (rs.next())
            {
               Familiar familiar=new Familiar();
               familiar.setRut(rs.getString("RutFamiliar"));
               familiar.setAlojamiento(rs.getInt("Alojamiento"));
               familiar.setNombre(rs.getString("Nombre"));
               familiar.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               familiar.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               familiar.setEdad(rs.getInt("Edad"));
               familiar.setTelefono(rs.getInt("Telefono"));
               familiar.setIdFamilia(rs.getInt("IdFamilia"));
               
               listaFamiliar.add(familiar);
                
            }
            
            return listaFamiliar;
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    public boolean Actualizar(Connection link, Familiar familiar){
        
        try
        {
            Statement s = link.createStatement();
            query="UPDATE Familiar set RutFamiliar='"+familiar.getRut()+"',Alojamiento='"+familiar.getAlojamiento()+"',Nombre='"+familiar.getNombre()+"'"
                    + ",ApellidoPaterno='"+familiar.getApellidoPaterno()+"',ApellidoMaterno='"+familiar.getApellidoMaterno()
                    +"',Edad='"+familiar.getEdad()+"',Telefono='"+familiar.getTelefono()+"',IdFamilia='"+familiar.getIdFamilia()+"' WHERE RutFamiliar='"+familiar.getRut()+"'";
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
    public boolean Eliminar(Connection link, String rutFamiliar){
        try 
        {
            Statement s = link.createStatement();
            query="DELETE FROM Familiar WHERE RutFamiliar='"+rutFamiliar+ "'";
            s.executeUpdate(query);
            
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public Familiar Buscar(Connection link, String rutFamiliar)
    {
    
        Familiar familiar=new Familiar();
        
        try 
        {
            Statement s = link.createStatement();
            query="select * from Familiar where RutFamiliar='"+rutFamiliar+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next())
            {
               familiar.setRut(rutFamiliar);
               familiar.setAlojamiento(rs.getInt("Alojamiento"));
               familiar.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               familiar.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               familiar.setEdad(rs.getInt("Edad"));
               familiar.setTelefono(rs.getInt("Telefono"));
               familiar.setIdFamilia(rs.getInt("IdFamilia"));
               
            }
            return familiar;
  
            
        } catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    //BUSCAR
}
