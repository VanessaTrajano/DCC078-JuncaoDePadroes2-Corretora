import org.example.fabricas.FabricaAbstrataRelatorios;
import org.example.fabricas.GerenciadorDeFabricaRelatorios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorDeFabricaRelatoriosTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrataRelatorios fabrica = GerenciadorDeFabricaRelatorios.getInstance().obterFabrica("Judicial");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }
}