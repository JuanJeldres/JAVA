import java.util.ArrayList;
import java.util.List;

public class ListasObjetos {
    public static void main(String[] args) {

        /*String[] nombres = {"ana", "seba", "pepe"};
        nombres[3] = "maria";*/ // no se puede por que son solo 3 elementos

        //array list me permite agregar cantidad de elementos, mayor control en las listas, y como funciona?

        List<String> nombres = new ArrayList<>(); //estaban en rojo por que debo importar las clases

        //para agregar elementos
        nombres.add("seba");
        nombres.add("juan");
        nombres.add("maria");
        System.out.println(nombres);

        //ahora como acceder a estos elementos con este metodo?
        System.out.println(nombres.get(0)); //obtengo el primer elemento
        System.out.println(nombres.getLast()); //para obtener el ultimoTUFF

        //MODIFICAR elementos
        nombres.set(1, "botejohn"); //el metodo set pide los parametros indice y valor para realizar el cambio, en este caso 1 para juan y el cambio que es botejohn. entiendes dude?
        System.out.println(nombres.get(1));

        //para eliminar elementos
        nombres.remove(0); //borramos seba por el indice
        System.out.println(nombres.get(0)); // tras eliminar seba obtendremos botejohn ya que ahora ocupa la primera posicion del indice
        nombres.remove("botejohn"); //o borramos por el valor
        System.out.println(nombres); //solo queda maria

        //tamaño de la lista o cantidad de elementos
        System.out.println(nombres.size()); //en este metodo no es .length si no .size()

        //ejemplo de lista objeto con numeros
        List<Integer> numeros = new ArrayList<>();
        for(int i = 1; i < 5; i++){
            numeros.add(i); //vamos agregando numeros del uno al 4
        }

        System.out.println(numeros);

        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

    }
}
