package org.service;

public class QuartoDeluxe extends Quarto {
    public QuartoDeluxe(int numero) {
        super(numero, "QuartoDeluxe");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Quarto de QuartoDeluxe, número: " + getNumero());

    }
}
