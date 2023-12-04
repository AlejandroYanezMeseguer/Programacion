package boletin15;

public class Masajista extends SeleccionFutbol{
    
    	private String titulacion;
	private int años_experiencia;

    public Masajista(String titulacion, int años_experiencia) {
        this.titulacion = titulacion;
        this.años_experiencia = años_experiencia;
    }

    public Masajista(String titulacion, int años_experiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.años_experiencia = años_experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }



	public void darMasaxes() {


	}

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", a\u00f1os_experiencia=" + años_experiencia + '}';
    }












}

