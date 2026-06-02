public class Operadores {
    public static void main(CadenasTexto[] args) {
        //operadores aritmeticos
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3/2);
        System.out.println(3%2);

        //operadores de asignacion
        int num1 = 35; //el = es de asignacion
        num1 = num1 +1; //asignacion +1
        num1 += 4; //lo mismo que el anterior
        num1 *= 2;
        num1 /= 2;
        num1 %= 2;
        System.out.println(num1);

        //operadores de comparacion
        System.out.println(2 > 4);
        System.out.println(2>=4);
        System.out.println(2<4);
        System.out.println(2<=4);
        System.out.println(2!=4);
        System.out.println(2 == 4); //en java no existe ya estrictamente ===

        //operadores logicos
        System.out.println(true && false); //este es el and, igual que JC, mas riguroso que el or
        System.out.println(true || false); //este es el or
        System.out.println(2< 4 && 2 >=4);

        //operadores unarios (los i++ y cosas asi)
        int num2 = 2;
        System.out.println("num2 = " + num2++); // cambiara el valor en la siguiente linea, no de inmediato
        System.out.println("num2 = " + num2); //aca me aparecera el incremento declarado en la linea anterior
        System.out.println("num2 = " + ++num2); //este imprimira instantaneamente el incremento, ponemos los ++ antes, lo mismo para decrementos con --
        System.out.println("num2 = " + num2);



    }
}
