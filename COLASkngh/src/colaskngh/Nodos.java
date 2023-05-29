
package colaskngh;

public class Nodos {
 
    //KARLA NATALIA GONZALEZ HERRERA ICO2
    private int elemento;
    private Nodos siguiente;

    public Nodos(int elemento, Nodos siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento + "/n";
    }
       
}
