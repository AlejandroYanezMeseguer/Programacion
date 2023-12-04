package boletin11.pkg1;
import javax.swing.*;
public class clase1 {
    /**
     * @author Alejandro Yañez Meseguer
     * @version 1.0
     */
    public void Juego(){
        /**
         *Variable nJugador es el numero que introduce el jugador
         */
        int nJugador =0;
        /**
         * ContIntentos es el contador de los intentos que trada el jugador en encontrar el numero
         */
        int ContIntentos = 0;
        /**
         * nAdivinar es el numero que tiene que adivinar el jugador que se genera aleatorioamente
         */
        int nAdivinar = (int) (Math.floor(Math.random()*(1-50+1)+50));
        System.out.println("Se ha generado aleatoriamente un numero del 1 al 50 el cual debes adivinar en 5 intentos.");
        /**
         * bucle do while que contiene el juego
         */
        do {
            /**
             * creo una variable que guarda los intentos restantes del juego siendo estos 5
             */
            int intentosRestantes = 4 - ContIntentos;
            ContIntentos++;
            /**
             * pido por pantalla un numero que se recoje en nJudagor
             */
            nJugador = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero entre 1 y 50"));
            /**
             * creo la variable distancia que indica la distancia entre el numero generado y el numero introducido por el jugador
             */
            int distancia = nJugador-nAdivinar;
            /**
             * creo una cadena de if else,son las pistas que da al jugador en funcion la distancia enre el numero generado y el numero introducido
             */
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
            /**
             * muestro los intentos que le quedam al jugador
              */
            System.out.println("Te quedan: "+ intentosRestantes +" intentos");
            /**
             * el while indica la condicion para que se repitanlas sentencias anteriores
             */
        } while (ContIntentos<=4);
        
        System.out.println("El yogo ha acabado eres to malo");
    }
}
    