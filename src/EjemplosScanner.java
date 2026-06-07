import java.util.Scanner;

public class EjemplosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //se hace solo una vez
        System.out.print("ingresa un numero: ");
        int num = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingresa un nombre: ");
        String nombre = entrada.nextLine(); //no me lo tomara por que q diferencia del next int que solo me toma un numero, este toma hasta los saltos de lineas osea los enter que presiono en el teclado cuando ingreso un comando como usuario
        System.out.println("resultado: " + num + " y " + nombre);
        //para evitarlo debemos limpiar la situacion y lo haremos con entrada.nextLine(); luego de el input con int
    }
}
