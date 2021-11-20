package Ejercicio15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedMap;

public class MainShuch {
    public static void main(String[] args) {
        boolean bucle = true;
        int caso = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (bucle) {
            try {


                System.out.println("****** GESTION CINEMATOGRÁFICA ********");
                System.out.println("Ingrese el numero de la opcion deseada.");
                System.out.println("1-NUEVO ACTOR");
                System.out.println("2-BUSCAR ACTOR");
                System.out.println("3-ELIMINAR ACTOR");
                System.out.println("4-MODIFICAR ACTOR");
                System.out.println("5-VER TODOS LOS ACTORES");
                System.out.println("6- VER PELICULAS DE LOS ACTORES");
                System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("8-SALIR");
                caso = Integer.parseInt(bf.readLine());
                switch (caso) {
                    case 1, 2, 3, 4, 5, 6, 7: {
                        break;
                    }
                    case 8: {
                        bucle = false;
                        System.out.println("Proceso finalizado con exito.");
                        System.out.println("=================================================");
                        break;
                    }
                    default:
                        System.out.println("OPCION INCORRECTO");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "Se ha precentado un error intente de nuevo.");
            }
        }

    }
}
