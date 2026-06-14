package EjercicioOOP;

import java.util.ArrayList;

public class VideoGame {
    private String nombreJuego;
    private String Categoria;
    private int Precio;

    public VideoGame(String nombreJuego, String categoria, int precio) {
        this.nombreJuego = nombreJuego;
        this.Categoria = categoria;
        this.Precio = precio;
    }

    void showInfo(){
        if (this.Precio > 0){
            System.out.println("");
            System.out.printf("""
                Nombre: %s
                Categoria: %s
                Precio: %d
                """, this.nombreJuego, this.Categoria, this.Precio);
        }else{
            System.out.println("");
            System.out.println(this.nombreJuego + " tiene un precio invalido aunque 0 significa gratis prohibimos esos juegos, ingresa un precio valido,");
            System.out.println("");
        }

    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public String getCategoria() {
        return Categoria;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    void showinfoGetter(){
        if (this.getPrecio() > 0){
            System.out.println("");
            System.out.printf("""
                Nombre: %s
                Categoria: %s
                Precio: %d
                """, this.getNombreJuego(), this.getCategoria(), this.getPrecio());
        }else{
            System.out.println(this.getNombreJuego() + " tiene un precio invalido aunque 0 significa gratis prohibimos esos juegos, ingresa un precio valido");
        }
    }
   /* ArrayList<VideoGame> juegos = new ArrayList<>();

    void agregarJuegueteLista(){
        juegos.add();
    }*/

}
