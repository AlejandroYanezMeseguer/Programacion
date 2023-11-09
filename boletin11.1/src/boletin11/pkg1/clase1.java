package boletin11.pkg1;
import javax.swing.*;
public class clase1 {
    public void Juego(){
        
        int nJugador =0; 
        int ContIntentos = 0;
        int nAdivinar = (int) (Math.floor(Math.random()*(1-50+1)+50));
        System.out.println("Se ha generado aleatoriamente un numero del 1 al 50 el cual debes adivinar en 5 intentos.");
        do {  
            int intentosRestantes = 4 - ContIntentos;
            ContIntentos++;
            nJugador = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero entre 1 y 50"));
            int distancia = nJugador-nAdivinar;
            if (distancia<=5 && distancia>0){
                System.out.println("Te has pasado un poquito");
                
                }else if (distancia>=(-5) && distancia<0){
                        System.out.println("Te has quedado un poquito corto");
                    
                }else if (distancia<=10 && distancia>5){
                        System.out.println("Te has pasado un poco");
                
                }else if (distancia>=(-10) && distancia< (-5)){
                        System.out.println("Te has quedado un poco corto"); 
                            
                }else if (distancia<=20 && distancia>10){
                        System.out.println("Te has pasado");
                            
                }else if (distancia>(-20) && distancia< (-10)){
                        System.out.println("Te has quedado corto");
                
                }else System.out.println("Estas muy lejos");
                        
            System.out.println("Te quedan: "+ intentosRestantes +" intentos");
        } while (ContIntentos<=4);
        
        System.out.println("El yogo ha acabado eres to malo");
    }
}
    