package EjercicioOOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var videojuego1 = new VideoGame("Monster Hunter: World", "RPG", 7000);
        var videojuego2 = new VideoGame("PEAK", "Coop, Adventure, Survival", 3000);
        /*System.out.println("la lista de juegos disponibles es:");
        System.out.println("");
        System.out.println("Nombre: " + videojuego1.nombreJuego);
        System.out.println("Categoria: " + videojuego1.Categoria); //ejercicio1
        System.out.println("Precio: " + videojuego1.Precio);
        System.out.println("");
        System.out.println("Nombre: " + videojuego2.nombreJuego);
        System.out.println("Categoria: " + videojuego2.Categoria);
        System.out.println("Precio: " + videojuego2.Precio);*/

        var videojuego3 = new VideoGame("Project Zomboid", "Survival horror", 10000);
        var videojuego4 = new VideoGame("Valheim", "Survival, Adventure", 8000);
        var videojuego5 = new VideoGame("Predecessor", "MOBA", 0);
        videojuego3.showInfo();
        videojuego4.showInfo(); //ejercicio 2
        videojuego5.showInfo();
        videojuego1.showinfoGetter(); //ejercicio 3
        videojuego2.showinfoGetter();

        Scanner sc = new Scanner(System.in);
        if (videojuego5.getPrecio() < 1){
            System.out.println("");
            System.out.println("ingrese otro precio para " + videojuego5.getNombreJuego() + ": ");
            int nuevoPrecio = sc.nextInt();
            sc.nextLine();
            videojuego5.setPrecio(nuevoPrecio);
            videojuego5.showInfo();
        }

        var videojuego6 = new PCGame("Risk of Rain 2", "Roguelike", 9000,"8 GB", "8 GB", "AMD RX570 or GTX 1060", "INTEL Celeron or RYZEN 3 3200G");

        var videojuego7 = new ConsoleGame("God of War 2", "Hack & Slash, Adventure", 11000, "PlayStation 2");

        videojuego6.showinfoGetter();
        videojuego7.showinfoGetter();

        ArrayList<VideoGame> juegos = new ArrayList<>(); //probando como hacer polimorfia

        juegos.add(new VideoGame("Synthetik", "Roguelike", 7000));
        juegos.add(new PCGame("Total War Rome II", "Real Time Strategy", 6000, "35 GB", "8 GB", "GTX 1030", "Intel Pentium something"));
        juegos.add(new PCGame("Starsector", "Real Time Strategy", 0, "2 GB", "4 GB", "Integrated Graphics 256 mb or more", "Intel Celeron"));
        juegos.add(new ConsoleGame("Crash Bandicoot", "Adventure, Platformer", 15000, "PlayStation 2"));
        for (var juego : juegos){ //por cada juego de juegos
            juego.showInfo(); //metodo show info que se adapta al override de la clase PCgame o consolegame respectivamente (polimorfismo)

        }



    }
}
