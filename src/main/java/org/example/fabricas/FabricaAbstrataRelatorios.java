package org.example.fabricas;

import org.example.acoes.RelatorioAcoes;
import org.example.rendafixa.RelatorioRendaFixa;

public interface FabricaAbstrataRelatorios {
    RelatorioAcoes createRelatorioAcoes();
    RelatorioRendaFixa createRelatorioRendaFixa();
}
