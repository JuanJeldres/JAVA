package Abstraccion;
//como definimos una clase abstracta? asi
abstract public class Animal {
    //atributos
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    void comer(){
        System.out.println("Esta comiendo...");
    }
    abstract void hacerSonido();
}
