package org.example.mediator;

public class RiotGames implements Ticket {
    private static RiotGames instancia = new RiotGames();

    private RiotGames() {}

    public static RiotGames getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "A Riot Games agradece a mensagem: " + mensagem;
    }

    public String receberReclamacao(String mensagem) {
        return "A Riot Games vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Riot Games vai analisar a sugestão: " + mensagem;
    }
}
