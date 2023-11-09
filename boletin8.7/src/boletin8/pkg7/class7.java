package boletin8.pkg7;
import java.util.Scanner;
public class class7 {
    
    public void Cuadrado (){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce el lado del cuadrado para calcular el area");
                    double lado = sc.nextDouble();
        
        System.out.println("el area del cuadrado es "+ lado*lado);}
    
    
    public void Triangulo (){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce la base del triangulo para calcular el area");
                   double base = sc.nextDouble();
        
        System.out.println("introduce la altura del triangulo para calcular el area");
                   double altura = sc.nextDouble();
        
        System.out.println("el area del triangulo es "+ base*altura/2);}
    
    
    public void Circulo (){
    
        Scanner sc = new Scanner(System.in);
                   final double pi = 3.14;
        
        System.out.println("introduce el radio del circulo para calcular su area");
                   double radio = sc.nextDouble();
        
        System.out.println("el area del triangulo es "+ pi*Math.pow(radio, 2));}
    
    
    public void Default (){
    
        Scanner sc = new Scanner(System.in);
        class7 ob1 = new class7();
        
        System.out.println("numero no valido, vuelve a introducir un numero entre el 1 y el 3");
        
         int cd = sc.nextInt();
               
        switch(cd){
        
            case 1: ob1.Cuadrado();break;
            case 2: ob1.Triangulo();break;
            case 3: ob1.Circulo();break;
            default: ob1.Default();break;
        }
    }
}
    

