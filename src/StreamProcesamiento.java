import java.util.ArrayList;
import java.util.List;

public class StreamProcesamiento {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(40);
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(25);

        for (Integer numero : numeros){
            System.out.println(numero);
        }
        numeros.forEach(numero -> System.out.println(numero)); //hace lo mismo que el anterior

        for (Integer numero : numeros) {
            if (numero > 20){ //para cada dato imprime mayor a 20
                System.out.println(numero);
            }
        }

        System.out.println("aca empieza stream");
        numeros.stream()//stream toma la lista la filtra y la muestra, sin bucles, solo con metodos utilizados en las colecciones, solo se le añade .stream() a nuestra coleccion y funciona como metodo, solo procesa, no almacena a diferencia de otros
                .forEach(numero -> System.out.println(numero));
        numeros.stream() //no se cierra con punto coma
                .forEach(System.out::println); //lo mismo que numero -> sout(numero)
        //para filtrar con stream
        numeros.stream()
                .filter(numero -> numero > 20) //filtrar los numeros mayores a 20
                .forEach(System.out::println);
        //lo encuentro medio inutil si ya podemos hacer esto con otros metodos
        numeros.stream()
                .filter(numero -> numero > 20) //filtrar
                .map(numero -> numero * 2) //.map para transformar datos, en este caso multiplicar
                .sorted() //para ordenar los elementos, por default de menor a mayor
                .limit(2) //limita la cantidad de resultados que muestra, en este caso 2 resultados
                .forEach(System.out::println);

        List<String> nombres = new ArrayList<>();
        nombres.add("maria");
        nombres.add("juan");
        nombres.add("fran");
        nombres.add("ricardo");

        nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .forEach(System.out::println);

    }
}
