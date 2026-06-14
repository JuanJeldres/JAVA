package Herencia;

public class Main {
    public static void main(String[] args) {

        var gatito = new Gato("Belinda", "naranjo");
        System.out.println(gatito.color);
        System.out.println(gatito.nombre);
        /*gatito.comer();
        gatito.maullar();*/
        gatito.maullarycomer();
        var perrito = new Perro("Jack", "Terrier");
        System.out.println(perrito.raza);
        perrito.ladrar();
        var animalito = new Animal("Morro");
    }
}
