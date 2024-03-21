package Clase_1.Pto_2;
public abstract class Persona {
    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para mostrar la información
    public void informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}

