package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumDoWhileMain {
    public static void main(String[] args) {

        int numero = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        do {


            System.out.println("\nIngrese un numero mayor o igual a cero (0) para la validacion");
            try {
                numero = Integer.parseInt(bf.readLine());


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (numero<0);
        System.out.println("Correcto, el numero es mayor que cero(0).");
    }
}

