package org.example;


import org.example.acoes.RelatorioAcoes;
import org.example.fabricas.FabricaAbstrataRelatorios;
import org.example.rendafixa.RelatorioRendaFixa;

public class Corretora {
    private RelatorioAcoes relatorioAcoes;
    private RelatorioRendaFixa relatorioRendaFixa;

    public RelatorioRendaFixa getRelatorioRendaFixa() {
        return relatorioRendaFixa;
    }

    public RelatorioAcoes getRelatorioAcoes() {
        return relatorioAcoes;
    }

    public Corretora (FabricaAbstrataRelatorios fabrica) {
        this.relatorioAcoes = fabrica.createRelatorioAcoes();
        this.relatorioRendaFixa = fabrica.createRelatorioRendaFixa();
    }

    public String emitirRelatorioAcoes() {
        return this.relatorioAcoes.emitir();
    }

    public String emitirRelatorioRendaFixa() {
        return this.relatorioRendaFixa.emitir();
    }
}