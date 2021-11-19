package Ejercicio17;

import java.nio.channels.AsynchronousChannelGroup;

public class Principal {
    public static void main(String[] args) {

        double sumElectrodomestico = 0;
        double sumLavadora = 0;
        double sumtelevision = 0;
        int contador = 0;
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];
        listaElectrodomesticos[0] = new Lavadora(150, "Negro", 'A', 15, 15);
        listaElectrodomesticos[1] = new Lavadora(200, "Blanca", 'A', 35, 30);
        listaElectrodomesticos[2] = new Lavadora();
        listaElectrodomesticos[3] = new Electrodomestico(300, "Gris", 'B', 15);
        listaElectrodomesticos[4] = new Electrodomestico(200, "Gris", 'B', 15);
        listaElectrodomesticos[5] = new Electrodomestico(300, "Gris", 'B', 15);
        listaElectrodomesticos[6] = new Electrodomestico();
        listaElectrodomesticos[7] = new Television(300, "Negro", 'A', 15, 60, true);
        listaElectrodomesticos[8] = new Television();
        listaElectrodomesticos[9] = new Television(150, "Negro", 'A', 15, 60, true);

        for (Electrodomestico elemento : listaElectrodomesticos) {
            System.out.println("Precio elemento " + contador);
            System.out.println(elemento.precioFinal());
            elemento.precioFinal();
            sumElectrodomestico += elemento.precioFinal();
            if (elemento instanceof Lavadora) {
                sumLavadora += elemento.precioFinal();
            } else if (elemento instanceof Television) {
                sumtelevision += elemento.precioFinal();

            }
            contador++;
        }
        System.out.println("Entrega de resultados");
        System.out.println("Suma de los electrodomesticos es:");
        System.out.println(sumElectrodomestico);
        System.out.println("Suma de las lavadoras es:");
        System.out.println(sumLavadora);
        System.out.println("Suma de las Televisores es:");
        System.out.println(sumtelevision);
    }
}

