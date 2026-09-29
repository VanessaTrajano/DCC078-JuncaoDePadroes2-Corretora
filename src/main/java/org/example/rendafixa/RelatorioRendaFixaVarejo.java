package org.example.rendafixa;

public class RelatorioRendaFixaVarejo extends RelatorioRendaFixa {
    public RelatorioRendaFixaVarejo(float custoDeProcessamento) {
        super(custoDeProcessamento);
    }

    public float calcularCusto() {
        return this.custoDeProcessamento + this.formatoExportacao.defineCusto();
    }

    public String emitir() {
        return "Relatório de Renda Fixa Varejo emitido";
    }
}