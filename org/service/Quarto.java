package org.service;

import java.util.Date;
public abstract class Quarto {
    private int numero;
    private String tipo;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void exibirDetalhes();
}

