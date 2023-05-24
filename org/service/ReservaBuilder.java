package org.service;

public class ReservaBuilder {
    private Quarto quarto;
    private String dataInicio;
    private String dataFim;

    private ReservaBuilder(Builder builder) {
        this.quarto = builder.quarto;
        this.dataInicio = builder.dataInicio;
        this.dataFim = builder.dataFim;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public static class Builder {
        private Quarto quarto;
        private String dataInicio;
        private String dataFim;

        public Builder quarto(Quarto quarto) {
            this.quarto = quarto;
            return this;
        }

        public Builder dataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
            return this;
        }

        public Builder dataFim(String dataFim) {
            this.dataFim = dataFim;
            return this;
        }

        public ReservaBuilder build() {
            return new ReservaBuilder(this);
        }

    }
    public void exibirDetalhes() {
        System.out.println("Reserva criada com sucesso!");

    }
}
