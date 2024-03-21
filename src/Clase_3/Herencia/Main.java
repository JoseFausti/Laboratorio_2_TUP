package Clase_3.Herencia;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jose",33,EstadoCivil.CASADO);
        Persona p2 = new Persona("Giuliana",30,EstadoCivil.CASADO);
        Persona p3 = new Persona("Juancito",12,EstadoCivil.SOLTERO);

        p1.AgregarHijos(p3);
        p2.AgregarHijos(p3);

        p3.AgregarPadre(p1);
        p3.AgregarPadre(p2);

        System.out.println("Soy " + p1.getNombre() + ". Tengo un hijo que se llama: " + p1.getHijos().get(0).getNombre());
        System.out.println("Soy " + p2.getNombre() + ". Tengo un hijo que se llama: " + p2.getHijos().get(0).getNombre());

        System.out.println("Soy " + p3.getNombre() + " y mis padres son: ");
        System.out.println(p2.getPadres()[0].getNombre());
        System.out.println(p2.getPadres()[1].getNombre());

    }
}
