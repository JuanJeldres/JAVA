package Example;

import Herencia.Gato;
import Introduccion.Persona;

public class Main {
    public static void main(String[] args) {
        var persona1 = new Persona("Peeps", 40, "peeps@gmail.com");
        persona1.presentarse(); //si el metodo original que se llama no tiene public no se le podra llamar
        /*persona1.nombre = "peepo";*/ //me avisara en los errores del programa que el atributo no es publico si no lo es. en este caso no puedo acceder por que el atributo nombre no es publico en el archivo Persona

        var gatito = new Gato("gatubelo", "naranjoso");
        gatito.color = "naranjuelo"; //puedo acceder por que fue declarado publico

    }
}
