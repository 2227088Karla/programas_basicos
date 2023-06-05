
package musica;

import java.io.Serializable;

// KARLA NATALIA GONZALEZ HERRERA ICO2

public class persona implements Serializable{
    
    String nombre;
    int edad;
    
    public persona(String Nombre, int Edad){
        this.nombre=Nombre;
        this.edad=Edad;
    }
    
}
