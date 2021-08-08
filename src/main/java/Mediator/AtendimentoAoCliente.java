package Mediator;

public class AtendimentoAoCliente implements Setor {

    private static AtendimentoAoCliente instancia = new AtendimentoAoCliente();

    private AtendimentoAoCliente() {
    }

    public static AtendimentoAoCliente getInstancia() {
        return instancia;
    }

    public String receberQueixa(String mensagem) {
        return "A central de Atendimento ao cliente vai analisar a queixa e entrara em contato: " + mensagem;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "A central de Atendimento ao cliente vai encontrar formas de melhorar o serviço em questao: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "A central de Atendimento ao cliente vai analisar a sugestao enviada: " + mensagem;
    }

}
