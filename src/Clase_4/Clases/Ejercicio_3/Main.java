package Clase_4.Clases.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Ciudades
        Ciudades ciudad = new Ciudades(1000000, 12345, 1, "Ciudad Ejemplo", null);

        // Crear instancias de Impuestos
        Impuesto1 impuesto1 = new Impuesto1(1000000);
        Impuesto2 impuesto2 = new Impuesto2(1000000);
        Impuesto3 impuesto3 = new Impuesto3(1000000);
        Impuesto4 impuesto4 = new Impuesto4(1000000);
        Impuesto5 impuesto5 = new Impuesto5(1000000);

        // Asignar impuestos a la ciudad
        ciudad.setImpuesto(impuesto1);

        // Obtener el impuesto y calcularlo
        Impuesto impuestoCiudad = ciudad.getImpuesto();
        if (impuestoCiudad != null) {
            double impuestoCalculado = impuestoCiudad.CalcularImpuesto();
            System.out.println("El impuesto calculado para la ciudad es: " + impuestoCalculado);
        } else {
            System.out.println("No se ha definido un impuesto para la ciudad.");
        }
    }
}
