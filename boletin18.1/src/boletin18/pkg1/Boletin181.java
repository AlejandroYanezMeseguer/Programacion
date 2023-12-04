package boletin18.pkg1;

import libreria.LeerDatos.LeerDatosJOP;

public class Boletin181 {

    public static void main(String[] args) {

        Costo objC = new Costo();
        
        objC.setDia(LeerDatosJOP.LeerString("Introduce el dia en el que comenzaste la llamada."));
        objC.setTempo(LeerDatosJOP.LeerInt("Introduce el tiempo que duro la llamada."));
        
        if (objC.getDia().equals("domingo")){
            objC.Costo();
        }
        else {
            objC.setQuenda(LeerDatosJOP.LeerString("Introduce la quenda en la que comenzaste la llamada.(mañana o tarde)"));
            objC.Costo();
        }       
    }    
}
