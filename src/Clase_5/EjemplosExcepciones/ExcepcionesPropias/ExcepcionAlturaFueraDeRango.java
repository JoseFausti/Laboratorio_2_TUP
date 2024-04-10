package Excepciones1.ExcepcionesPropias;

public class ExcepcionAlturaFueraDeRango extends Exception {
  public ExcepcionAlturaFueraDeRango() {
    System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera del rango permitido.");
  }
}
