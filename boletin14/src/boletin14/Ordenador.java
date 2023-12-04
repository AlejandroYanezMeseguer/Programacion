package boletin14;

import partes.CPU;
import partes.Monitor;
import partes.Teclado;

public class Ordenador {
    private Teclado teclado;
    private Monitor monitor;
    private CPU cpu;
    private float precio;

    public Ordenador() {
    }

    public Ordenador(Teclado teclado, Monitor monitor, CPU cpu, float precio) {
        this.teclado = teclado;
        this.monitor = monitor;
        this.cpu = cpu;
        this.precio = precio;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "teclado=" + teclado + "monitor=" + monitor + ", cpu=" + cpu + ", precio=" + precio;
    }
    
    public void amosar(Ordenador ord){
            System.out.println(ord);
    }
    
    public Ordenador devolver(){
        Ordenador obj = new Ordenador(new Teclado("mmm",60),new Monitor("bbb",27),new CPU(1000,2000),500);
        return obj;
    }
}
