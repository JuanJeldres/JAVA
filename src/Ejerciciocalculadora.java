import java.util.Scanner;

public class Ejerciciocalculadora {

    /*static double pedirNumero(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double numero = inputUsuario.nextDouble();
        return numero;
    }

    static void ejecutarCaso(double operacion){ //cuando es void y cuando no? por que void?
        double num1 = pedirNumero();
        double num2 = pedirNumero();
    }

    static String menu(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("###Calculadora###");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3, Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. salir");
        return int opcion = inputUsuario.nextLine();
    }*/


    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("ingresa el primer numero: ");
        double num1 = inputUsuario.nextDouble();
        System.out.println("ingresa el segundo numero: ");
        double num2 = inputUsuario.nextDouble();

        System.out.println("###Calculadora###");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3, Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. salir");
        System.out.print("escoge el numero de la operacion: ");
        int opcion = inputUsuario.nextInt();

        if(opcion == 1){
            System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        }else if(opcion == 2){
            System.out.println(num1 - num2);
        }else if(opcion == 3){
            System.out.println(num1 * num2);
        }else if(opcion == 4){
            System.out.println(num1 / num2);
        }else if(opcion == 5){
            System.out.println("The End.");
        }else{
            System.out.println("opcion invalida");
            //volver a ejecutar menu, como? quizas ahi llamar de nuevo a la funcion del menu una vez exista
        }

    }
}


//inputUsuario.nextLine();
//if(opcion.equals("1")

//tutoria kathy
/*import java.util.Scanner;

public class Funciones {
    // Crear nueva función que imprima un mensaje
    static String impresion(String mensaje){
        return "mensaje: " + mensaje;
    }

    // Crear función sumar
    static int sumar(int a, int b){
        return a + b;
    }

    // Crear función sin parametros
    static void saludarC25(){
        System.out.println("Hola Cohorte 25");
    }

    // Crear una función esPar
    static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    static int pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número");
        int num1 = entrada.nextInt();
        return num1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        String mensajeDevuelto = impresion(mensajeIngresado);
        System.out.println(mensajeDevuelto);

        System.out.print("Ingrese un número: ");
        var num1 = Integer.parseInt(sc.nextLine());
        var num2 = pedirDatos();

        System.out.println("Resultado: "+ sumar(num1, num2));

        System.out.printf("Su número %d es par: %b \n", num1, esPar(num1));

        saludarC25();

    }

}*/
