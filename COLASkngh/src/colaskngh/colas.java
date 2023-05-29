
package colaskngh;

public class colas {

    // KARLA NATALIA GONZALEZ HERRERA ICO2
    
    private Nodos frente;
    private int tamaño;

    public colas() {
        frente = null;
        this.tamaño = 0;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return this.tamaño;
    }

    public Nodos raiz() {
        if (isEmpty()) {
            return null;
        } else {
            return frente;
        }
    }

    public void sacar() {
        System.out.println("iniciar metodo sacar ");
        if (frente!= null){
        System.out.println("valor sacaddo" + frente.getElemento());
            Nodos s = frente.getSiguiente();
            frente = s;
        }
        this.tamaño--;
    }

    public void encolar(Nodos nv) {
        if (frente == null) {
            frente = nv;
            System.out.println("Valor insertado" + nv.getElemento());
        } else {
            Nodos s = recorrecolas();
            if (s.getSiguiente() == null) {
                System.out.println("Valor insertado" + nv.getElemento());
                s.setSiguiente(nv);
                this.tamaño++;
            }
        }
    }

    public Nodos recorrecolas() {
        System.out.println("Iniciar método recorrer cola ");
        System.out.println("Valor visitado" + frente.getElemento());
        Nodos i = frente;
        Nodos s = new Nodos(0, null);
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            System.out.println("Valor visitado" + s.getElemento());
            i = s;
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "la cola vacía ";
        } else {
            String resultado = "";
            Nodos aux = frente;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }

}
