package Herencia;

/*public class Perro {
    //atributos
    String nombre;

    public Perro(String nombre){
        this.nombre = nombre;
    }

    void comer(){
        System.out.println("Esta comiendo...");
    }
}*/
//pero pasa que estamos repitiendo esto en el archivo gato, como nos podemos ahorrar esta repiticion y hace que gato "herede" los atributos de perro? partimos creando una clase padre, en este caso clase Animal

public class Perro extends Animal{
    //atributos
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    void ladrar(){
        System.out.println("Esta ladrando");
    }

}