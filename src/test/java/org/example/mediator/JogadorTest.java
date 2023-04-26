package org.example.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void deveElogiarRiot() {
        Jogador jogador = new Jogador();
        assertEquals("O Suporte agradece seu contato.\nA Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Riot Games agradece a mensagem: Excelente atendimento",
                jogador.elogiarRiot("Excelente atendimento"));
    }

    @Test
    void deveReclamarRiot() {
        Jogador jogador = new Jogador();
        assertEquals("O Suporte agradece seu contato.\nA Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Riot Games vai procurar melhorar o serviço da reclamação: Client muito lento",
                        jogador.reclamarRiot("Client muito lento"));
    }

    @Test
    void deveSugerirRiot() {
        Jogador jogador = new Jogador();
        assertEquals("O Suporte agradece seu contato.\nA Riot Games respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Riot Games vai analisar a sugestão: Balancear os campeões direito",
                        jogador.sugerirRiot("Balancear os campeões direito"));
    }
}