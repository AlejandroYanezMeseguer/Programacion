
package boletin.pkg3.pkg1;
import java.util.Scanner;
public class Boletin31 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
         System.out.println("escribe el precio que cuesta el prodcuto");
         float pi = sc.nextFloat();
         
         System.out.println("escribe el precio que has pagado por el prodcuto");
         float pp = sc.nextFloat();
         
         float dif=pi-pp;
         float porc=100*dif/pi;
         
         System.out.println("has pagado un "+ porc+ "% " + "menos");
       
        
        
        
        
    }
    
}
