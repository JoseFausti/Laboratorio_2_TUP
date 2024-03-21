package Clase_3.Herencia;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;
    private List<Persona> hijos = new ArrayList<>();
    private Persona[] padres = new Persona[2];

    //Constructor
    public Persona(){}

    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(List<Persona> hijos) {
        this.hijos = hijos;
    }

    public Persona[] getPadres() {
        return padres;
    }

    public void setPadres(Persona[] padres) {
        this.padres = padres;
    }


    //Metodos
    public int Caminar(String lugar,int km){
        int pasos;
        pasos = km*3000;
        System.out.println("Estuve caminando por " + lugar);
        return pasos;
    }

    public void AgregarPadre(Persona padre){
        for (int i = 0; i < padres.length; i++ ) {
            if (padres[i] == null) {
                this.padres[i] = padre;
                break;
            }
        }
    }
    public void AgregarHijos(Persona hijos){
        this.hijos.add(hijos);
    }
}
