
package boletin6.pkg2;
import javax.swing.*;
public class Boletin62 {

    public static void main(String[] args) {
        // TODO code application logic here
         
        double meridiano = Double.parseDouble(JOptionPane.showInputDialog("introduce meridiano"));
        double paralelo = Double.parseDouble(JOptionPane.showInputDialog("introduce paralelo"));
        double distanciaTerra = Double.parseDouble(JOptionPane.showInputDialog("introduce la distancia conla tierra"));
 
        satelite obj = new satelite(meridiano, paralelo, distanciaTerra); 
        obj.verPosicion();
        
        
        
    }
    
}
