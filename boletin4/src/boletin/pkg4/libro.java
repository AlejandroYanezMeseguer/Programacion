
package boletin.pkg4;

public class libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //constructor por defecto
    public libro (){}
    
    //constructor parametrizado
    
    public libro (String ti, String au, int an, short np){
        titulo = ti;
        autor = au;
        ano = an;
        numPaginas = np;}
    
    //metodos de acceso
    public void setTitulo(String ti) {
        titulo = ti;}
    public String getTitulo() {
        return titulo;}
    
    public void setAutor(String au) {
        autor = au;}
    public String getAutor() {
        return autor;}
    
    public void setAno(int an) {
        ano = an;}
    public int getAno() {
        return ano;}
    
    public void setnumPaginas(short np) {
        numPaginas = np;}
    public short getnumPaginas() {
        return numPaginas;}

    public void VerCaracteristicas(String ti, String au, int an,short np) {
    System.out.println( "el titulo del libro es:"+ ti 
                        +" su autor es:"+ au
                        +" fue publicado en:"+ an
                        +"tiene "+ np +" paginas");}
}