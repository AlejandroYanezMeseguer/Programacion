package boletin16;

public class Libro extends Publicacion {
    
    //areibutos
    
    private Boolean prestado;

    
    //constructores
    
    
    public Libro() {
    }

    public Libro(Boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(Boolean prestado, int codigo, String titulo, String fechaPublicacion) {
        super(codigo, titulo, fechaPublicacion);
        this.prestado = prestado;
    }

    
    //getters y setters
    
    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String getFechaPublicacion() {
        return super.getFechaPublicacion();
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
    
    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado;
    }
    
    
}
