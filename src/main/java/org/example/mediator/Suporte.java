package org.example.mediator;

public class Suporte {
    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberElogioRiot(String mensagem) {
        return "O Suporte agradece seu contato.\n"+
                "A Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RiotGames.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRiot(String mensagem) {
        return "O Suporte agradece seu contato.\n"+
                "A Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RiotGames.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRiot(String mensagem) {
        return "O Suporte agradece seu contato.\n"+
                "A Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RiotGames.getInstancia().receberSugestao(mensagem);
    }
}
