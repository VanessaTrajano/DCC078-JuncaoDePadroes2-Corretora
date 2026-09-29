import org.example.Corretora;
import org.example.fabricas.*;
import org.example.formato.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelatoriosInstitucionalTest {
    static Corretora institucional;

    @BeforeAll
    static void inicia(){
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Institucional");
        institucional = new Corretora(fabrica);
    }

    @Test
    void deveRetornarCustoAcoesFormatoJSON() {
        FormatoExportacao formatoExportacao = new FormatoJSON();
        institucional.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(30, institucional.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoAcoesFormatoExcel() {
        FormatoExportacao formatoExportacao = new FormatoExcel();
        institucional.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(35, institucional.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoAcoesFormatoPDF() {
        FormatoExportacao formatoExportacao = new FormatoPDF();
        institucional.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(45, institucional.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoJSON() {
        FormatoExportacao formatoExportacao = new FormatoJSON();
        institucional.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(20, institucional.getRelatorioRendaFixa().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoExcel() {
        FormatoExportacao formatoExportacao = new FormatoExcel();
        institucional.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(25, institucional.getRelatorioRendaFixa().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoPDF() {
        FormatoExportacao formatoExportacao = new FormatoPDF();
        institucional.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(35, institucional.getRelatorioRendaFixa().calcularCusto());
    }
}