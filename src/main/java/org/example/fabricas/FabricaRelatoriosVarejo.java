package org.example.fabricas;

import org.example.acoes.RelatorioAcoes;
import org.example.acoes.RelatorioAcoesVarejo;
import org.example.rendafixa.RelatorioRendaFixa;
import org.example.rendafixa.RelatorioRendaFixaVarejo;

public class FabricaRelatoriosVarejo implements FabricaAbstrataRelatorios{
    @Override
    public RelatorioRendaFixa createRelatorioRendaFixa() {
        return new RelatorioRendaFixaVarejo(10);
    }

    @Override
    public RelatorioAcoes createRelatorioAcoes() {
        return new RelatorioAcoesVarejo(20);
    }
}
