package libreria.LeerDatos;
import java.util.Scanner;
public class LeerDatosSC {
    
        //leer numero de tipo int
    public static int LeerInt(String mensaje) {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();    
    }
    
    
    //leer numero de tipo float
    public static float LeerFloat(String mensaje) {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();    
    }
    
    
    //leer numero de tipo double
    public static double LeerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();    
    }   
        
    
    //leer variable tipo string
    public static String LeerString(String mensaje) {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();    
    }
}
