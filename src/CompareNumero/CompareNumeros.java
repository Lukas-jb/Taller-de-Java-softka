package CompareNumero;

public class CompareNumeros {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        System.out.println("\nSe Realizara la comparacion de los siguentes numeros: "+num1+" y "+num2);
        System.out.println("\nEn este caso");
        if (num1 == num2) System.out.println("los dos numeros son iguales");
        if (num1<num2) System.out.println(num1+" es menor que "+num2);
        if (num1>num2) System.out.println(num1+" es mayor que "+num2);
    }
}
