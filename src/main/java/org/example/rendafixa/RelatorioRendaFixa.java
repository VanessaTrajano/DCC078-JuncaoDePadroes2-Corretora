package org.example.rendafixa;

import org.example.formato.FormatoExportacao;

public abstract class RelatorioRendaFixa {
    protected FormatoExportacao formatoExportacao;

    protected float custoDeProcessamento;

    public RelatorioRendaFixa(float custoDeProcessamento) {
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