package Mediator;

public class RecursosHumanos implements Setor {

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {
    }

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "O recursos humanos vai encontrar formas de resolver o problema em questao: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "O recursos humanos vai analisar a sugestao enviada: " + mensagem;
    }

}
