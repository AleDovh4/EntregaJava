/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Voluntario;
import Modelo.VoluntarioBD;
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
public class VoluntarioController implements VoluntarioBD{
    
    public String query;

    public VoluntarioController() {
    }
    
    @Override
    public boolean Crear(Connection link, Voluntario voluntario)
    {
    //Crea una consulta para insertar datos en la tabla, recibiendo Un voluntario a ingresar
        try
        {
            Statement s = link.createStatement();
            query="INSERT INTO Voluntario(RutVoluntario,Activo,Nombre,ApellidoPaterno,ApellidoMaterno,Edad,Telefono,Correo,Profesion,Debilidad,Fortaleza,Calle,Numero,Region,IdTarea)"
                    + "VALUES('"+voluntario.getRut()+"','"+voluntario.getActivo()+"','"+voluntario.getNombre()+"','"+voluntario.getApellidoPaterno()+
                    "','"+voluntario.getApellidoMaterno()+"','"+voluntario.getEdad()+"','"+voluntario.getTelefono()+"','"+voluntario.getCorreo()+
                    "','"+voluntario.getProfesion()+"','"+voluntario.getDebilidad()+"','"+voluntario.getFortaleza()+"','"+voluntario.getCalle()+"','"
                    +voluntario.getNumeroCalle()+"','"+voluntario.getRegion()+"','"+voluntario.getIdTarea()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    @Override
    public boolean Actualizar(Connection link, Voluntario voluntario)
    {
    //Recibe un voluntario con los datos cambiados, utilizamos su rut para Generar un update con los nuevos valores
        try
        {
            Statement s = link.createStatement();
            query="UPDATE Voluntario set RutVoluntario='"+voluntario.getRut()+"',Activo='"+voluntario.getActivo()+"',Nombre='"+voluntario.getNombre()+"'"
                    + ",ApellidoPaterno='"+voluntario.getApellidoPaterno()+"',ApellidoMaterno='"+voluntario.getApellidoMaterno()+"',Edad='"+voluntario.getEdad()+
                    "',Telefono='"+voluntario.getTelefono()+"',Correo='"+voluntario.getCorreo()+"',Profesion='"+voluntario.getProfesion()+"'"
                    + ",Debilidad='"+voluntario.getDebilidad()+"',Fortaleza='"+voluntario.getFortaleza()+"',Calle='"+voluntario.getCalle()+
                    "',Numero='"+voluntario.getNumeroCalle()+"',Region='"+voluntario.getRegion()+"',IdTarea='"+voluntario.getIdTarea()+"' WHERE RutVoluntario='"+voluntario.getRut()+"'";
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
    public boolean Eliminar(Connection link, String rutVoluntario)
    {
    //Recibimos un rut, para luego buscarlo en la consulta y eliminar la tupla de la tabla, se aplica executeUpdate por el mismo motivo
        try 
        {
            Statement s = link.createStatement();
            query="DELETE FROM Voluntario WHERE RutVoluntario='"+rutVoluntario+ "'";
            s.executeUpdate(query);
            
            return true;
            
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return false;
    }
    
    
    @Override
    public ArrayList<Voluntario>Leer(Connection link)
    {
    //Ejecutamos la lectura de todos los datos y devolvemos un arraylist de la tabla correspondiente
        try
        {
            Statement s = link.createStatement();
            query="select * from Voluntario";
            ResultSet rs=s.executeQuery(query);
            while (rs.next())
            {
               Voluntario voluntario=new Voluntario();
               voluntario.setRut(rs.getString("RutVoluntario"));
               voluntario.setActivo(rs.getInt("Activo"));
               voluntario.setNombre(rs.getString("Nombre"));
               voluntario.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               voluntario.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               voluntario.setEdad(rs.getInt("Edad"));
               voluntario.setTelefono(rs.getInt("Telefono"));
               voluntario.setCorreo(rs.getString("Correo"));
               voluntario.setProfesion(rs.getString("Profesion"));
               voluntario.setDebilidad(rs.getString("Debilidad"));
               voluntario.setFortaleza(rs.getString("Fortaleza"));
               voluntario.setCalle(rs.getString("Calle"));
               voluntario.setNumeroCalle(rs.getInt("Numero"));
               voluntario.setRegion(rs.getString("Region"));
               voluntario.setIdTarea(rs.getInt("IdTarea"));
               listaVoluntario.add(voluntario);
                
            }
            
            return listaVoluntario;
        }catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    
    
    @Override
    public Voluntario Buscar(Connection link, String rutVoluntario)
    {
    //Recibir un rut, para buscarlo en la tabla y devolver la tupla completa
        Voluntario voluntario = new Voluntario();
        
        try 
        {
            Statement s = link.createStatement();
            query="select * from Voluntario where RutVoluntario='"+rutVoluntario+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next())
            {
               voluntario.setRut(rs.getString("RutVoluntario"));
               voluntario.setActivo(rs.getInt("Activo"));
               voluntario.setNombre(rs.getString("Nombre"));
               voluntario.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               voluntario.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               voluntario.setEdad(rs.getInt("Edad"));
               voluntario.setTelefono(rs.getInt("Telefono"));
               voluntario.setCorreo(rs.getString("Correo"));
               voluntario.setProfesion(rs.getString("Profesion"));
               voluntario.setDebilidad(rs.getString("Debilidad"));
               voluntario.setFortaleza(rs.getString("Fortaleza"));
               voluntario.setCalle(rs.getString("Calle"));
               voluntario.setNumeroCalle(rs.getInt("Numero"));
               voluntario.setRegion(rs.getString("Region"));
               voluntario.setIdTarea(rs.getInt("IdTarea"));
            }
            return voluntario;
  
            
        } catch (SQLException ex) 
            {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
}
