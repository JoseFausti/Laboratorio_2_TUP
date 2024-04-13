package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Parque {

    //Atributos
    private String nombre;
    private String fechaDeclaracion;
    private float espacioKm2;
    private List<Area> areas;
    private List<Alojamiento> alojamientos;
    private List<Entrada> entradas;
    private List<Personal> personal;
    private List<PersonaVisitante> visitantes;

    //Constructor
    public Parque(String nombre, String fechaDeclaracion, float espacioKm2, List<Area> areas, List<Alojamiento> alojamientos, List<Entrada> entradas) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.espacioKm2 = espacioKm2;
        this.areas = new ArrayList<>(areas);
        this.alojamientos = new ArrayList<>(alojamientos);
        this.entradas = new ArrayList<>(entradas);
        this.personal = new ArrayList<>();
        this.visitantes = new ArrayList<>();

    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeclaracion() {
        return fechaDeclaracion;
    }
    public void setFechaDeclaracion(String fechaDeclaracion) {
        this.fechaDeclaracion = fechaDeclaracion;
    }

    public float getEspacioKm2() {
        return espacioKm2;
    }
    public void setEspacioKm2(float espacioKm2) {
        this.espacioKm2 = espacioKm2;
    }

    public List<Area> getAreas() {
        return areas;
    }
    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Personal> getPersonal() {
        return personal;
    }
    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }
    public void setAlojamientos(List<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public List<PersonaVisitante> getVisitantes() {
        return visitantes;
    }
    public void setVisitantes(List<PersonaVisitante> visitantes) {
        this.visitantes = visitantes;
    }

    //Metodos
    public void agregarPersonal(Personal personal){//Agregacion
        this.personal.add(personal);
    }
}
