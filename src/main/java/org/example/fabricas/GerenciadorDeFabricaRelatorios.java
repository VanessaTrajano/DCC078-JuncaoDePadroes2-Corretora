package org.example.fabricas;

public class GerenciadorDeFabricaRelatorios {
    private GerenciadorDeFabricaRelatorios() {};
    private static GerenciadorDeFabricaRelatorios instance = new GerenciadorDeFabricaRelatorios();
    public static GerenciadorDeFabricaRelatorios getInstance() {
        return instance;
    }
    public FabricaAbstrataRelatorios obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.fabricas.FabricaRelatorios" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrataRelatorios)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrataRelatorios) objeto;
    }
}