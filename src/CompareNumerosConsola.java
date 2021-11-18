import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNumerosConsola {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Sistema de comparacion de numeros");
            System.out.println("Ingrese los numeros que desa comparar");
            System.out.println("");
            System.out.println("Ingrese el numero 1");
            num1 = Integer.parseInt(bf.readLine());

            System.out.println("Ingrese el numero 2");
            num2 = Integer.parseInt(bf.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nSe Realizara la comparacion de los siguentes numeros: " + num1 + " y " + num2);
        System.out.println("\nEn este caso");
        if (num1 == num2) System.out.println("los dos numeros son iguales");
        if (num1 < num2) System.out.println(num1 + " es menor que " + num2);
        if (num1 > num2) System.out.println(num1 + " es mayor que " + num2);
    }
}
