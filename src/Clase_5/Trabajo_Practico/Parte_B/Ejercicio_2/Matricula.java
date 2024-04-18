package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public class Matricula {

    //Atributos
    private int numero;
    private boolean fechaVencimiento;
    private Chofer chofer;

    //Constructor
    public Matricula(int numero, boolean fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    //Getter y Setter
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(boolean fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Chofer getChofer() {
        return chofer;
    }
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
}
