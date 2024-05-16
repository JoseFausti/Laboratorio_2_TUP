package Clase_9.Ejercicio_1;

public interface Operable <E>{
    E sumar(E numero1,E numero2)throws Exception;
    E restar(E numero1,E numero2)throws Exception;
    E multiplicar(E numero1,E numero2)throws Exception;
    E dividir(E numero1,E numero2) throws Exception;
}
