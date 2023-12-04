package boletin14;

import partes.CPU;
import partes.Monitor;
import partes.Teclado;

public class Boletin14 {

    public static void main(String[] args) {

        Teclado objT = new Teclado("Samsung", 80f);
        Monitor objM = new Monitor("Samsung", 27f);
        CPU objC = new CPU(1000, 2000);
        Ordenador ord1 = new Ordenador(objT,objM,objC,800f);
        
        //amosa todas las caracteristicas
        ord1.amosar(ord1);
        
        //amosa el precio del ordenador
        System.out.println("precio: " + ord1.getPrecio());
        
        //amosa la marca del teclado
        System.out.println("marca teclado: " + ord1.getMonitor().getMarca());
        
        //amosa la velocidade de la CPU
        System.out.println("velocidade CPU: " + ord1.getCpu().getVelocidad());
    }
    
}
