
package openbootcam;


public class Principal {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        cliente.edad = 36;
        cliente.nombre = "DARIO";
        cliente.telefono = 369852;
        cliente.credito =  5000;
        
        System.out.println("CLIENTE");
        
        System.out.println(cliente);
        System.out.println("*********************************");
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.edad = 28;
        trabajador.nombre = "Lorena";
        trabajador.telefono = 654789;
        trabajador.salario = 9000;
      
                
        System.out.println("TRABAJADOR");
        
        System.out.println(trabajador);
        
        
        
        
        
        
        
    }
    
}
