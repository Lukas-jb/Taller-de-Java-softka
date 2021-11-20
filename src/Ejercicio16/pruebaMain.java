package Ejercicio16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pruebaMain {

    public static void main(String[] args) {

        String nombre;
        int edad;
        String DNI;
        char sexo;
        double peso;
        double altura;
        int cont = 1;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("A continuación ingrese la información de las personas a registrar.");

        Persona aux = new Persona();
        Persona p1 = null;
        Persona p2 = null;
        Persona p3 = null;

        for (cont = 1; cont <= 3; cont++) {
            System.out.println("Informacion de la persona "+ cont);
            if (cont == 1) p1 = aux.llenarPersona();
            else if (cont == 2) p2 = aux.llenarPersona();
            else if (cont == 3) p3 = aux.llenarPersona();

        }
        System.out.println("Informacion recopilada: ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

//public Persona llenarPersona() {
//    String nombre;
//    int edad;
//    String DNI;
//    char sexo;
//    double peso;
//    double altura;
//    int cont = 1;
//
//    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//    try {
//
//
//        System.out.println("Dame tu nombre: ");
//        nombre = bf.readLine();
//
//        System.out.println("Dame tu edad: ");
//        edad = Integer.parseInt(bf.readLine());
//
//        System.out.println("Sexo ('H' para hombre y 'M' para mujer): ");
//        sexo = bf.readLine().toUpperCase().charAt(0);
//
//        System.out.println("Dame tu peso en kg: ");
//        peso = Double.parseDouble(bf.readLine());
//
//        System.out.println("Dame tu altura en metros: ");
//        altura = Double.parseDouble(bf.readLine());
//
//    } catch (IOException e) {
//        System.out.println(e.getMessage());
//
//    }
//
//    return 0;
//
//}
}
