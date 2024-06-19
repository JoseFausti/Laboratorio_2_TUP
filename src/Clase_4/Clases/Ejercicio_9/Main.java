package Clase_4.Clases.Ejercicio_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Artista
        Artista artista = new Artista("Leonardo da Vinci", "Italia", "Renacimiento", "Polímata", "Fue un pintor, anatomista, arquitecto y escultor renacentista italiano.", new Date(1452-1900, 4, 15), new Date(1519-1900, 4, 2));

        // Crear una lista de obras de arte
        List<ObraDeArte> obrasDeArte = new ArrayList<>();
        ObraDeArte obra1 = new ObraDeArte("Italia", artista, TipoCultura.RENACENTISTA, TipoEpoca.RENACIMIENTO);
        ObraDeArte obra2 = new ObraDeArte("Italia", artista, TipoCultura.RENACENTISTA, TipoEpoca.RENACIMIENTO);
        obrasDeArte.add(obra1);
        obrasDeArte.add(obra2);

        // Crear una colección de obras de arte
        ColeccionDeObras coleccion = new ColeccionDeObras(1, "Colección Renacentista", new Date(2020-1900, 1, 1), "Una colección de arte del Renacimiento.", artista, obrasDeArte);

        // Crear una escultura y una pintura
        Escultura escultura = new Escultura("Clásico", 1.75, 300, TipoMaterial.MARMOL);
        Pintura pintura = new Pintura(TipoEstilo.IMPRESIONISTA, TipoPintura.OLEO, TipoSoporte.LIENZO);

        // Añadir la escultura y la pintura a la colección
        coleccion.agregarObraDeArte(obra1); // Añadir la escultura
        coleccion.agregarObraDeArte(obra2); // Añadir la pintura

        // Crear una exposición
        Exposicion exposicion = new Exposicion("Exposición Renacentista", new Date(2023-1900, 6, 1), new Date(2023-1900, 9, 1));
        exposicion.agregarObraExhibida(coleccion);

        // Crear un museo y agregar la colección y la exposición
        Museo museo = new Museo();
        museo.agregarColeccion(coleccion);
        museo.agregarExposicion(exposicion);

        // Crear una colección de obras de arte para intercambio
        ColeccionDeObras coleccionIntercambio = new ColeccionDeObras(2, "Colección en préstamo", new Date(2021-1900, 3, 10), "Obras prestadas por otros museos.", artista, new ArrayList<>());
        ObjetosEnPrestamo prestamo = new ObjetosEnPrestamo("Museo de París", new Date(2023-1900, 8, 10), new Date(2023-1900, 5, 15));
        coleccionIntercambio.agregarObraDeArte(obra1); // Añadir una obra en préstamo

        // Agregar la colección de intercambio al museo
        museo.agregarColeccion(coleccionIntercambio);

        // Imprimir detalles del museo
        System.out.println("Detalles del museo:");
        for (ColeccionDeObras col : museo.getColecciones()) {
            System.out.println("Colección: " + col.getTitulo() + " - Descripción: " + col.getDescripcion());
        }

        for (Exposicion exp : museo.getExposiciones()) {
            System.out.println("Exposición: " + exp.getNombre() + " - Fecha Inicio: " + exp.getFechaInicio() + " - Fecha Fin: " + exp.getFechaFin());
        }
    }
}
