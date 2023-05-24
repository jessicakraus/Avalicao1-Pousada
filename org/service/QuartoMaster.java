package org.service;

public class QuartoMaster extends Quarto {
    public QuartoMaster(int numero) {
        super(numero, "Master");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Quarto Master, número: " + getNumero());
    }
}
