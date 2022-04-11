/*Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/
package EjercicioParte_3;

public class Coche {

    static int puertas;
  

    public int SubeNumeroPuertas(int puertas) {

        this.puertas = puertas;
        return puertas;

    }

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        System.out.println("Se agrego " + miCoche.SubeNumeroPuertas(1) + " puerta");
        System.out.println( puertas + miCoche.SubeNumeroPuertas(4));

    }

}
