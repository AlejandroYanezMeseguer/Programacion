
package boletin3.pkg2;
import java.util.Scanner;
public class Boletin32 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Escribe una temperatura en grados celsius");
         double tmp = sc.nextDouble();
         
         double fg = tmp *1.8+32;
         double kv = tmp +273.15;
         
         System.out.println(tmp+ " grados celsius equivalen a "+ kv + " grados kelvin y a "+ fg + " grados fahrenheit");
        
        
        
        
        
    }
    
}
