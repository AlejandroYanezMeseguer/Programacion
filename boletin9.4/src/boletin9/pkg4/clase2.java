                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
package boletin9.pkg4;
import java.util.Scanner;
public class clase2 {
    public void CompararStrings(){
        final String miNombre = "bascomias";
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina mi nombre: ");

        while (true) {
            String intento = sc.next();
            if(intento.equals(miNombre)) {
            System.out.println("Acertaste!");
                break;} 
            else {System.out.println("Nombre incorrecto intentalo de nuevo!");}
        }
    }
}