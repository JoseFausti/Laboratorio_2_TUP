package Clase_5.Trabajo_Practico.Parte_B.Ejercicio_2;

public class Chofer{

    //Atributos
    private String nombre;
    private Matricula matricula;
    private Camion camion;

    //Constructor
    public Chofer(String nombre,Matricula matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Matricula getMatricula() {
        return matricula;
    }
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    //Metodo
    public void matriculaVencida()throws matriculaVencidaException{
       if (this.matricula.isFechaVencimiento()){
           throw new matriculaVencidaException("Su matricula ha expirado.");
       }else {
           System.out.println("Tiene permiso para conducir.");
        }
    }
}
