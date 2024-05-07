package Dependencia;

public class Main {
    public static void main(String[] args) {

        Papel papel = new Papel(4);
        Impresora impre = new Impresora("HP");

        impre.imprimir(papel);
    }
}
