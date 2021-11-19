package Ejercicio6;

public class numParImparFor {
    public static void main(String[] args) {


        System.out.println("A continuacion se mostraran los numero pares e impares del 1 al 100, Utilizando un for");

        System.out.println("\nNumeros pares");

        for (int i = 1; i >= 1 && i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }

        System.out.println("\n\nNumeros Impares");

        for (int y = 1; y >= 1 && y <= 100; y++) {
            if (y % 2 != 0) {
                System.out.print(y + ",");

            }
        }
    }
}
