package Herencia;

public class Animal {
    //atributos
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    void comer(){
        System.out.println("Esta comiendo...");
    }
}
