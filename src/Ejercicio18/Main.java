package Ejercicio18;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int contadorserie = 0;
        int contvideojuego = 0;


        List<Serie> listaSeries = new ArrayList<>();
        List<Videojuego> listaVideJuegos = new ArrayList<>();

        listaSeries.add(new Serie("You", "Greg Berlanti"));
        listaSeries.add(new Serie("Mr. Robot", 4, "Informatica", "Sam Esmail"));
        listaSeries.add(new Serie("Dragon Ball z", "Akira Toriyama"));
        listaSeries.add(new Serie("Dark", 3, "Terror", "Baran bo Odar"));
        listaSeries.add(new Serie("Game of Trones", 8, "Ficcion", "Martin"));
        listaVideJuegos.add(new Videojuego("Assasin Creed Odyssey", 50, "Accion", "Ubisoft"));
        listaVideJuegos.add(new Videojuego("Mario", 10, "Aventura", "Nintendo"));
        listaVideJuegos.add(new Videojuego("Far cry4", 30, "Accion-Aventura", "ubisoft"));
        listaVideJuegos.add(new Videojuego("Halo", 30, "Accion", "Microsoft"));
        listaVideJuegos.add(new Videojuego("Gost Recon", 40, "Accion", "Tom Clancys"));

        listaSeries.get(2).entregar();
        listaSeries.get(3).entregar();
        listaSeries.get(1).entregar();

        listaVideJuegos.get(4).entregar();
        listaVideJuegos.get(3).entregar();
        listaVideJuegos.get(2).entregar();

        for (Videojuego videojuego : listaVideJuegos) {
            if (videojuego.isEntregado() == true) {
                contvideojuego += 1;
                videojuego.devolver();

            }
        }
        for (Serie serie : listaSeries) {
            if (serie.isEntregado() == true) {
                contadorserie += 1;
                serie.devolver();
            }
        }

        System.out.println("Fueron entregadas " + contadorserie + " Series");//total series
        System.out.println("Fueron entregos " + contadorserie + " Videojuegos");//total videojuegos;

        System.out.println("La serie con mas temporadas es: " + listaSeries.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[", "").replace("]", ""));
        System.out.println("\nEl videojuego con mas horas es: " + listaVideJuegos.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[", "").replace("]", ""));
    }
}
