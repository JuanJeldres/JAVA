package Herencia;

/*public class Gato {
    //atributos
    String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    void comer(){
        System.out.println("Esta comiendo...");
    }
}*/
public class Gato extends Animal{ //con esto generamos herencia, esta clase se extiende desde Animal
    public String color;
    public Gato(String nombre, String color){
        super(nombre); //super hace que gato reciba un atributo de la clase padre, en este caso nombre
        this.color = color;
    }

    void maullar(){
        System.out.println("Esta maullando " + super.nombre); //me aseguro que agarre el atributo de la clase padre con el super.
    }

    void maullarycomer(){
        maullar();
        System.out.println(" y ");
        super.comer();
    }

}
