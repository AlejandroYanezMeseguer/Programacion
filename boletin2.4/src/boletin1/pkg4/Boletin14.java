
package boletin1.pkg4;
import java.util.Scanner;
public class Boletin14 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
         
        System.out.println("Escribe un numero");
        double n1 = sc.nextDouble();
        
        System.out.println("Escribe otro numero para hacer la suma, la resta, el producto y el cociente con el anterior");
        double n2 = sc.nextDouble();
        
        double suma = n1+n2;
        double resta = n1-n2;
        double prod = n1*n2;
        double coc = n1/n2;
        
        System.out.println("suma="+ suma);  
        System.out.println("resta="+ resta); 
        System.out.println("producto="+ prod);
        System.out.println("cociente="+ coc);
    }
    
}
