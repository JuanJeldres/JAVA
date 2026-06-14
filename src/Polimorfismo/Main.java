package Polimorfismo;

// el polimorfismo es uno de los mecanismos que permite que un mismo metodo pueda comportarse de distintas formas dependiendo del objeto que los ejecute, poli muchas morfismo formas. El control remoto es nuestra clase padre. por ejemplo, el control remoto tiene el botón de encender, sí, puedo encender, encender ¿qué? Y ahí está el, vamos a decir como el trasfondo. Si yo por ejemplo, tengo un control remoto, pero de un televisor, ¿qué voy a encender? El televisor.
public class Main {
    public static void main(String[] args) {
        var gatito = new Gato("Belinda", "naranjoso");
        gatito.hacerSonido();

        var perrito = new Perro("Morro", "Terrier");
        perrito.hacerSonido();
    }
}
