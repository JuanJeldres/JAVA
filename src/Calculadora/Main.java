package Calculadora;

public class Main {
    public static void main(String[] args) {

        var calculadora = new Operaciones();
        var resultado1 = calculadora.suma(3, 4);
        System.out.println(resultado1);

        var resultado2 = calculadora.sumar(3.5, 4.5); //se escoge la suma con double ya que ahora existen dos metodos suma, esto se denomina overload o sobrecarga de metodos
        System.out.println(resultado2); //tuff

    }
}
