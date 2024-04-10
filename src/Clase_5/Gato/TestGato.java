package Gato;

public class TestGato {
    /**
     * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
     * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
     * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
     * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
     * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
     * programa desde el que se pruebe el método.
     *
         */


        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Gato Garfield = new Gato("macho");
            Gato Tom = new Gato("macho");
            Gato Vanesa = new Gato("hembra");
            Gato Pixy = new Gato("hembra");

            try {
                System.out.println(Garfield.apareaCon(Vanesa));
                System.out.println(Garfield.apareaCon(Tom));
                System.out.println(Pixy.apareaCon(Vanesa));

            } catch (ApareamientoNoPosibleException e) {
                System.err.println(e.getMessage());
            }

        }

    }

