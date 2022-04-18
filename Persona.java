
/*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades
edad, nombre y telefono, por último muéstralas por consola.*/
package openbootcam;

import javax.xml.stream.events.EntityDeclaration;

public class Persona {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona ();
        
        persona.setEdad(36);
        persona.setNombre("Dario");
        persona.setTelefono(02145632);
      
        System.out.println(persona.getEdad() + "\n" + persona.getNombre() + "\n" + persona.getTelefono());        
        
    }
    

    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }    
    
   
}
