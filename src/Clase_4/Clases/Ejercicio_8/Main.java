package Clase_4.Clases.Ejercicio_8;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Creación de instancias para Avion
        Persona propietarioAvion = new Persona("DirecciónPropietario", "Propietario", "123456789", "123456789");
        TipoAvion tipoAvion = new TipoAvion(200, new String[]{"Modelo1", "Modelo2"}, 500.0);
        Hangar hangarAvion = new Hangar(100, 1, "UbicacionHangar");
        Map<Date, Servicio> serviciosAvion = new HashMap<>();
        Avion avion = new Avion(propietarioAvion, "Matricula123", tipoAvion, new Date(), hangarAvion, serviciosAvion);

        // Creación de instancias para Hangar
        Hangar hangar = new Hangar(150, 2, "OtraUbicacion");

        // Creación de instancias para Mecanico
        Set<TipoAvion> tiposAvionAutorizadosMecanico = new HashSet<>();
        tiposAvionAutorizadosMecanico.add(tipoAvion);
        Mecanico mecanico = new Mecanico(2000.0, tiposAvionAutorizadosMecanico, "Mañana");

        // Creación de instancias para Persona
        Persona persona = new Persona("OtraDirección", "OtroNombre", "987654321", "987654321");

        // Creación de instancias para Piloto
        Set<TipoAvion> tiposAvionAutorizadosPiloto = new HashSet<>();
        tiposAvionAutorizadosPiloto.add(tipoAvion);
        Piloto piloto = new Piloto("Licencia123", "SinRestricciones", tiposAvionAutorizadosPiloto);

        // Realizar servicios en el avión
        Date fecha1 = new Date(); // Primera fecha
        avion.realizarServicio(new String[]{"Reparación", "Mantenimiento"}, 5, fecha1);

        Date fecha2 = new Date(System.currentTimeMillis() + 3600 * 1000); // Segunda fecha (una hora después)
        avion.realizarServicio(new String[]{"Revisión", "Limpieza"}, 3, fecha2);

        // Agregar el avión al aeródromo
        Aerodromo aerodromo = new Aerodromo(new Avion[]{avion}, new Hangar[]{hangar}, new Mecanico[]{mecanico}, new Persona[]{persona}, new Piloto[]{piloto});

        // Agregar más elementos al aeródromo
        Date fecha3 = new Date(System.currentTimeMillis() + 2 * 3600 * 1000); // Tercera fecha (dos horas después)
        aerodromo.agregarAvion(new Avion(propietarioAvion, "Matricula456", tipoAvion, fecha3, hangarAvion, serviciosAvion));
        aerodromo.agregarHangar(new Hangar(200, 3, "OtraUbicacion"));
        aerodromo.agregarMecanico(new Mecanico(2500.0, tiposAvionAutorizadosMecanico, "Tarde"));
        aerodromo.agregarPersona(new Persona("Dirección2", "Nombre2", "987654321", "987654321"));
        aerodromo.agregarPiloto(new Piloto("Licencia456", "Restricciones", tiposAvionAutorizadosPiloto));
    }
}
