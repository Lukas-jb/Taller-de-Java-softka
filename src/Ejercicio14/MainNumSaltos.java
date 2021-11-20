package Ejercicio14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainNumSaltos {
    public static void main(String[] args) {
        int numero = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Ingrese un numero menor a 1000");
                numero = Integer.parseInt(bf.readLine());

                while (true) {
                    if (numero < 1000-1) {
                        numero = numero + 2;
                        System.out.print(numero + ", ");
                    }
                    if (numero > 1000){
                        System.out.println("Numero ingresado por fuera de los parametros, ingrese un numero menor a 1000.");
                    break;
                    }
                }
                //break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + "Valor ingresado no valido");

            }
            continue;
        }
    }
}


