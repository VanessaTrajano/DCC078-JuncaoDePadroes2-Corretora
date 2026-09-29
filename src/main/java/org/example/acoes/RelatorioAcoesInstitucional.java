package org.example.acoes;

public class RelatorioAcoesInstitucional extends RelatorioAcoes {
    public RelatorioAcoesInstitucional(float custoDeProcessamento) {
        super(custoDeProcessamento);
    }

    public float calcularCusto() {
        return this.custoDeProcessamento + this.formatoExportacao.defineCusto();
    }

    public String emitir() {
        return "Relatório de Ações Institucional emitido";
    }
}