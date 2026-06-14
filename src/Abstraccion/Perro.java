package Abstraccion;

public class Perro extends Animal {
    //atributos
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

   @Override
    void hacerSonido(){
       System.out.println("guau!");
   }

}