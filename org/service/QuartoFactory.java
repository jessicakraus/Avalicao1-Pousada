package org.service;

public class QuartoFactory {
    public static Quarto criarQuarto(String tipo, int numero) {
        if (tipo.equalsIgnoreCase("Deluxe")) {
            return new QuartoDeluxe(numero);
        } else if (tipo.equalsIgnoreCase("Master")) {
            return new QuartoMaster(numero);
        } else if (tipo.equalsIgnoreCase("Standard")) {
            return new QuartoMaster(numero);
        } else {
            throw new IllegalArgumentException("Tipo de quarto inválido.");
        }
    }
}
