package boletin16;

public class Publicacion {
   
    //atributos
    
    private int codigo;
    private String titulo;
    private String fechaPublicacion;
    
    
    //costructores

    public Publicacion() {
    }
    
    public Publicacion(int codigo, String titulo, String fechaPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
    //setters y getters

    public int getCodigo() {
        return codigo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion;
    }
}
