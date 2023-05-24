package org.service;

import java.util.ArrayList;
import java.util.List;

public class Pousada {
        private List<ClienteBuilder> clientes;
        private static Pousada instancia; // Instância única da pousada

        // Construtor privado para evitar instanciação direta
        private Pousada() {
            this.clientes = new ArrayList<>();
        }

        // Método estático para obter a instância da pousada
        public static Pousada getInstance() {
            if (instancia == null) {
                instancia = new Pousada();
            }
            return instancia;
        }
}
