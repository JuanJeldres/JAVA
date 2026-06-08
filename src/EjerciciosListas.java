import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

public class EjerciciosListas {
    public static void main(String[] args) {

        Scanner Prompt = new Scanner(System.in);
        List<String> almacenProductos = new ArrayList<>();
        almacenProductos.add("pelota");
        almacenProductos.add("tv");

        System.out.println(almacenProductos.size());


        System.out.println("ingrese el producto por nombre: ");
        almacenProductos.add(Prompt.nextLine());
        System.out.println(almacenProductos);

        System.out.println("quiere ingresar otro producto?: ");
        String respuesta = Prompt.nextLine();

        if(respuesta.equalsIgnoreCase("si")){
            System.out.println("cuantos productos quiere ingresar?");
            int cantidadProductos = Prompt.nextInt();
            Prompt.nextLine();
            for (int i = 0; i < cantidadProductos; i++){
                System.out.println("ingrese el/los productos: ");
                almacenProductos.add(Prompt.nextLine());
            }
        }else{
            System.out.println("chau");
        }

        System.out.println(almacenProductos);

        System.out.println("ejercicio 2");
        Set<String> registroUsuarios = new HashSet<>();
        registroUsuarios.add("peeps");
        registroUsuarios.add("pepe");
        registroUsuarios.add("botejohn");
        for(String usuario : registroUsuarios){
            System.out.println(usuario);
        }
        System.out.println("cuantos usuarios desea registrar?: ");
        int cantidadUsuarios = Prompt.nextInt();
        Prompt.nextLine();

        for (int i = 0; i < cantidadUsuarios; i++){
            System.out.println("ingrese el nombre de usuario: ");
            String registro = Prompt.nextLine();
            if(registroUsuarios.contains(registro)){
                System.out.println("Usuario repetido");
                //registroUsuarios.add(registro); para incorporarlo aunque este repetido
            }else {
                registroUsuarios.add(registro);
            }
        }
        for (String usuario : registroUsuarios){
            System.out.println(usuario);
        }
        System.out.println("Existen " + registroUsuarios.size() + " usuarios registrados.");


        System.out.println("ejercicio 3");
        Map<String, Integer> agendaTelefonica = new HashMap<>();

        agendaTelefonica.put("pepe", 968372561);

        while (agendaTelefonica.size() < 6){
            System.out.println("se generara una lista telefonica, ingrese el nombre: ");
            String nombre = Prompt.nextLine();
            System.out.println("ingrese el numero: ");
            int numero = Prompt.nextInt();
            Prompt.nextLine(); //limpia enter
            agendaTelefonica.put(nombre, numero);
        }
        for(Map.Entry<String, Integer> contactos : agendaTelefonica.entrySet()){
            System.out.println(contactos.getKey());
            System.out.println(contactos.getValue());
        }

        System.out.println("solicite un contacto: ");
        String persona = Prompt.nextLine();
        if(agendaTelefonica.containsKey(persona)){
            System.out.println(agendaTelefonica.get(persona)); //no se como pero dio el numero LOL!
        }else{
            System.out.println("el contacto no existe. chao.");
        }

        List<Double> listaNotas = new ArrayList<>();

        listaNotas.add(3.9);
        listaNotas.add(2.8);
        listaNotas.add(5.9);
        listaNotas.add(6.1);
        listaNotas.add(6.2);

        for (double nota : listaNotas){
            System.out.println(nota);
        }

        System.out.println("cuantas notas quiere agregar?: ");
        int cuantasNotas = Prompt.nextInt();
        Prompt.nextLine(); //limpia enters

        if(cuantasNotas > 0){
            for (int i = 0; i < cuantasNotas; i++){
                System.out.println("agregue una nota: "); //SE DEBE INGRESAR LAS NOTAS CON COMA Y NO CON PUNTO POR LA LOCALIZACION DE INTELIJ
                listaNotas.add(Prompt.nextDouble());
            }
        }else{
            System.out.println("adiós.");
        }

        System.out.println("Estas son todas las notas ingresadas:");
        for(double nota : listaNotas){
            System.out.println(nota);
        }

        System.out.println("Estas son las notas filtradas mayores e iguales a 4.0:");
        listaNotas.stream()
                .filter(nota -> nota > 3.9) //aaah era notas de evaluacion, no notas de texto...
                .forEach(System.out::println);

    }

}
