package Mediator;

public class Colaborador {

    public String reclamarRH(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoRH(mensagem);
    }

    public String sugerirRH(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoRH(mensagem);
    }

}
