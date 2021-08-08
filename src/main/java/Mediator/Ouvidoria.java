package Mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {
    }

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberQueixaAAC(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"
                + "A central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>" + AtendimentoAoCliente.getInstancia().receberQueixa(mensagem);
    }

    public String receberReclamacaoAAC(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"
                + "A central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>" + AtendimentoAoCliente.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAAC(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"
                + "A central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>" + AtendimentoAoCliente.getInstancia().receberSugestao(mensagem);
    }

    public String receberReclamacaoRH(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"
                + "O recursos humanos respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>" + RecursosHumanos.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRH(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"
                + "O recursos humanos respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>" + RecursosHumanos.getInstancia().receberSugestao(mensagem);
    }
}
