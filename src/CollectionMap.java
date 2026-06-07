import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {

        //que es esta coleccion? map es una coleccion que guarda informacion en pares "clave valor" similar a los objetos en javascript", pensar en claves (etiqueta) y en el valor (donde se guarda el dato de la etiqueta), en map como en set tampoco hay indices!

        Map<String, Integer> sueldos = new HashMap<>();//se declara el tipo de dato que se utilizara tanto para la etiqueta, como para el valor, en este caso sera por ejemplo el sueldo de personas, por lo tanto sera una etiqueta de String (nombre de la persona) y un valor Integer (numeros por el sueldo)

        //agregar valores
        sueldos.put("pepe", 500); //aca es .put para agregar, fijarse que se agrega primero la etiqueta y luego el valor
        sueldos.put("maria", 1500);
        sueldos.put("ricardo", 1000);
        System.out.println(sueldos); //tampoco entrega ordenado
        //los valores se pueden repetir, las etiquetas o claves no

        //como obtener un valor
        System.out.println(sueldos.get("pepe")); //se accede con .get y la etiqueta

        //modificar o reemplazar un valor
        sueldos.put("pepe", 1000); //ademas de agregar, este puede modificar por ejemplo el valor de una etiqueta
        System.out.println(sueldos);

        //verificar la existencia de una etiqueta o clave
        System.out.println(sueldos.containsKey("pepe")); //containsKey es decir contiene etiqueta
        System.out.println(sueldos.containsValue(1000)); //para valores
        //ambas son booleanas

        //ELIMINAR
        sueldos.remove("maria"); //TUFF
        System.out.println(sueldos);

        //chequear tamaño?
        System.out.println(sueldos.size()); //2 elementos pq borramos uno

        //recorrer valores (value)
        for (Integer sueldo : sueldos.values()){//por cada sueldo de los valoresde.sueldos
            System.out.println(sueldo);
        }

        //y para recorrer etiquetas o claves
        for (String persona : sueldos.keySet()){ //por cada persona de etiquetasde.sueldos
            System.out.println(persona);
        }
        //o tambien podemos decir que simplemente nos de el set sin reconvertirlo por cada uno
        System.out.println(sueldos.keySet());

        //recorrer el conjunto completo con claves y valores separados
        System.out.println(sueldos); //todo completo pero sin separar

        for (Map.Entry<String, Integer> cartolaUsuarios : sueldos.entrySet()){
            /*System.out.println(cartolaUsuarios);*/ //cada usuario y valor juntos, par por par
            System.out.println(cartolaUsuarios.getKey()); //etiqueta
            System.out.println(cartolaUsuarios.getValue()); //valor
        }

    }
}
