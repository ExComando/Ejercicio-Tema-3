package ejercicios_basicos;



public class Funciones {

    static double getprecio(double precio) {

        double precioTotal = (precio * 21) / 100;
        return precio + precioTotal;

    }

    public static void main(String[] args) {

        System.out.println("El precio total es :" + getprecio(3000));

    }

}
