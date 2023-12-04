   package boletin16;

public class Revistas extends Publicacion{

    //atributos
    
    private int numero;
    
    
    //constructores

    public Revistas() {
    }

    public Revistas(int numero) {
        this.numero = numero;
    }

    public Revistas(int numero, int codigo, String titulo, String fechaPublicacion) {
        super(codigo, titulo, fechaPublicacion);
        this.numero = numero;
    }
    
    
    //getter y setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getFechaPublicacion() {
        return super.getFechaPublicacion();
    }
    
    @Override
    public String toString() {
        return super.toString() + "numero=" + numero;
    }
    
    
}
