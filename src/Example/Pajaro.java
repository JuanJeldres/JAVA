package Example;

import Herencia.Animal;

public class Pajaro extends Animal{
    String tamanio;

    public Pajaro(String nombre, String tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    void volar (){
        System.out.println("Esta volando el pajarraco" + super.nombre); //no puedo acceder por que String nombre en Animal no es publico, que pasa si lo cambiamos a protected? se elimina el problema, por que?? si estamos en un paquete diferente?, si, pero esta heredado, por lo tanto el paquete se alcanza a trasladar a pesar de que este protegido. entonces protect protege de uso entre paquetes, PERO si se hereda, se le da el acceso
    }
}

