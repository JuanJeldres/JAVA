package Introduccion;

public class Persona { //creamos una clase publica que va a tener un molde con atributos
    //Atributos, que atributos puede tener una persona?
    /*public*/ String nombre;
    int edad;
    String correo;

    //Constructor, permite construir las caracteristicas que tendran los atributos ya mencionados en vez de llamarlos desde el archivo main
    /*public Persona(){ //podemos crearlo a mano o...

    }*/

    //o damos clicl derecho, generate --> constructor y seleccionamos las variables que queremos que se incluyan, autogenerara esta estructura:
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre; //hace referencia a 'this' o este.whatever de la clase desde la funcion constructora
        this.edad = edad;
        this.correo = correo;
    } //finaliza la funcion constructora

    //Metodo
    //me gustaria que esta persona se presentara o salude
    public void presentarse(){ //este metodo necesita tener public para ser accedido desde cualquier lugar! dood
        System.out.println("hola, soy" + this.nombre);
    }

    void infoPersona(){
        System.out.printf("""
                nombre: %s
                edad: %d
                correo: %s
                """, this.nombre, this.edad, this.correo);
    }

}
