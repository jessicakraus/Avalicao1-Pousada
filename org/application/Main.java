package org.application;


import org.service.*;

public class Main {
    public static void main(String[] args) {
        Quarto quartoDeluxe = QuartoFactory.criarQuarto("Deluxe", 2);
        quartoDeluxe.exibirDetalhes();
        ReservaBuilder reservaBuilder = new ReservaBuilder.Builder()
                    .quarto(quartoDeluxe)
                    .dataInicio("2023-05-25")
                    .dataFim("2023-05-30")
                    .build();

        reservaBuilder.exibirDetalhes();

        ClienteBuilder cliente = new ClienteBuilder()
                .nome("João")
                .cpf("123456789")
                .telefone("999999999")
                .email("joao@example.com")
                .build();
        cliente.exibirDetalhes();



    }
}