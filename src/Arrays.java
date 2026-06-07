public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3]; //aca estamos declarando un arreglo o array, se declara con tipodedato[corchetes] yelnombredelarray = new int[numerodeelementos]. la cantidad de elementos sera 3 y los valores seran 0 por default ya que no los hemos asignado
        String[] nombres = new String[4]; //los valores seran null por default
        String[] usuarios = {"Juan", "Maria", "Seba", "Sofia"}; //en java se trabaja con llaves para definir valores
        System.out.println(usuarios[0]); //imprimir elementos del array!
        numeros[0] = 26; //modificamos un elemento del array
        numeros[1] = 30;
        numeros[2] = 50;
        /*System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("numeros[2] = " + numeros[2]);*/

        for (int i = 0; i < numeros.length; i++) { //recorrer los numeros del array!
            System.out.println(numeros[i]);
        }
        int tamanio = numeros.length; //cuantos elementos hay
        System.out.println(tamanio);
    }
}