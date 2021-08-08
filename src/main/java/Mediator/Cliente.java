package Mediator;

public class Cliente {

    public String prestarQueixa(String mensagem) {
        return Ouvidoria.getInstancia().receberQueixaAAC(mensagem);
    }

    public String prestarReclamacao(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoAAC(mensagem);
    }

    public String apresentarSugestao(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoAAC(mensagem);
    }

}
