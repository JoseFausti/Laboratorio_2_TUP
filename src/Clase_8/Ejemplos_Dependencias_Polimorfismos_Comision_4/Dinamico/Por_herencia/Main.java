package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Dinamico.Por_herencia;

public class Main {
    public static void main(String[] args) {
        //DownCasting
        Padre padre = new Hijo("Jose","Pepe");
        Hijo hijo = new Hijo("Juan","Jauni");
        System.out.println("Nombre del Padre: " + padre.getNombre());
        System.out.println("Apodo del Padre: " + ((Hijo) padre).getApodo());
        System.out.println("Nombre del Hijo: " + hijo.getNombre());
        System.out.println("Apodo del Hijo: " + hijo.getApodo());

        System.out.println("---------------------------------------------");

        //UpCasting
        Padre padre2 = new Hijo("Lucas","Colo");
        Hijo hijo2 = new Hijo("Jeronimo","Jero");
        System.out.println("Nombre del Padre: " + padre2.getNombre());
        System.out.println("Apodo del Padre: no es posible acceder al metodo del hijo");
        System.out.println("Nombre del Hijo: " + hijo2.getNombre());
        System.out.println("Apodo del Hijo: " + hijo2.getApodo());
    }
}
