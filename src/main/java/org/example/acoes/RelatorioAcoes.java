package org.example.acoes;

import org.example.formato.FormatoExportacao;

public abstract class RelatorioAcoes {
    protected FormatoExportacao formatoExportacao;

    protected float custoDeProcessamento;

    public RelatorioAcoes(float custoDeProcessamento) {
        this.custoDeProcessamento = custoDeProcessamento;
    }

    public void setFormatoExportacao(FormatoExportacao formatoExportacao) {
        this.formatoExportacao = formatoExportacao;
    }

    public void setCustoDeProcessamento(float custoDeProcessamento) {
        this.custoDeProcessamento = custoDeProcessamento;
    }

    public abstract float calcularCusto();

    public abstract String emitir();
}