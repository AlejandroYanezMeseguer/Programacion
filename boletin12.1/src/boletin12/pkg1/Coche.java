package boletin12.pkg1;

public class Coche {
    
    //Atributos
    private String matricula;
    private String marca;

    //Constructores
    public Coche() {
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }
    
    //Getter y Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
