package Clase_4.Clases.Ejercicio_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear áreas designadas para los complejos deportivos
        List<AreaDesignada> areasDesignadas = new ArrayList<>();
        areasDesignadas.add(new AreaDesignada(TipoIndicadorSituacion.CENTRO));
        areasDesignadas.add(new AreaDesignada(TipoIndicadorSituacion.ESQUINA));

        // Crear eventos para los complejos deportivos
        Evento evento1 = new Evento("2 horas", new Date(), TipoMaterial.PORTERIAS, 3, 100);
        Evento evento2 = new Evento("3 horas", new Date(), TipoMaterial.PERTIGAS, 2, 150);

        // Crear complejos deportivos
        ComplejoDeportivo complejo1 = new ComplejoDeportivo("1000m²", "Juan Pérez", "Ciudad A", areasDesignadas);
        complejo1.agregarEventos(evento1);
        complejo1.agregarEventos(evento2);

        ComplejoDeportivo complejo2 = new ComplejoDeportivo("1500m²", "María López", "Ciudad B", areasDesignadas);
        complejo2.agregarEventos(evento1);

        // Crear la sede de la olimpiada
        List<ComplejoDeportivo> complejos = new ArrayList<>();
        complejos.add(complejo1);
        complejos.add(complejo2);

        SedeOlimpiada sedeOlimpiada = new SedeOlimpiada(2, 1000000);
        sedeOlimpiada.getComplejosDeportivos().addAll(complejos);

        // Mostrar información de la sede de la olimpiada
        System.out.println("Número de complejos: " + sedeOlimpiada.getNumeroComplejos());
        System.out.println("Presupuesto: " + sedeOlimpiada.getPresupuesto());

        for (ComplejoDeportivo complejo : sedeOlimpiada.getComplejosDeportivos()) {
            System.out.println("\nComplejo Deportivo:");
            System.out.println("Área Ocupada: " + complejo.getAreaOcupada());
            System.out.println("Jefe de Organización: " + complejo.getJefeDeOrganizacion());
            System.out.println("Localización: " + complejo.getLocalizacion());
            System.out.println("Número de Áreas Designadas: " + complejo.getAreasDesignadas().size());

            for (Evento evento : complejo.getSerieDeEventos()) {
                System.out.println("\nEvento:");
                System.out.println("Duración: " + evento.getDuracion());
                System.out.println("Fecha: " + evento.getFecha());
                System.out.println("Material Necesario: " + evento.getMaterialNecesario());
                System.out.println("Número de Comisarios: " + evento.getNumeroComisarios());
                System.out.println("Número de Participantes: " + evento.getNumeroParticipantes());

                int comisarioIndex = 1;
                for (Comisario comisario : evento.getComisarios()) {
                    System.out.println("Comisario " + comisarioIndex + " asignado al evento.");
                    comisarioIndex++;
                }
            }
        }
    }
}
