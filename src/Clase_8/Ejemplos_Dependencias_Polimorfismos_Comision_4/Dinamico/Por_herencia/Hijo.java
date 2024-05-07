package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Dinamico.Por_herencia;

public class Hijo extends Padre{
    private String apodo;

    //Constructor
    public Hijo(String nombre, String apodo) {
        super(nombre);
        this.apodo = apodo;
    }

    //Getter y Setter

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
}
