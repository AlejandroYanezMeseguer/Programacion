
package boletin6.pkg3;

public class circulo {
    private double radio;
    public final double pi = 3.14;
    
    //constructores
    public circulo(){};
    
    public circulo(double r){
        radio = r;}
    
    //metodos de acceso 
    public void calcArea(double r){
        double area = pi * Math.pow(r, 2);
        System.out.println("el area del circulo es = "+ area);}
    
    public void calcLonxitude(double r){
        double lonxitude = 2*pi*r;
        System.out.println("la longitud del circulo es = "+ lonxitude);}   
}
