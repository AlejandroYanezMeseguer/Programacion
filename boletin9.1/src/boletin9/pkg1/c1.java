
package boletin9.pkg1;
import java.util.Scanner;
public class c1 {
    public void mtd1 (){
        Scanner sc = new Scanner(System.in);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int num = 0;
        
        while(num<10){
            System.out.println("Teclea un nuevo numero");
            int dato = sc.nextInt();
            
            if (dato<0){
                i1++;}
            
            if (dato==0){
                i2++;}
            
            if (dato>0){
                i3++;}
            
            num++;
            
            System.out.println("numeros positivos: "+ i3);
            System.out.println("numeros negativos: "+ i1);
            System.out.println("ceros: "+ i2);
        }
    }
}