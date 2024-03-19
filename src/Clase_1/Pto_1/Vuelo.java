package Clase_1.Pto_1;

public class Vuelo {
    private String empresa;
    private String fechaVuelo;
    private Avion avion; // Relacion de Asociacion de la Clase Clase_1.Pto_1.Avion en la Clase Clase_1.Pto_1.Vuelo

    public Vuelo(Avion avion1, String empresa, String fechaVuelo){
        this.avion = avion1;
        this.empresa = empresa;
        this.fechaVuelo = fechaVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setEmpresa(Avion avion) {
        this.avion = avion;
    }
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    // Método para imprimir la información del vuelo
    public void Informacion() {
        System.out.println("Información del vuelo:");
        System.out.println("Empresa: " + empresa);
        System.out.println("Fecha de vuelo: " + fechaVuelo);
    }
}
