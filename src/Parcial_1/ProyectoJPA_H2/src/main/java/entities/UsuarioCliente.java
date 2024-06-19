package entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario_cliente")
public class UsuarioCliente {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "autho_id")
    private String authOId;

    @Column(name = "username")
    private String username;

    @OneToOne(mappedBy = "usuarioCliente")
    private Cliente cliente;

    //Constructor
    public UsuarioCliente(){}

    public UsuarioCliente( String authOId, String username, Cliente cliente) {
        this.authOId = authOId;
        this.username = username;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}