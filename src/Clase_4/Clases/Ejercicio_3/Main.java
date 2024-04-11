package Clase_4.Clases.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Ciudades
        Ciudades ciudad1 = new Ciudades(1000000, 12345, 1, "Ciudad A", null);
        Ciudades ciudad2 = new Ciudades(500000, 54321, 2, "Ciudad B", null);

        // Crear instancias de Impuestos
        Impuesto1 impuesto1 = new Impuesto1(1000000);
        Impuesto2 impuesto2 = new Impuesto2(2000000);

        // Asignar impuestos a las ciudades
        ciudad1.setImpuesto(impuesto1);
        ciudad2.setImpuesto(impuesto2);

        // Obtener y calcular el impuesto de cada ciudad
        calcularImpuesto(ciudad1);
        calcularImpuesto(ciudad2);
    }

    public static void calcularImpuesto(Ciudades ciudad) {
        Impuesto impuestoCiudad = ciudad.getImpuesto();
        if (impuestoCiudad != null) {
            double impuestoCalculado = impuestoCiudad.CalcularImpuesto();
            System.out.println("El impuesto calculado para " + ciudad.getNombre() + " es: " + impuestoCalculado);
        } else {
            System.out.println("No se ha definido un impuesto para " + ciudad.getNombre());
        }
    }
}
