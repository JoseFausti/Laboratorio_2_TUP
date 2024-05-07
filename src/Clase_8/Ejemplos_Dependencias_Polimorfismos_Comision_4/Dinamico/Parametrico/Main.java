package Clase_8.Ejemplos_Dependencias_Polimorfismos_Comision_4.Dinamico.Parametrico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Parametrico> personas = new ArrayList<>();
        ArrayList<Integer>  numeros = new ArrayList<>();



        Parametrico p1 = new Parametrico("parametro1");

        personas.add(p1);

        numeros.add(1);
    }
}
