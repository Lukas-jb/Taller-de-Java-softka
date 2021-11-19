package DNI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";//evaluar si se convierte a fainal
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;
    private char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Persona() {
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = compSexo(sexo);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = compSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc;
        imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) return -1;
        else if (imc >= 20 && imc <= 25) return 0;
        else return 1;
    }

    public String impIMC(int imc) {

        if (imc == -1) return ("Esta por debajo del peso");
        else if (imc == 0) return ("Esta en el peso ideal");
        else return ("Esta por encima del peso");

    }

    public String impedad(boolean mayor) {
        if (mayor == true) return "Es mayor de edad";
        else return "Esmenor de edad";

    }

    public boolean esMayorDeEdad() {
        if (this.edad > 18) return true;
        else return false;
    }

    private char compSexo(char sexo) {
        if (sexo=='M'){
            return this.sexo=sexo;
        }
        else return 'H';
    }

    @Override
    public String toString() {
        return "nombre = '" + nombre + "', " + "edad = '" + edad + "', " + impedad(esMayorDeEdad()) + ", DNI = '" + DNI + "', sexo = '" + sexo + "', peso = '" + peso + "', " + impIMC(calcularIMC()) + ", altura = '" + altura + "' }";
    }

    private String generaDNI() {
        int indice;
        String dni;

        int numeroDni = (int) (Math.random() * (99999999 - 10000000) + 10000000); //numeor aleatorio de 8 dijitos empesando por 1
        indice = numeroDni % 23;
        char letra = letraDni[indice];
        dni = String.valueOf(numeroDni) + letra;
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = compSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /////////////////////////////////////////////////Metodos de prueba
    public Persona llenarPersona() {

        String nombre;
        int edad;
        String DNI;
        char sexo;
        double peso;
        double altura;
        boolean ciclo = true;
        Persona tem;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (ciclo) {

            try {
                System.out.println("Ingrese su nombre: ");
                nombre = bf.readLine();

                System.out.println("Ingrese tu edad: ");
                edad = Integer.parseInt(bf.readLine());

                System.out.println("Sexo ('H' para hombre y 'M' para mujer): ");
                sexo = bf.readLine().toUpperCase().charAt(0);

                System.out.println("Ingrese tu peso en kg: ");
                peso = Double.parseDouble(bf.readLine());

                System.out.println("Ingrese tu altura en metros: ");
                altura = Double.parseDouble(bf.readLine());
                tem = new Persona(nombre, edad, sexo, peso, altura);

                return tem;

            } catch (Exception e) {
                System.out.println("Valor ingresado incorrecto. Precione enter para continuar");
                continue;
            }

        }
        return tem = null;
    }
}

