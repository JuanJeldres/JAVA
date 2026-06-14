package Introduccion;

public class Main {
    public static void main(String[] args) {

        /*var persona1 = new Persona();*/ //"instanciamos" la clase creando una variable que la llame o la "instancie"
        /*persona1.edad = 30;*/ //puedo darle valores a los atributos desde aca, fuera del archivo de la clase, o tambien desde dentro de el otro archivo con "constructores"
        /*System.out.println(persona1.edad);*/ //me dara el valor asignado a la etiqueta

        var persona1 = new Persona("Juan", 30, "juancho@gmail.com"); //va llenando los atributos del constructor en el archivo "persona" con estos valores por orden
        System.out.println(persona1.edad);
        System.out.println(persona1.nombre);

        persona1.presentarse();
        persona1.infoPersona();

        /*var cohorte25 = new cohorte("JAVA", 25);
        cohorte25.saludar();
        cohorte25.confusiondesaludos();
        saludarC25();*/

        //modificadores de acceso, se agregan al inicio de un metodo:
        //public, permite que se acceda al metodo desde cualquier parte
        //private, no permite usar fuera de la clase por ningun motivo, permite "cuidar" y tener mayor control de algun atributo para que este no sea modificado. esto es lo mas comun de ver.
        //protected, permite llamar dentro del paquete (carpeta)
        //default, es cuando no se le pone nada, se puede acceder al contenido desde el mismo paquete

        }

        /*static void saludarC25() {
            System.out.println("hola c25 dudes");
        }

        public static class cohorte {
            //atributos
            String nombre;
            int numeroCohorte;
            //constructor
            public cohorte(String nombre, int numeroCohorte) {
                this.nombre = nombre;
                this.numeroCohorte = numeroCohorte;
            }
            //metodo
            void saludar (){
                System.out.println("hola chamos, saludando a la cohorte" + this.nombre + " " + this.numeroCohorte);
            }

            void confusiondesaludos(){
                System.out.println("saludos");
            }
        } //se cierra la clase cohorte25, todos los metodos dentro de esto entonces se llaman con cohorte25.*/
}
