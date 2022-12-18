/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoprogramado5;

import java.io.Serializable;
import datosdb.DBConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kendal Angulo
 */
public class Especie implements Serializable {
    

    private String nombreEspecie;
    private int cantPeces;
    private String categoria;
    private int precio;
    private int idEspecie;

//    public Especie(String nombreEspecie, int cantPeces, String categoria, int precio) {
//        this.nombreEspecie = nombreEspecie;
//        this.cantPeces = cantPeces;
//        this.categoria = categoria;
//        this.precio = precio;
//    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public int getCantPeces() {
        return cantPeces;
    }

    public void setCantPeces(int cantPeces) {
        this.cantPeces = cantPeces;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }
    
    

    @Override
    public String toString() {
        return "Especie{" + "nombreEspecie=" + nombreEspecie + ", cantPeces=" + cantPeces + ", categoria=" + categoria + ", precio=" + precio + '}';
    }

    
    
            //********************************************************************************
   public void InsertCargo()
   {
       try 
       {
            DBConexion db=new DBConexion();
           Connection con= db.getConnection();
           PreparedStatement st=con.prepareStatement("insert into estudiantes."
                   + "especie(idEspecie,nombreEspecie, cantPeces,"
                   + "categoria, precio) VALUES (?,?,?,?,?)");
           st.setInt(1, idEspecie);
           st.setString(2, nombreEspecie);
           st.setInt(3, cantPeces);
           st.setString(4, categoria);
           st.setInt(5, precio);
           st.executeUpdate();
       } 
       catch (Exception e)
       {
            JOptionPane.showMessageDialog(null, e.getMessage());
       }               
   }
     //********************************************************************************
//     public void ActualizarCargo()
//   {
//       try 
//       {
//            DBConexion db=new DBConexion();
//           Connection con= db.getConnection();
//           PreparedStatement st=con.prepareStatement("update tiquetera.cargo set Cargo= '"+Cargo+"' where IdCargo="+IdCargo);
//           st.execute();
//       } 
//       catch (Exception e)
//       {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//       }
//   }
     //******************************************************************************************************
//    public void EliminarCargo()
//   {
//       try 
//       {
//           DBConexion dbc=new DBConexion();
//           Connection con= dbc.getConnection();
//           PreparedStatement st=con.prepareStatement("delete from tiquetera.cargo where IdCargo="+IdCargo);
//           st.execute();
//       } 
//       catch (Exception e)
//       {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//       }
//   }
    


}
