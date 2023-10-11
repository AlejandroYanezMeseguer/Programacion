
package boletin6.pkg1;

public class coche {
    private int velocidad;
    
    public coche (){
    velocidad = 0;}
    
    
    public int getVelocidad(){
    return velocidad;}
    
    public void acelerar(int valor){
    velocidad = velocidad + valor;}
    
    public void frenar(int menos){
    velocidad = velocidad - menos;}
    
    
    
    
}
