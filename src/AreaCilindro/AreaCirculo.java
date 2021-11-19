package AreaCilindro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class AreaCirculo {

    public static void main(String[] args) {
        double rad = 0;
        double area = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("###.####");

        System.out.println("\nIngrese el radio del circulo en centimetros");
        try {
            rad = Double.parseDouble(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        area = (PI*(Math.pow(rad,2)));

        System.out.println("Area de un circulo con diametro de: "+rad*2+"cm es; "+df.format(area)+" Centimetros cuadrados"  );


    }
}
