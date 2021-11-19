package Ejercicio10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String frace = null;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("\ningrese un texto y a continuacion se eliminaran los espacios en blanco.");
            frace = bf.readLine();


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Frace modificada");
        System.out.println(frace.replace(" ", ""));
    }
}
