
package boletin1.pkg5;
import java.util.Scanner;
public class Boletin15 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
        System.out.println("Escribe el numero de millas a pasar a metros");
        double millas = sc.nextDouble();
        
        double metros = millas*1852;
        
        System.out.println(millas +"millas = "+ metros +"metros");
        
        
    }
    
}
