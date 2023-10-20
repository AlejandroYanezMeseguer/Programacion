package boletin7.pkg4;
import java.util.Scanner;
public class Boletin74 {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        class4 obj = new class4();
        
        System.out.println("escribe el nombre de 2 personas y sus pesos");
        
        obj.metodo4(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
        
        
    }
    
}
