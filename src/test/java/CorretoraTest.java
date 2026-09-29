import org.example.*;
import org.example.fabricas.FabricaAbstrataRelatorios;
import org.example.fabricas.GerenciadorDeFabricaRelatorios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorretoraTest {
    @Test
    void deveEmitirRendaFixaVarejo() {
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Varejo");
        Corretora corretora = new Corretora(fabrica);
        assertEquals("Relatório de Renda Fixa Varejo emitido", corretora.emitirRelatorioRendaFixa());
    }

    @Test
    void deveEmitirRendaFixaInstitucional() {
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Institucional");
        Corretora corretora = new Corretora(fabrica);
        assertEquals("Relatório de Renda Fixa Institucional emitido", corretora.emitirRelatorioRendaFixa());
    }

    @Test
    void deveEmitirAcoesVarejo() {
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Varejo");
        Corretora corretora = new Corretora(fabrica);
        assertEquals("Relatório de Ações Varejo emitido", corretora.emitirRelatorioAcoes());
    }

    @Test
    void deveEmitirAcoesInstitucional() {
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Institucional");
        Corretora corretora = new Corretora(fabrica);
        assertEquals("Relatório de Ações Institucional emitido", corretora.emitirRelatorioAcoes());
    }
}