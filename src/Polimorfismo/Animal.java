package Polimorfismo;

public class Animal {
    //atributos
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    void comer(){
        System.out.println("Esta comiendo...");
    }
    void hacerSonido(){
        System.out.println("este animal hace un sonido");
    }
}
