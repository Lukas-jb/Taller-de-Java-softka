package Ejercicio9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String frace = "La sonrisa sera la mejor arma contra la tristeza";
        String ingConsola = null;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Acontinuacion se reemplazaran las letras 'a' por 'e' de la frace " + frace);
        frace = frace.replace("a", "e");

        System.out.println(frace);

        try {
            System.out.println("\nIngrese una frace para concatenar con la anterior");
            ingConsola = bf.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(frace.concat(" ").concat(ingConsola));

    }
}
