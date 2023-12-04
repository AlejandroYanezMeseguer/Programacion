package boletin12.pkg1;

import java.util.Scanner;
import javax.swing.*;
public class Garaje {
   
    //Atributos
    public static int numeroCoches = 0;


    //Constructores
    public Garaje() {
    }

    //Metodos
    public void garaje(){
        Scanner scMat = new Scanner(System.in);
        Scanner scMar = new Scanner(System.in);
        Scanner scHor = new Scanner(System.in);
        Scanner scPag = new Scanner(System.in);
        Coche obj = new Coche();
        
            while (numeroCoches<=5) {
               
                    System.out.println("Vienvenido a garajes Manolete, inserte los siguientes datos:");
                    
                    //Pido la matricula
                    System.out.println("Matricula del coche:");
                    obj.setMatricula(scMat.nextLine());
                    
                    //Pido la marca
                    System.out.println("Marca del coche:");
                    obj.setMarca(scMar.nextLine());
                    
                    //Pido cuantas horas ha estado en el parking
                    System.out.println("¿Cuantas horas has estado?");
                    float horas1 = scHor.nextFloat();
                    
                    //Calcular precio del parking
                    double total = 0;
                    if (horas1<=3){
                        total = 1.5;
                    }
                    else if (horas1>3){
                        double horas = horas1*0.20;
                        total = horas+1.5;
                    }
                    
                    System.out.println("El precio a pagar sera: " + total);
                    System.out.println("Introduce cuanto vas a pagar");
                    double pago = scPag.nextDouble();
                    double devolto = pago-total;
                                        
                    //Factura
                    JOptionPane.showMessageDialog(null,"\n\nFACTURA" + "\n\n"
                            + "MATRICULA DO COCHE: " + obj.getMatricula() + "\n"
                            + "TEMPO: " + horas1 + "h" + "\n"
                            + "PRECIO: " + total + "€" + "\n"
                            + "CARTOS RECIBIDOS: " + pago + "€" + "\n"
                            + "CARTOS DEVOLTOS: " + devolto + "€" + "\n"
                            + "GRACIAS POR USAR GARAJES MANOLETE\n\n\n");
                    
                    numeroCoches++;
                    JOptionPane.showInputDialog("¿quieres retirar el Coche?");
            }
            System.out.println("COMPLETO, vuelva mas tarde");
    }           
}
