package Dependencia;

public class Impresora {

    private String modelo;

    public Impresora(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void encender(){
        System.out.println(" Impresora "+ modelo+ " Encendida!!");
    }

    public void imprimir(Papel papel){

        System.out.println(" Imprimiendo en papel "+papel.getTamaño());
    }
}
