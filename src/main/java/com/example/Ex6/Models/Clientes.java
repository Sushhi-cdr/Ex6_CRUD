package com.example.Ex6.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeClientes")
    private String nomeClientes;

    @Column(name = "emailClientes")
    private String emailClientes;

    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeClientes() {
        return nomeClientes;
    }

    public void setNomeClientes(String nomeClientes) {
        this.nomeClientes = nomeClientes;
    }

    public String getEmailClientes() {
        return emailClientes;
    }

    public void setEmailClientes(String emailClientes) {
        this.emailClientes = emailClientes;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
