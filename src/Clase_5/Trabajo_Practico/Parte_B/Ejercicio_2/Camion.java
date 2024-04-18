package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public class Camion extends Vehiculo{

    //Atributo
    private Chofer chofer;

    //Constructor
    public Camion(int velocidad) {
        super(velocidad);
    }

    //Getter y Setter
    public Chofer getChofer() {
        return chofer;
    }
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    //Metodos
    @Override
    public void acelera() throws miException{
        super.acelera();
        try {
            if (getVelocidad() >= 120){
                throw  new miException("El Camión está intentando acelerar a más de 120 km/h");
            }
        }catch (miException me){
            super.frena();
        }
    }
    @Override
    public void frena() {
        super.frena();
        if (super.getVelocidad() < 0){
            super.setVelocidad(0);
        }
    }
}
