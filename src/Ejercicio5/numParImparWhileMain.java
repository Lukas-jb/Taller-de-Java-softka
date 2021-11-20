package Ejercicio5;

public class numParImparWhileMain {
    public static void main(String[] args) {

        int contador = 1;
        System.out.println("A continuacion se mostraran los numero pares e impares del 1 al 100");

        System.out.println("\nNumeros pares");

        while (contador >= 1 && contador <= 100) {
            if (contador % 2 == 0) {
                System.out.print(contador + ",");
                contador++;
            }else contador++;

        }
        contador =1;
        System.out.println("\n\nNumeros Impares");

        while (contador >= 1 && contador <= 100) {
            if (contador % 2 != 0) {
                System.out.print(contador + ",");
                contador++;
            }else contador++;
        }
    }
}
