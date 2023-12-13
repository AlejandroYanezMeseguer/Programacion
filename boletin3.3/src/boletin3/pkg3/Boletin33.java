package boletin3.pkg3;

import java.util.Scanner;

public class Boletin33 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cien,veinte,cinco,un;
        System.out.println("Introduce la cantidad de billetes de 100");
        cien=sc.nextDouble();
        
        System.out.println("Introduce la cantidad de billetes de 20");
        veinte=sc.nextDouble();
        
        System.out.println("Introduce la cantidad de billetes de 5");
        cinco=sc.nextDouble();
        
        System.out.println("Introduce la cantidad de monedasd de 1 euro");
        un=sc.nextFloat();
        
        double cantidadtotal=cien*100+veinte*20+cinco*5+un;
        System.out.println("La suma total del dinero es ="+cantidadtotal);
    }
    
}
