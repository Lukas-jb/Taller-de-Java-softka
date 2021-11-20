package Ejercicio11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MainBuscVocales {

    public static void main(String[] args) {

        String palabra = "Murcielago";
        int posicion = 0;
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {

        } catch (
                Exception e) {
            e.printStackTrace();
        }

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



