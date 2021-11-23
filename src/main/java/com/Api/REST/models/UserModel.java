package com.Api.REST.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String name;
    private String email;
    private int propiedades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(int propiedades) {
        this.propiedades = propiedades;
    }
}
