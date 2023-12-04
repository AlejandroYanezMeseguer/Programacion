package boletin18.pkg1;

import libreria.LeerDatos.LeerDatosJOP;
import libreria.MostrarDatos.MostrarDatos;

public class Costo {
     
    //Atributos
    
    private int tempo;
    private String dia;
    private String quenda;
    
    
    //Constructores

    public Costo() {
    }

    public Costo(int tempo, String dia, String quenda) {
        this.tempo = tempo;
        this.dia = dia;
        this.quenda = quenda;
    }
    
    
    // Setters, Getters y Metodos

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getQuenda() {
        return quenda;
    }

    public void setQuenda(String quenda) {
       
        Costo ST = new Costo();
        
        switch (quenda) {
            case "mañana":
                this.quenda = quenda;break;               
            case "tarde":
                this.quenda = quenda;break;              
            default:
                ST.setQuenda(LeerDatosJOP.LeerString("porfavor introduce un valor correcto"));break;               
        }
    }
    
    
    public void Costo(){
        
        //atributos del metodo
        
        double precio = 0;
        
        
        //precio respecto al tiempo
        
        if (tempo<=5){
            precio=1;
        }
        else if (tempo>5 && tempo<=8){
            precio=1.80;
        }
        else if (tempo>8 && tempo<=10){
            precio=2.50;   
        } 
        else if (tempo>10){
            precio=2.5+(tempo-10)*0.5;
        }
        
        
        //porcentaje que hay que sumar para el precio final
        
        if (dia.equals("domingo")){
            MostrarDatos.MostrarString("la llamada cuesta: " +((precio*0.03)+precio) +"€");
        }
        else if(quenda.equals("mañana")){
            MostrarDatos.MostrarString("la llamada cuesta: " +((precio*0.15)+precio) +"€");
        }
        else if(quenda.equals("tarde")){
            MostrarDatos.MostrarString("la llamada cuesta: " +((precio*0.10)+precio) +"€");
        }
    }
}