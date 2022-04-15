
import java.util.Scanner;
import javax.swing.SpinnerNumberModel;

/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su 
condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
package openbootcam;*/
public class Ejercicio_4 {

    public static void main(String[] args) {

        int num = -8;

        if (num < 0) {

            System.out.println(" El numero " + num + " es negativo ");
        } else if (num > 0) {
            System.out.println("El " + num + " es positivo");
        } else {
            System.out.println("El " + num + " es 0");

        }

        System.out.println("---------------------------------");

        int numeroWhile = 0;

        while (numeroWhile < 3) {

            numeroWhile++;

            System.out.println(numeroWhile);

        }

        System.out.println("---------------------------------");

        int numerodoWhile = 4;

        do {
            System.out.println(numerodoWhile);

        } while (numerodoWhile < 3);

        System.out.println("---------------------------------");

        int numeroFor;

        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {

            System.out.println(numeroFor);
        }
        
        System.out.println("----------------------------------");

        int estacion;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un numero ( 1 - 4 ), pulse intro");

        estacion = entrada.nextInt();

        switch (estacion) {
            case 1:
                System.out.println("Otoño");

                break;
            case 2:
                System.out.println("Invierno");
                break;

            case 3:
                System.out.println("Primavera");
                break;
            case 4:
                System.out.println("Verano");
                break;
            default:
                System.out.println("No corresponde a una estacion");

        }

    }

}
