
public class Nodo {
  
   private String Nombre;

    
    public Nodo (String N, Nodo sig){
        this.Nombre = N;

    }
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
    this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Nodo{" + "Nombre=" + Nombre + '}';
    }

}
