import java.util.Scanner; //unido a prompt "Scanner(System.in);"

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Juan";
        final String contrasenia = "1234";
        System.out.println(" Mi nombre es " + nombre);
        System.out.println("longitud: " + nombre.length()); //para conocer la longitud de la cadena de texto, en este caso 4, por que tiene 4 letras
        System.out.println("caracter: " + nombre.charAt(3)); //nos dirá el indice que tiene algun caracter, en este caso indicara que el indice 3 es n (recordar que 0 es el primero)
        System.out.println("Mayuscula: " + nombre.toLowerCase()); //a minuscula
        System.out.println("Minuscula: " + nombre.toUpperCase()); //a mayuscula
        System.out.println(nombre.contains("an")); //ver si contiene algo mi dato
        System.out.println(nombre == "Juan");
        System.out.println(nombre.equals("Juan")); //la forma mas adecuada de comparar string, es lo mismo que el de arriba pero mas "correcto"
        System.out.println(nombre.equalsIgnoreCase("JUAN")); //compara e ignora si son mayusculas o minusculas

        //Prompt-sync en java
        Scanner usuarioInput = new Scanner(System.in); //podemos definir el nombre de la variable del prompt como queramos
        System.out.println("ingresa una edad: "); //le podemos sacar el ln para que no haga salto de linea, o no.
        int edad = usuarioInput.nextInt(); //esperara el dato correspondiente a ingresar por el usuario el nextInt puede ser cambiado de acuerdo al dato que se pida
        System.out.println("Su edad es: " + edad);
        usuarioInput = new Scanner(System.in);
        System.out.println("ingresa una contraseña: ");
        String contraseniaIngresada = usuarioInput.nextLine();
        System.out.println(contrasenia.equalsIgnoreCase(contraseniaIngresada));
    }
}

/*import java.util.Scanner;

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Kathy";
        final String CONTRASENIA = "1234";
        System.out.println(" Mi nombre es "+ nombre);
        System.out.println("Longitud: " + nombre.length());
        System.out.println("Caracter: " + nombre.charAt(3));
        System.out.println("Minúscula:" + nombre.toLowerCase());
        System.out.println("Mayúscula:" + nombre.toUpperCase());
        System.out.println(nombre.contains("hy"));

        System.out.println(nombre == "Kathy");
        System.out.println(nombre.equals("KATHY"));

        // PROMPT de JAVA
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa una contraseña: ");
        String contraseniaIngresada = consola.nextLine();
        System.out.println(CONTRASENIA.equalsIgnoreCase(contraseniaIngresada));
    }
}*/
