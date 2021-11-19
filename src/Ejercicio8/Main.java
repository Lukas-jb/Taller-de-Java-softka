package Ejercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String diaSemana, aux;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Ingrese un dia de la semana");
            aux = bf.readLine();
            diaSemana = Character.toUpperCase(aux.charAt(0)) + aux.substring(1, aux.length()).toLowerCase();
            switch (diaSemana) {
                case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes": {
                    System.out.println("los " + diaSemana + " son días labotales");
                    break;
                }
                case "Sabado", "Domingo": {
                    System.out.println("los " + diaSemana + " no son días labotales, relajate y descansa. ");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Valor ingresado no valido.");
        }


    }
}
