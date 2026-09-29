package org.example.fabricas;

import org.example.acoes.RelatorioAcoes;
import org.example.acoes.RelatorioAcoesInstitucional;
import org.example.rendafixa.RelatorioRendaFixa;
import org.example.rendafixa.RelatorioRendaFixaInstitucional;

public class FabricaRelatoriosInstitucional implements FabricaAbstrataRelatorios{
    @Override
    public RelatorioAcoes createRelatorioAcoes() {
        return new RelatorioAcoesInstitucional(30);
    }

    @Override
    public RelatorioRendaFixa createRelatorioRendaFixa() {
        return new RelatorioRendaFixaInstitucional(20);
    }
}