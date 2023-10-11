
package boletin6.pkg2;
    
public class satelite{ 
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;

 public satelite(){

  meridiano = paralelo = distanciaTerra = 0; 
}

public satelite (double m, double p, double d){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d;}

public void verPosicion(){
    System.out.println (" o satelite atopase  no paralelo" + paralelo +"no meridiano" + meridiano + "a unha distancia da terra" + distanciaTerra);   
    }  
}
