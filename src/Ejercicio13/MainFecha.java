package Ejercicio13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainFecha {
    public static void main(String[] args) {
        String aux = null;
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("¿Desea consultar la fecha y hora actual?");
                System.out.println("Ingrese una Y para mostrar hora y N para salir");
                aux = bf.readLine();
                if (aux.equalsIgnoreCase("Y")) {
                    System.out.println(date.format(LocalDateTime.now()));
                    break;
                } else if (aux.equalsIgnoreCase("N")) {
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage() + " Valor ingresado no valido.");
            }
        }
        System.out.println("Terminado con exito,hasta pronto.");
    }

}
