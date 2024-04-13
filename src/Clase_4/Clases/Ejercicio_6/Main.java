package Clase_4.Clases.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de instancias de todas las clases
        List<Especie> especiesArea = new ArrayList<>();
        List<Habitacion> habitacionesAlojamiento = new ArrayList<>();
        List<Excursion> excursionesAlojamiento = new ArrayList<>();
        List<Guardia> guardiasArea = new ArrayList<>();
        List<Especie> alimentos = new ArrayList<>();
        List<Celador> celadoresEntrada = new ArrayList<>();
        List<Personal> personalParque = new ArrayList<>();
        List<PersonaVisitante> visitantesParque = new ArrayList<>();
        List<Area> areasParque = new ArrayList<>();
        List<Alojamiento> alojamientosParque = new ArrayList<>();
        List<Entrada> entradasParque = new ArrayList<>();
        List<Organismo> organismosComunidad = new ArrayList<>();
        List<Parque> parquesComunidad = new ArrayList<>();
        List<Proyecto> proyectosInvestigador = new ArrayList<>();
        List<Especie> especiesProyecto = new ArrayList<>();
        List<Guardia> guardiasVehiculo = new ArrayList<>();

        Area area = new Area("Selva");
        Especie especie = new Especie("Tigre", "Panthera tigris", 50, tipoEspecie.ANIMAL);
        Habitacion habitacion = new Habitacion("101");
        Excursion excursion = new Excursion("EXC-001", "01/04/2024", "10:00");
        Guardia guardia = new Guardia("Calle Principal", "12345678A", new Entrada("01/04/2024"), "123456789", "John Doe", 1500.0f, "987654321", List.of(tipoPersonal.GUARDA), "Guardia 1", new Vehiculo("1234ABC", "Patrulla"));
        Especie alimento = new Especie("Plátano", "Musa", 100, tipoEspecie.VEGETAL);
        Celador celador = new Celador("Calle Secundaria", "98765432B", new Entrada("01/04/2024"), "987654321", "Jane Smith", 1200.0f, "123456789", List.of(tipoPersonal.CELADOR), "Celador 1");
        Personal personal = new Personal("Calle Principal", "87654321C", new Entrada("01/04/2024"), "987654321", "James Johnson", 2000.0f, "123456789", List.of(tipoPersonal.INVESTIGADOR));
        PersonaVisitante visitante = new PersonaVisitante("Alice Brown", "56789012D", "Calle Visitante 1", "Biologist");
        Parque parque = new Parque("Parque Nacional", "01/01/2024", 1000.0f, areasParque, alojamientosParque, entradasParque);
        Organismo organismo = Organismo.NACIONAL;
        Proyecto proyecto = new Proyecto("Estudio de biodiversidad en el parque");
        Especie especieProyecto = new Especie("Orquídea", "Orchidaceae", 200, tipoEspecie.VEGETAL);
        Vehiculo vehiculo = new Vehiculo("5678DEF", "Transporte");

        // Agregar instancias a listas según corresponda
        especiesArea.add(especie);
        habitacionesAlojamiento.add(habitacion);
        excursionesAlojamiento.add(excursion);
        guardiasArea.add(guardia);
        alimentos.add(alimento);
        celadoresEntrada.add(celador);
        personalParque.add(personal);
        visitantesParque.add(visitante);
        areasParque.add(area);
        alojamientosParque.add(new Alojamiento("Hotel", 100, "5 Estrellas", "01/04/2024", habitacionesAlojamiento, excursionesAlojamiento));
        entradasParque.add(new Entrada("01/04/2024"));
        organismosComunidad.add(organismo);
        parquesComunidad.add(parque);
        proyectosInvestigador.add(proyecto);
        especiesProyecto.add(especieProyecto);
        guardiasVehiculo.add(guardia);

        // Agregar instancias a otras instancias según corresponda
        area.setEspecies(especiesArea);
        area.setGuardias(guardiasArea);
        alojamientosParque.get(0).getExcursiones().get(0).setPersonas(visitantesParque);
        alojamientosParque.get(0).getExcursiones().get(0).setCodigo("EXC-002");
        guardia.getVehiculo().setGuardiasAsignados(guardiasVehiculo);
        proyecto.setEspeciesInvestigadas(especiesProyecto);

        // Mostrar resultados por pantalla
        System.out.println("Parque: " + parque.getNombre());
        System.out.println("Área del parque: " + area.getNombre());
        System.out.println("Especies en el área: " + area.getEspecies().size());
        System.out.println("Guardias en el área: " + area.getGuardias().size());
        System.out.println("Número de habitaciones en el alojamiento: " + alojamientosParque.get(0).getHabitaciones().size());
        System.out.println("Número de excursiones en el alojamiento: " + alojamientosParque.get(0).getExcursiones().size());
        System.out.println("Número de visitantes en la excursión: " + alojamientosParque.get(0).getExcursiones().get(0).getPersonas().size());
        System.out.println("Nombre del primer visitante: " + alojamientosParque.get(0).getExcursiones().get(0).getPersonas().get(0).getNombre());
        System.out.println("Nombre del vehículo asignado al guardia: " + guardia.getVehiculo().getMatricula());
        System.out.println("Número de especies investigadas en el proyecto: " + proyecto.getEspeciesInvestigadas().size());
    }
}
