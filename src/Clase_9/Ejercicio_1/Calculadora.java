package Clase_9.Ejercicio_1;

public class Calculadora<E extends Number> implements Operable<E> {

    //Constructor
    public Calculadora() {
    }

    @Override
    public E sumar(E a, E b) throws Exception{
        try {
            if (a instanceof Integer && b instanceof Integer) {
                return (E) Integer.valueOf(a.intValue() + b.intValue());
            } else if (a instanceof Double && b instanceof Double) {
                return (E) Double.valueOf(a.doubleValue() + b.doubleValue());
            } else if (a instanceof Float && b instanceof Float) {
                return (E) Float.valueOf(a.floatValue() + b.floatValue());
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return null;
    }

    @Override
    public E restar(E a, E b) throws Exception{
        try {
            if (a instanceof Integer && b instanceof Integer) {
                return (E) Integer.valueOf(a.intValue() -b.intValue());
            } else if (a instanceof Double && b instanceof Double) {
                return (E) Double.valueOf(a.doubleValue() - b.doubleValue());
            } else if (a instanceof Float && b instanceof Float) {
                return (E) Float.valueOf(a.floatValue() - b.floatValue());
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return null;
    }

    @Override
    public E multiplicar(E a, E b) throws Exception{
        try {
            if (a instanceof Integer && b instanceof Integer) {
                return (E) Integer.valueOf(a.intValue() * b.intValue());
            } else if (a instanceof Double && b instanceof Double) {
                return (E) Double.valueOf(a.doubleValue() * b.doubleValue());
            } else if (a instanceof Float && b instanceof Float) {
                return (E) Float.valueOf(a.floatValue() * b.floatValue());
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return null;
    }

    @Override
    public E dividir(E a, E b) throws Exception{
        try {
            if (a instanceof Integer && b instanceof Integer) {
                return (E) Integer.valueOf(a.intValue() / b.intValue());
            } else if (a instanceof Double && b instanceof Double) {
                return (E) Double.valueOf(a.doubleValue() / b.doubleValue());
            } else if (a instanceof Float && b instanceof Float) {
                return (E) Float.valueOf(a.floatValue() / b.floatValue());
            }
        }catch (Exception e){
            throw new Exception("No se puede dividir por cero");
        }
        return null;
    }
}
