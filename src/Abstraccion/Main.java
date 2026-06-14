package Abstraccion;

import java.util.ArrayList;
import java.util.List;

// el polimorfismo es uno de los mecanismos que permite que un mismo metodo pueda comportarse de distintas formas dependiendo del objeto que los ejecute, poli muchas morfismo formas. El control remoto es nuestra clase padre. por ejemplo, el control remoto tiene el botón de encender, sí, puedo encender, encender ¿qué? Y ahí está el, vamos a decir como el trasfondo. Si yo por ejemplo, tengo un control remoto, pero de un televisor, ¿qué voy a encender? El televisor.
public class Main {
    public static void main(String[] args) {
        var gatito = new Gato("Belinda", "naranjoso");
        gatito.hacerSonido();

        var perrito = new Perro("Morro", "Terrier");
        perrito.hacerSonido();

        var pajarraco = new Ave("cirilo", "pequeñoto");
        pajarraco.vuela();
        pajarraco.transportar();

        var avion1 = new Avion();
        avion1.vuela();
        avion1.transportar();

        Volador pajarito1 = new Ave("canario1", "grande");
        pajarito1.transportar();
        pajarito1.vuela();

        List<String> nombres = new ArrayList<>();

    }
}
