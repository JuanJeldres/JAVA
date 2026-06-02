import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i); //imprimira de uno en uno desde cero hasta 4 por que tiene que ser menor a 5
        }

        int i = 1;
        while(i <= 5){
            System.out.println(i); //bucle infinito
            i++; //ya no es infinito, ira incrementando, hasta 5
        } //la misma sintaxis que JC hasta el momento

        Scanner sc = new Scanner(System.in);
        /*System.out.println("ingresa un numero: ");
        int numero = sc.nextInt(); //error por que no definimos un numero*/
        try{ //atrapamos el error
            System.out.println("ingresa un numero: ");
            int numero = sc.nextInt();
            System.out.println("excelente, tu numero es " + numero);
        } catch(Exception e){ //atrapamos el error
            System.out.println("ingresa un numero valido"); //y en error le decimos al usuario que "ingrese un numero valido"
        }
    }
}
