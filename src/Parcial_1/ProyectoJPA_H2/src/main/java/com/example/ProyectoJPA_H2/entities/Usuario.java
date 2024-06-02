package com.example.ProyectoJPA_H2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario extends Base{

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "auth_id")
    private String auth0Id;

    @Column(name = "user_name")
    private String userName;

    //Constructor

    public Usuario(){}
    public Usuario(Long id, String auth0Id, String userName) {
        this.id = id;
        this.auth0Id = auth0Id;
        this.userName = userName;
    }

    public Usuario(Long id, Long id1, String auth0Id, String userName) {
        super(id);
        this.id = id1;
        this.auth0Id = auth0Id;
        this.userName = userName;
    }

    //Getter y Setter

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
