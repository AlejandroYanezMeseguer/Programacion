package boletin17;

import javax.swing.JOptionPane;

public class LeerDatosJOP {
    
    //leer numero de tipo int
    public static int LeerInt(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));    
    }
    
    
    //leer numero de tipo float
    public static float LeerFloat(String mensaje) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));  
    }
    
    
    //leer numero de tipo double
    public static double LeerDouble(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));  
    }    
        
    
    //leer variable tipo string
     public static String LeerString(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
