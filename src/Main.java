public class Main {
    public static void main(CadenasTexto[] args){
        //comentario
        /*comentario*/
        //variables lo que era let o const, aca debemos declarar el tipo de valor
        int numero = 5; //aca si le pongo comas al numero me da error por que Java no es dinamico para cambiar el numero a texto tan facil
        System.out.println("Numero: " + numero); //abreviacion sout lo autocompleta, es imprimir console.log()
        System.out.println("Hola Mundo");

    //Tipos de datos
        //primitivos, se escriben en minuscula
        byte tipoByte = 1; //es un valor chiquito, minimo -128 hasta 127
        short tipoShort = 32767; // valor que mermite hasta 32767
        int tipoInt = 500000; //para numeros enteros
        double tipoDouble = 1.6; //para definir numeros decimales
        boolean isReal = true;
        boolean hasCarnet = false;
        char tipoCaracter = 'A'; //asociado a solo un caracter, se ocupan comillas simples
        String tipoString = "Hola Mundo"; //es diferente a los demas, es un tipo de dato pero en Java no es primitivo, por eso la diferencia

        var variable = "Hola"; // si defino una variable tiene que ser siempre el mismo tipo de dato, en este caso string
        System.out.println(variable);
        variable = "Mundo"; //se puede reasignar un nuevo valor pero tiene que ser el mismo tipo de dato osea string en este caso
        System.out.println(variable);

        final double PI = 3.14; //con final declaro que una variable es constante, no se puede cambiar/reasignar despues, es const, y la variable se escribe con mayusculas

        //formas de imprimir y concatenar
        System.out.println(tipoString + " tengo " + numero + " años.");
        System.out.println("PI = " + PI);
        System.out.printf("Mi edad es %d, mi altura es %.2f, %s, es %b que la ltrea a es %c", numero, tipoDouble, tipoString, isReal, tipoCaracter); // &d define el numero entero %f es de tipo double (le agregamos .2 para que solo se muestren dos decimales) s% de tipo string el otro %b booleano el otro %c caracter. el porcentaje indica que se incertara una variable
        System.out.printf("""
        /nUsuario: %s
        Edad: %d
        Altura: %.2f
        Carnet: %b
        """, tipoString, numero, tipoDouble, hasCarnet);
        // /n para hacer un salto de linea se coloca antes de llamar una variable en sout
        System.out.print("quiero que esto");
        System.out.println("/nse separe de este");
        /*System.out.print("Hola Mundo");
        System.out.print("Voy a quedar pegadita arriba");

        System.out.print("Edad Kathy (" + numero + ")");
        System.out.printf("Edad Kathy (%d)", numero);
        */
    }
}