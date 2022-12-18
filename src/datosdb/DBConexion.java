
package datosdb;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConexion {
     public   static  String Driver      ="com.mysql.jdbc.Driver";
    public   static String Usuario    ="root";
    public   static String Password ="1234";
    public   static String Url           ="jdbc:mysql://localhost:3306/estudiantes";
    
    static{
    try 
        {
            Class.forName(Driver);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
     public Connection getConnection()
    {   
            Connection con=null;
            try 
            {
            con= (Connection) DriverManager.getConnection(Url,Usuario,Password);
             //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex, "Error de conexion", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
