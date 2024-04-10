package Gato;

public class Gato {
    // atributos de gato
       private String color; // no lo necesitamos para probar las excepciones

    private String raza; // no lo necesitamos para probar las excepciones
    private String sexo;

    /**
     * Constructor de la clase Gato
     *
     * @param s
     *          sexo
     */
    public Gato(String s) {
        this.sexo = s;
    }

    /**
     * método para la clase gato que hace maullar al gato
     */
    public void maulla() {


        System.out.println("Miauuuu");
    }

    /**
     * método que genera otro objeto Gato a partir de dos objetos Gato
     * (apareamiento)
     *
     * @param pareja
     * @return nuevo objeto de Gato
     * @throws ApareamientoNoPosibleException
     */
    public Gato apareaCon(Gato pareja) throws ApareamientoNoPosibleException {

        if (this.sexo.equals(pareja.sexo)) {
            throw new ApareamientoNoPosibleException("No es posible ya que son dos gatos del mismo sexo.");
        }else{
            System.out.println("Se produjo el apareamiento");
        }

        String hijo = (int) (Math.random() * 2) == 0 ? "hembra" : "macho";
        return new Gato(hijo);
    }

    /**
     * método toString, devuelve el estado del objeto Gato
     */
    @Override
    public String toString() {
        return "Hijo [sexo = " + sexo + "]\n";
    }
}
