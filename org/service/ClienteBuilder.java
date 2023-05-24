package org.service;

public class ClienteBuilder {
    private  ClienteBuilder cliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public ClienteBuilder getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBuilder cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public ClienteBuilder() {
    }

    public ClienteBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public ClienteBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ClienteBuilder email(String email) {
        this.email = email;
        return this;
    }



    public ClienteBuilder build() {
        return new ClienteBuilder();
    }
    public void exibirDetalhes() {
        System.out.println("Cliente cadastrado com sucesso!");

    }
}


