
//Crear una función con tres parámetros que sean números que se suman entre sí.

//Llamar a la función en el main y darle valores.

package openbootcam;


public class OpenBootcam { 
    
    int a, b, c, suma;

    public  int Suma ( int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        suma = a+b+c;
          
        return suma;          
}  
    
    public static void main(String[] args) {
        
      
      
      OpenBootcam ejercicio = new OpenBootcam();
      
        System.out.println(ejercicio.Suma(4, 5, 6));
       
       
    }
        
       
}


