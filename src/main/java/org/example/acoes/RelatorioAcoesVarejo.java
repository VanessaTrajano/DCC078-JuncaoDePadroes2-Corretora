package org.example.acoes;

public class RelatorioAcoesVarejo extends RelatorioAcoes {
    public RelatorioAcoesVarejo(float custoDeProcessamento) {
        super(custoDeProcessamento);
    }

    public float calcularCusto() {
        return this.custoDeProcessamento + this.formatoExportacao.defineCusto();
    }

    public String emitir() {
        return "Relatório de Ações Varejo emitido";
    }
}