package Ejercicio17;

public class Lavadora extends Electrodomestico {
    int carga = 5;

    public Lavadora() {

    }

    public Lavadora(int precioBase, double peso, int carga) {
        super(precioBase, peso);

    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precioaux = 0;
        double preciocarga=0;
        if (carga > 30) precioaux = super.precioFinal() + 50;
        precioaux =super.precioFinal()+preciocarga;
        return precioaux;
    }
}


