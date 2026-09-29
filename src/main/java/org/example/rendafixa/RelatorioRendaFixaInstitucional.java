package org.example.rendafixa;

public class RelatorioRendaFixaInstitucional extends RelatorioRendaFixa {
    public RelatorioRendaFixaInstitucional(float custoDeProcessamento) {
        super(custoDeProcessamento);
    }

    public float calcularCusto() {
        return this.custoDeProcessamento + this.formatoExportacao.defineCusto();
    }

    public String emitir() {
        return "Relatório de Renda Fixa Institucional emitido";
    }
}