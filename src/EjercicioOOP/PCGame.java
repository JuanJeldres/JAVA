package EjercicioOOP;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class PCGame extends VideoGame {
    //atributos heredables, nombre juego, categoria precio?
    //requisitos minimos
    String almacenamiento;
    String memoriaRam;
    String GPUminima;
    String CPUminima;

    public PCGame(String nombreJuego, String categoria, int precio, String almacenamiento, String memoriaRam, String GPUminima, String CPUminima) {
        super(nombreJuego, categoria, precio);
        this.almacenamiento = almacenamiento;
        this.memoriaRam = memoriaRam;
        this.GPUminima = GPUminima;
        this.CPUminima = CPUminima;
    }

//{String Almacenamiento, String memoriaRam, String sistemaOperativo)}


    @Override
    void showinfoGetter() {
        super.showinfoGetter();
        System.out.println("Plataforma: PC");
        System.out.println("##Requisitos##");
        System.out.println("Almacenamiento: " + this.almacenamiento);
        System.out.println("Memoria Ram: " + this.memoriaRam);
        System.out.println("GPU Minima: " + this.GPUminima);
        System.out.println("CPU Minima: " + this.CPUminima);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Plataforma: PC");
        System.out.println("##Requisitos##");
        System.out.println("Almacenamiento: " + this.almacenamiento);
        System.out.println("Memoria Ram: " + this.memoriaRam);
        System.out.println("GPU Minima: " + this.GPUminima);
        System.out.println("CPU Minima: " + this.CPUminima);
    }
}
