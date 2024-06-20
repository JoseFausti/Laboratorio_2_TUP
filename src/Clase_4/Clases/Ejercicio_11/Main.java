package Clase_4.Clases.Ejercicio_11;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Creamos un representante
        Representante representante = new Representante(
                "20-12345678-9", "Calle Falsa 123", new Date(), new Date(), null, "Juan Pérez", "1234-5678");

        // Creamos un cliente
        Cliente cliente = new Cliente(
                "Av. Libertador 123", new Date(), new Date(), "Ana Gómez", "5678-9012", new ArrayList<>(), representante);

        // Creamos un producto
        Producto producto = new Producto("Crema facial", 120.0, new ArrayList<>());

        // Creamos una venta
        Venta venta = new Venta(new Date(), 120.0, producto, cliente, representante);

        // Agregamos la venta a la lista de ventas del cliente
        cliente.getVentas().add(venta);

        // Imprimimos los detalles de la venta
        venta.obtenerDetallesVenta();
        System.out.println();

        // Imprimimos el historial de compras del cliente
        cliente.obtenerHistorialCompras();
        System.out.println();

        // Creamos una comisión para el representante
        Comision comision = new Comision(new Date(), 50.0);
        comision.setRepresentante(representante);

        // Calculamos la comisión
        comision.calcularComision();
        System.out.println();

        // Creamos una empresa cosmética
        EmpresaCosmetica empresa = new EmpresaCosmetica("Cosmética S.A.", new ArrayList<>());

        // Creamos un laboratorio
        Laboratorio laboratorio = new Laboratorio("LabCosmético", 1, new ArrayList<>());

        // Agregamos el laboratorio a la empresa cosmética
        empresa.agregarLaboratorio(laboratorio);

        // Creamos una reunión
        Reunion reunion = new Reunion(new Date(), null);
        reunion.setEmpresaCosmetica(empresa);

        // Programamos la reunión
        reunion.programarReunion(new Date());

        // Imprimimos detalles del representante
        representante.obtenerDetalles();
    }
}
