package boletin9.pkg3;

import java.util.Scanner;

public class clase3 {
    
    
    public void mtd3 (){
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        do{
            System.out.println("introduce la base del rectangulo para calcular el area");
                    base = sc.nextDouble();
        
            System.out.println("introduce la altura del rectangulo para calcular el area");
                    altura = sc.nextDouble();
                    
            if (base>=0 & altura>=0){          
                System.out.println("el area del rectangulo es "+ base*altura);}
            
            else System.out.println("no puedes introducir numeros negativos");
            
        } while(base<=0 & altura<=0); 
    } 
}
