package EjercicioOOP;

public class ConsoleGame extends VideoGame{

    String consolaCompatible;

    public ConsoleGame(String nombreJuego, String categoria, int precio, String consolaCompatible) {
        super(nombreJuego, categoria, precio);
        this.consolaCompatible = consolaCompatible;
    }

    @Override
    void showinfoGetter() {
        super.showinfoGetter();
        System.out.println("Consola Compatible: " + this.consolaCompatible);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Consola Compatible: " + this.consolaCompatible);
    }
}
