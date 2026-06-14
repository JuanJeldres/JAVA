package Abstraccion;


public class Gato extends Animal { //con esto generamos herencia, esta clase se extiende desde Animal
    public String color;
    public Gato(String nombre, String color){
        super(nombre); //super hace que gato reciba un atributo de la clase padre, en este caso nombre
        this.color = color;
    }

    @Override //le estoy diciendo hey en la siguiente linea vas a escribir un metodo que es perteneciente a la clase padre y tu lo vas a sobreescribir
    void hacerSonido(){
        System.out.println("miau");
    }

    void maullarycomer(){
        System.out.println(" y ");
        super.comer();
    }

}
