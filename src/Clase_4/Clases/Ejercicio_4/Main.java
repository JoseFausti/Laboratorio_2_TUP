package Clase_4.Clases.Ejercicio_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear minerales
        Mineral mineral1 = new Mineral("Hierro", TipoMineral.primario);
        Mineral mineral2 = new Mineral("Calcio", TipoMineral.secundario);

        // Crear cereales
        Cereal cereal1 = new Cereal("Trigo", TipoCereal.cosechaFina);
        Cereal cereal2 = new Cereal("Maíz", TipoCereal.cosechaGruesa);

        // Crear lotes
        Lote lote1 = new Lote(List.of(mineral1), TipoLote.especial);//1º Forma de crear la lista con elementos ya asignados
        Lote lote2 = new Lote(Arrays.asList(mineral2), TipoLote.comun);//2º Forma de crear la lista con elementos ya asignados, ya que es de tipo ArrayList

        // Agregar cereales a los lotes
        lote1.getCereales().add(cereal1);
        lote2.getCereales().add(cereal2);

        // Crear agricultores
        Agricultor agricultor1 = new Agricultor(1, "Juan");
        Agricultor agricultor2 = new Agricultor(2, "María");

        // Agregar lotes a los agricultores
        agricultor1.getLotes().add(lote1);
        agricultor2.getLotes().add(lote2);

        // Crear cooperativa
        Cooperativa cooperativa = new Cooperativa();

        // Agregar agricultores a la cooperativa
        cooperativa.getAgricultores().add(agricultor1);
        cooperativa.getAgricultores().add(agricultor2);
    }
}
