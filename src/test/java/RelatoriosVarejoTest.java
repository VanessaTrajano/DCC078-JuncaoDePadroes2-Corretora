import org.example.Corretora;
import org.example.fabricas.*;
import org.example.formato.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelatoriosVarejoTest {
    static Corretora varejo;

    @BeforeAll
    static void inicia(){
        FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Varejo");
        varejo = new Corretora(fabrica);
    }

    @Test
    void deveRetornarCustoAcoesFormatoJSON() {
        FormatoExportacao formatoExportacao = new FormatoJSON();
        varejo.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(20, varejo.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoAcoesFormatoExcel() {
        FormatoExportacao formatoExportacao = new FormatoExcel();
        varejo.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(25, varejo.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoAcoesFormatoPDF() {
        FormatoExportacao formatoExportacao = new FormatoPDF();
        varejo.getRelatorioAcoes().setFormatoExportacao(formatoExportacao);
        assertEquals(35, varejo.getRelatorioAcoes().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoJSON() {
        FormatoExportacao formatoExportacao = new FormatoJSON();
        varejo.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(10, varejo.getRelatorioRendaFixa().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoExcel() {
        FormatoExportacao formatoExportacao = new FormatoExcel();
        varejo.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(15, varejo.getRelatorioRendaFixa().calcularCusto());
    }

    @Test
    void deveRetornarCustoRendaFixaFormatoPDF() {
        FormatoExportacao formatoExportacao = new FormatoPDF();
        varejo.getRelatorioRendaFixa().setFormatoExportacao(formatoExportacao);
        assertEquals(25, varejo.getRelatorioRendaFixa().calcularCusto());
    }
}