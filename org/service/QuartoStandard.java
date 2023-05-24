package org.service;

public class QuartoStandard extends Quarto {
    public QuartoStandard(int numero) {
        super(numero, "Standard");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Quarto Standard, número: " + getNumero());
    }
}
