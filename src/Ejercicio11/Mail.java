package Ejercicio11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Mail {

    public static void main(String[] args) {

        String palabra = "Murcielago";
        int posicion = 0;
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {

            // System.out.println("Ingrese una palabra");
            //palabra = bf.readLine();

            /*for (int x = 0; x < palabra.length(); x++) {
                if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'u')) {
                    contador++;
                }
            }*/
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        //System.out.println("La palabra " + palabra + "contiene " + contador + " vocales");
        contarvocales(vocales, palabra);
    }


    public static void contarvocales(char[] vocales, String palabra) {
        int posicion = 0;
        int contador = 0;
        int contador2 = 0;

        for (int i = 0; i <= 4; i++) {


            posicion = palabra.indexOf(vocales[i]);
            while (posicion != -1) {
                contador++;
                contador2++;
                posicion = palabra.indexOf(i, posicion + 1);
            }
            System.out.println("Hay " + contador + " vocal '" + vocales[i] + "'");
            contador = 0;
        }
        System.out.println("En total la palabra " + palabra + " contiene " + contador2 + " vocales");
        contador2 = 0;
    }
}



