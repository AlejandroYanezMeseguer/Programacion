
package boletin.pkg1.pkg2;
public class Boletin12 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        float lado=3, area;
        //opcion 1
        area = lado*lado;
        System.out.println("area ="+ area);
        //otra opcion
        area = (float) Math.pow(lado, 2);
        System.out.println("area ="+ area);
        //sin declarar area
        System.out.println("area2 = "+ lado*lado);
    }
    
}
