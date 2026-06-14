package Encapsulacion;

public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private final String rut; //se agrega final por que el rut no se cambiara, siempre es el mismo rut
    private String correo;

    //constructor
    public Persona(String nombre, int edad, String rut, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.correo = correo;
    }
    //la encapsulacion es una manera de resguardar los datos y que mediante metodos podamos acceder a ellos y modificarlos. la idea de la encapsulacion es permitir controlar el acceso!

    //metodo getter. click derecho generate getter, sirve para "leer" el valor aunque este privado
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public String getCorreo() {
        return correo;
    }

    //metodo setter para modificar atributos privados, click derecho generate setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        //y podemos agregar requisitos, por ejemplo
        if (edad > 0){
            this.edad = edad;
        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
