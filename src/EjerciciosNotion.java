import java.util.Scanner;

public class EjerciciosNotion {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);
        /*System.out.print("Ingresa tu nombre: ");
        String nombre = inputUsuario.nextLine();
        inputUsuario = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento: ");
        int añoNacimiento = inputUsuario.nextInt();

        System.out.println("Hola " + nombre + ", tu edad aproximada es de " + (2026 - añoNacimiento) + " años.");

        //solicitud de temperatura
        inputUsuario = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en Celsius: ");
        double temperaturaCelsius = inputUsuario.nextDouble(); //tiene que ser double tambien aun que sea un numero entero para que en el calculo de la conversion pueda considerar a los dos numeros como decimales
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        System.out.println(temperaturaFahrenheit);

        //area y perimetro de un rectangulo
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa la base del rectangulo: ");
        int baseRectangulo = inputUsuario.nextInt();
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa la altura del rectangulo: ");
        int alturaRectangulo = inputUsuario.nextInt();
        System.out.println("El area del rectangulo es de: " + (baseRectangulo * alturaRectangulo));
        System.out.println("El perimetro del rectangulo es de: " + ((baseRectangulo * 2) + (alturaRectangulo * 2)));

        //descuento
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa el precio del producto: ");
        int precioProducto = inputUsuario.nextInt();
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa el porcentaje de descuento sin %: ");
        int porcentajeDescuento = inputUsuario.nextInt();
        System.out.println("su descuento sobre el producto es de: " + (precioProducto * porcentajeDescuento) / 100);
        int precioFinal = precioProducto - ((precioProducto * porcentajeDescuento) / 100);
        System.out.println("el precio final con el descuento aplicado es de: " + precioFinal + " pesos.");

        // numero positivo o negativo?
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa un number: ");
        int numero = inputUsuario.nextInt();
        if(numero >= 0){
            System.out.println("El numero " + numero + " es positivo");
        }else{
            System.out.println("El numero " + numero + " es negativo");
        }


        // mayor o menor de edad
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        int edad = inputUsuario.nextInt();
        while(edad < 18){
            System.out.println("Eres menor de edad");
            break;
        }
        while(edad >= 18){
            System.out.println("Eres mayor de edad");
            break;
        }*/

        //numero par o impar
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa un numero: ");
        int num1 = inputUsuario.nextInt();
        // num1 %= 2 --> num1 = num1 % 2
        if(num1 % 2 == 0) {
            System.out.println(num1 + " es un numero par.");
        }else if(num1 % 2 == 1){
            System.out.println(num1 + " es un numero impar");
        }else{
            System.out.println("El numero es 0");
        }

        //comparador de numeros
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa un numero");
        num1 = inputUsuario.nextInt();
        inputUsuario = new Scanner(System.in);
        System.out.println("ingresa un segundo numero:");
        int num2 = inputUsuario.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else if(num1 < num2){
            System.out.println("El segundo digito es mayor que el primero");
        }else{
            System.out.println("Los numeros son iguales");
        }

        //calculadora simple
        //inputUsuario.nextDouble();
        double double1 = num1;
        System.out.println("ingresa el primer numero para calcular: ");
        double1 = inputUsuario.nextDouble(); //no se puede cambiar un int a un double?, si se puede con casteo de datos es decir transformar de un tipo a otro tipo
        double double2 = num2;
        System.out.println("ingresa el segundo numero para calcular: ");
        double2 = inputUsuario.nextDouble();
        System.out.println(double1 +" "+ double2);



    }
}
