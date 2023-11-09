package boletin8.pkg7;
import java.util.Scanner;
public class Boletin87 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        class7 ob1 = new class7();
        
        System.out.println("introduce la figura de la que quieres calcular el area entre las siguientes opcione \n 1= cuadrado \n 2= triangulo \n 3= circulo");
        
        int cd = sc.nextInt();
               
        switch(cd){
        
             case 1: ob1.Cuadrado();break;
            case 2: ob1.Triangulo();break;
            case 3: ob1.Circulo();break;
            default: ob1.Default();break;
        } 
    } 
}
