import java.util.Scanner;

public class Funciones { //esto es lo segundo que se ejecutará
    //crearemos una nueva funcion que imprima el "mensajeIngresado", lo hacemos antes de entrar a la clase main, pero si llamamos a la static void de antemano
    static void impresion(String mensaje) {
        System.out.println("mensaje: " + mensaje);
    }//adentro de los parametros colocamos el tipo de variable y la variable que va a recibir, en este caso String mensajeIngresado

    //crear funcion sumar
    static int sumar(int a, int b){
        return a + b; //return no imprime, solo devuelve
    } // int  por que son numeros enteros

    //funcion sin parametros
    static void saludarC25(){
        System.out.println("Hola cohorte C25");
    }

    //crear una funcion esPar
    static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) { //esto es lo primero que se ejecutara siempre, la rama main.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        //ahora para que se imprima esto en vez de sout crearemos una funcion
        impresion(mensajeIngresado); //llamamos la funcion de arriba, esto imprime! es lo mismo que sout

        System.out.println("ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();

        System.out.println("Resultado: " + sumar(num1, num2));

        saludarC25(); //funcion c25 de arriba

        System.out.printf("su numero %d es oar: %b /n", num1, esPar(num1)); //funcion par de arriba concatenada

        int a = 3;
        Integer b = 3; //tambien es un numero entero pero Integer le da la condicion de objeto
        //por ejemplo puedo trabajar una variable tipo string y utilizar integer para hacer una conversion a numero entero, asi:
        System.out.println("Ingrese un numero dude para ser integeriado");
        var num3 = Integer.parseInt(sc.nextLine());
    }
}

//tengo dos opciones o sout o impresion en una funcion, por que return ya cumple , ya es el fin de una funcion
//var es mas flexible, puedo llamar una funcion con var abajo
//el parametro se utiliza si en la funcion necesariamente va a tener que ingresar un valor, por ejemplo en esPar le decimos que ingresara un int numero, ya que despues en el main le daremos la instruccion con un prompt de ingresar numero




//codigo copiado de kathy
/*import java.util.Scanner;

public class Funciones {
    // Crear nueva función que imprima un mensaje
    static void impresion(String mensaje){
        System.out.println("Mensaje: " + mensaje);
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




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        impresion(mensajeIngresado);

        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();

        System.out.println("Resultado: "+ sumar(num1, num2) );

        System.out.printf("Su número %d es par: %b \n", num1, esPar(num1));

        saludarC25();





    }

}*/

