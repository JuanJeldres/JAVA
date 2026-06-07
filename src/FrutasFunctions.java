import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FrutasFunctions {
    //aca las funciones

    static void mostrarFrutas(List<String> listaFrutas){ //bueno, por intuicion la armo en torno a lo que dice el nombre de la funcion
        System.out.println("Estas son las frutas que hay: ");
        for (String fruta : listaFrutas){
            System.out.println(fruta);
        }
    }

    /*static void agregarFrutas (List<String> listaFrutas, Scanner Prompt){
        listaFrutas.add(Prompt.nextLine());
    }*/

    static void ingresarFruta (List<String> listaFrutas, Scanner Prompt){
        /*Scanner Prompt = new Scanner(System.in);*/
        /*List<String> listaFrutas = new ArrayList<>();*/
        System.out.println("Cuantas frutas desea ingresar?: ");
        int cantidadFrutas = Prompt.nextInt();
        Prompt.nextLine(); //limpiaenters
        if (cantidadFrutas > 0){
            for (int i = 0; i < cantidadFrutas; i++){
                System.out.println("Ingrese una fruta: ");
                listaFrutas.add(Prompt.nextLine()); //como hago que la lista exista fuera de la funcion pero pueda ser llamada aca? = era con parametros
            }
        }else{
            System.out.println("NO? bueno adios...");
        }
    }

    static void contarFrutas(List<String> listaFrutas){
        System.out.println("La cantidad de frutas que hay es de " + listaFrutas.size());
    }

    static void conocerIndice (List<String> listaFrutas){
        System.out.println("Estas son las frutas y sus indices:");
        for ( int i = 0; i < listaFrutas.size(); i++){
            System.out.print("Fruta: " + listaFrutas.get(i));
            System.out.println(", Indice: " + i);
        }
    }

    static void cambiarFruta (List<String> listaFrutas, Scanner Prompt){
        System.out.println("que fruta desea reemplazar?, ingrese el indice: ");
        int indicefrutaAcambiar = Prompt.nextInt();
        Prompt.nextLine(); //limpia enter
        System.out.println("ingrese la nueva fruta que reemplazara la anterior: ");
        String frutaReemplazo = Prompt.nextLine();
        listaFrutas.set(indicefrutaAcambiar, frutaReemplazo);
    }

    static void eliminarfruta (List<String> listaFrutas, Scanner Prompt){
        System.out.println("que fruta quieres eliminar? escriba el nombre: ");
        String frutaAeliminar = Prompt.nextLine();
        listaFrutas.remove(frutaAeliminar);
    }

    public static void main(String[] args) {

        Scanner Prompt = new Scanner(System.in);

        List<String> listaFrutas = new ArrayList<>(); // la lista de frutas
        ingresarFruta(listaFrutas, Prompt);
        mostrarFrutas(listaFrutas);
        //confusing x.x
        contarFrutas(listaFrutas);
        conocerIndice(listaFrutas);
        cambiarFruta(listaFrutas, Prompt);
        eliminarfruta(listaFrutas, Prompt);
        Prompt.close();
        System.out.println(listaFrutas);



        //listaFrutas.add("manzana");

        /*System.out.println("Cuantas frutas desea ingresar?: ");
        int cantidadFrutas = Prompt.nextInt();
        Prompt.nextLine(); //limpiaenters

        if (cantidadFrutas > 0){
            for (int i = 0; i < cantidadFrutas; i++){
                System.out.println("Ingrese una fruta: ");
                listaFrutas.add(Prompt.nextLine());
            }

        }else{
            System.out.println("NO? bueno adios...");
        }*/



    }
}
