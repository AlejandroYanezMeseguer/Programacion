
package boletin6.pkg3;
import java.util.Scanner;
public class Boletin63 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        circulo cir = new circulo();
        
        System.out.println("introduce el radio de un circulo para calclar su area");
        cir.calcArea(sc.nextDouble());
         System.out.println("introduce el radio de un circulo para calclar su longitud");
        cir.calcLonxitude(sc.nextDouble());
        
    }
    
}
