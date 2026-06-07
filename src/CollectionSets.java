import java.util.HashSet;
import java.util.Set;

public class CollectionSets {
    public static void main(String[] args) {

        //ya hemos visto dos tipos de colecciones, los arrays y listas
        /*List<String> nombres = new ArrayList<>();

        nombres.add("seba");
        nombres.add("juan");
        nombres.add("maria");
        nombres.add("seba"); //permite duplicados

        System.out.println(nombres);*/

        //el metodo Set las listas seran desordenadas y NO PERMITEN ELEMENTOS DUPLICADOS, ademas solo se trabaja con los valores, ya no los indices, y la gracia es que permiten una busqueda de elementos muuucho mas rapida ya que no van item por item hasta encontrar si no que van directo al elemento, gracias al "hashSet" este tipo es el mas optimo

        Set<String> nombres = new HashSet<>(); //llamamos a una lista con definicion Set
        nombres.add("whatupbaby");
        nombres.add("juan");
        nombres.add("maria");
        System.out.println(nombres);

        //como verificar la existencia de algo?
        System.out.println(nombres.contains("whatupbaby")); //devuelve true
        //ELIMINAR
        nombres.remove("maria"); //no se puede ya con el indice como en arrays
        System.out.println(nombres);

        nombres.add("ricardo");
        nombres.add("vanesa");
        nombres.add("felipe");
        nombres.add("laura");

        System.out.println(nombres); //salen desordenados, es asi su naturaleza

        //acceder a elementos del set mediante foreach

        for (String nombre : nombres){//minuto 14 de capsula de semana 5 jueves. aca dice "por cada nombre de nombres"
            System.out.println(nombre); //imprime nombres, TUFF
        }

        //cantidad de elementos o tamaño
        System.out.println(nombres.size()); //6 elementos

    }
}
