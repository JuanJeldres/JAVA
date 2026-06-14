package Abstraccion;

public class Ave extends Animal implements Volador { //implements implementa la interface: volador
    public String tamanio;

    public Ave(String nombre, String tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    void hacerSonido() {
        System.out.println("piopio");
    }

    @Override//es un override de la abstraccion vacia que se declaro en volador
    public void vuela() { // HAY QUE DEFINIR EL ACCESO PUBLICO DE ESTA VARIABLE ABSTRACTA QUE VIENE DE INTERFAZ VOLADOR
        System.out.println("volando con alas");
    }

    @Override
    public void transportar() {
        System.out.println("comida y ramitas");
    }
}
