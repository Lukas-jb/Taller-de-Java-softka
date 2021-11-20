package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FacturaMain {

    public static void main(String[] args) {
        double total = 0;
        double precio = 150200.50;
        final double iva= 21;



        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("###.####");


        try {
            System.out.println("ingrese el precio del producto");
            precio = Double.parseDouble(bf.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        total= (precio*(1+iva/100));

        System.out.println("El precio final total es: ");

        System.out.println(df.format(total));


    }
}
