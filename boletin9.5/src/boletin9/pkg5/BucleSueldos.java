package boletin9.pkg5;

public class BucleSueldos {
    
    public void LeerSoldos(){
    int i=0;
    int m=0;
    int n=0;
    int soldo=LeerDatosJOP.LeerInt("Introduce o soldo do traballador, cuando quiera dejar de introducir soldos introduzca un 0");
    
    while (soldo !=0){
            if (soldo<=1750&&soldo>1000){
                i++;
                soldo=LeerDatosJOP.LeerInt("Introduce outro soldo do traballador");
                
            }else if (soldo<0){
                System.out.println("No se permiten sueldos negativos introduce otra vez el sueldo");
                soldo=LeerDatosJOP.LeerInt("Introduce un sueldo positivo");
            }else if (soldo>1000){
                m++;
                soldo=LeerDatosJOP.LeerInt("Introduce outro soldo do traballador");                
            }else if (soldo>1750){
                n++;
                soldo=LeerDatosJOP.LeerInt("Introduce outro soldo do traballador");                
            }
        }
        System.out.println("A cantidade de traballadores que cobran entre 1750 e 1000 son : "+i);
        float trabajadores=m+i+n;
        System.out.println("A porcentaxe de traballadores que cobran menos de 1000 euros e : "+m/trabajadores*100+"%");
    }
}