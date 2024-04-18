package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public class Auto extends Vehiculo{

    //Constructor
    public Auto(int velocidad) {
        super(velocidad);
    }

    //Metodos
    @Override
    public void acelera() throws miException{
        super.acelera();
        int masVelocidad = super.getVelocidad() + 5;
        try {
            if (masVelocidad >= 120){
                throw  new miException("El Auto está intentando acelerar a más de 120 km/h");
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
