package entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario_empleado")
public class UsuarioEmpleado {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "autho_id")
    private String authOId;

    @Column(name = "username")
    private String username;

    @OneToOne(mappedBy = "usuarioEmpleado")
    private Empleado empleado;

    //Constructor
    public UsuarioEmpleado(){}

    public UsuarioEmpleado(String authOId, String username, Empleado empleado) {
        this.authOId = authOId;
        this.username = username;
        this.empleado = empleado;
    }

    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthOId() {
        return authOId;
    }

    public void setAuthOId(String authOId) {
        this.authOId = authOId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}