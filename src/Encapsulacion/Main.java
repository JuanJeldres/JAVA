package Encapsulacion;

public class Main {
    public static void main(String[] args) {

        var persona1 = new Persona("juan", 30, "19343387-8", "correo@correo");
        /*System.out.println(persona1.edad);*/ //no podemos entrar pq es privado
        System.out.println(persona1.getEdad()); //puedo acceder por el metodo get, de una manera indirecta.
        System.out.println(persona1.getNombre()); //is ts tuff?
        System.out.println(persona1.getRut());
        System.out.println(persona1.getCorreo());

        /*persona1.edad = 59;*/ //no nos va a dejar modificar por que es privado, aca es donde entra el metodo setter
        persona1.setNombre("maria");
        persona1.setEdad(50);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
    }
}
