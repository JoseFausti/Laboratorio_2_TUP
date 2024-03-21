package Clase_1.Pto_2;

// Clase Pasajero que hereda de Persona
public class Pasajero extends Persona {
    private int edad;

    public Pasajero(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.edad = edad;
    }

    // Getter y setter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar la información
    public void informacion() {
        super.informacion();
        System.out.println("Edad: " + edad);
    }
}