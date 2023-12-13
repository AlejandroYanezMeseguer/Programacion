package boletin3.pkg4;

import java.util.Scanner;

public class Boletin34 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        long total,cien,veinte,cinco,uno;
        
        System.out.println("Introduce la cantidad de dinero total");
        
        
        total=sc.nextLong();
        cien=total/100;
        veinte=total%100/20;
        cinco=total%100%20/5;
        uno=total%100%20%5;
        
        System.out.println("El desglose del dinero es = \n"+cien+" billetes de cien \n"+veinte+" Billetes de veinte \n"+cinco+" Billetes de cinco \n"+uno+" Monedas de uno");
        
    }
    
}
