package Clase_1.Pto_1;

public class Piloto extends Persona implements Volador{
    // Atributos privados
    private int idPiloto;
    protected String empresaTrabajo;

    // Constructor
    public Piloto(int id, int dni, String nombreCompleto, int idPiloto, String empresaTrabajo) {
        super(id, dni, nombreCompleto);
        this.idPiloto = idPiloto;
        this.empresaTrabajo = empresaTrabajo;
    }

    // Getter para idPiloto
    public int getIdPiloto() {
        return idPiloto;
    }

    // Setter para idPiloto
    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    // Getter para empresaTrabajo
    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    // Setter para empresaTrabajo
    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

    // Método para imprimir la información del piloto
    @Override
    public void Informacion() {
        System.out.println("ID del piloto: " + idPiloto);
        System.out.println("Empresa de trabajo: " + empresaTrabajo);
    }
}
