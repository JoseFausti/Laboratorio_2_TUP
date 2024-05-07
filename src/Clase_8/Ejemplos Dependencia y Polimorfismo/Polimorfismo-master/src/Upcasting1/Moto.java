package Upcasting1;

/**
 *
 *
 */
public class Moto extends Vehiculo {

    private int anchoDeManubrio;

    public Moto(int anchoDeManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    public void hacerWheelie() {
        System.out.println("Haciendo la wheelie...");
    }
}
