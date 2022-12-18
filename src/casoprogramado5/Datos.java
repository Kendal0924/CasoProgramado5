/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoprogramado5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kendal Angulo
 */
public class Datos {
    
     public void EscribirEnArchivo(Especie pez) {
        try {
            ArrayList<Especie> especies = LeerDatosDeArchivo();
            especies.add(pez);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("InventarioPeces.txt"));
            for (Especie esp : especies) {
                os.writeObject(esp);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

 

    public ArrayList<Especie> LeerDatosDeArchivo() {
        ArrayList<Especie> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("InventarioPeces.txt"));

 

            Especie pez = null;
            pez = (Especie) s.readObject();
            while (pez != null) {
                datos.add(pez);
                pez = (Especie) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(datos);
        }
        return datos;
    }
    
}
    

