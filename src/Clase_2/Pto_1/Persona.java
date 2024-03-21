package Clase_1.Pto_1;

public abstract class Persona {
    // Atributos protegidos
    protected int id;
    protected int dni;
    protected String nombreCompleto;

    // Constructor
    public Persona(int id, int dni, String nombreCompleto) {
        this.id = id;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Método abstracto
    public abstract void Informacion();
}

