package Abstraccion;

public class Avion implements Volador{
    @Override
    public void vuela(){
        System.out.println("vuela con motores");
    }

    @Override
    public void transportar() {
        System.out.println("personas");
    }
}
