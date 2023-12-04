package partes;

public class CPU {
    
    private int velocidad;
    private int almacenamiento;

    public CPU() {
    }

    public CPU(int velocidad, int almacenamiento) {
        this.velocidad = velocidad;
        this.almacenamiento = almacenamiento;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "velocidad=" + velocidad + ", almacenamiento=" + almacenamiento;
    }
    
    
}
