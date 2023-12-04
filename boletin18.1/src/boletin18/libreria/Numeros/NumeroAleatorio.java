package libreria.Numeros;

public class NumeroAleatorio {

    //numero entero aleatorio entre 0 y 10 ambos incluidos
    public static int NumAleatorioInt(){
        return (int) (Math.floor(Math.random()*(0-10+1)+10));
    } 
    
    
    //numero aleatorio de tipo double entre 0 y 10 ambos incluidos
    public static double NumAleatorioDouble(){
        return Math.random()*(1-10)+10;
    } 
    
    
    
}
