package org.example.mediator;

public class Pessoa {
    public String elogiarRiot(String mensagem) {
        return Suporte.getInstancia().receberElogioRiot(mensagem);
    }

    public String reclamarRiot(String mensagem) {
        return Suporte.getInstancia().receberReclamacaoRiot(mensagem);
    }

    public String sugerirRiot(String mensagem) {
        return Suporte.getInstancia().receberSugestaoRiot(mensagem);
    }
}
