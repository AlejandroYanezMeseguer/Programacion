
package boletin1.pkg3;
import java.util.Scanner;
public class Boletin13 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("escribe la cantidad de euros a cambiar:");
        float euro = sc.nextFloat();
        
        System.out.println("escribe el cambio euro-dolar:");
        float cambio = sc.nextFloat();
        
        float dolar = euro*cambio;
        System.out.println("tienes" + dolar +"dolares");
        
    }
    
}
