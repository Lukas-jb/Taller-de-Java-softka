package Ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class PalabrasDiferenteMain {

    public static void main(String[] args) {
        int auxiliar = 0;
        String palabra1 = null;
        String palabra2 = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Dame una palabra");
            palabra1 = bf.readLine().toLowerCase(Locale.ROOT);
            System.out.println("Dame una palabra");
            palabra2 = bf.readLine().toLowerCase(Locale.ROOT);

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> listaDiferencias = new ArrayList<String>();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else if (palabra1.length() <= palabra2.length()) {
            auxiliar = palabra2.length() - palabra1.length();
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    listaDiferencias.add(String.valueOf(palabra1.charAt(i))); // si no esta, la a;ade
                    listaDiferencias.add(String.valueOf(palabra2.charAt(i)));
                }
            }
            for (int i = palabra1.length(); i < palabra2.length(); i++) {
                listaDiferencias.add(String.valueOf(palabra2.charAt(i)));
            }
        } else {
            auxiliar = palabra1.length() - palabra2.length();
            for (int i = 0; i < palabra2.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    listaDiferencias.add(String.valueOf(palabra1.charAt(i)));
                    listaDiferencias.add(String.valueOf(palabra2.charAt(i)));
                }
            }
            for (int i = palabra2.length(); i < palabra1.length(); i++) {

                listaDiferencias.add(String.valueOf(palabra1.charAt(i)));
            }
        }
        System.out.println("La diferencia en la cantidad de letras es: " + auxiliar);
        System.out.println("La letras diferentes son: " + listaDiferencias);
    }
}

