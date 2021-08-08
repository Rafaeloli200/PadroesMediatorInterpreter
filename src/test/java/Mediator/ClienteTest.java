
package Mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ClienteTest {

    @Test
    void prestaQeuixaAtendimentoAoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de Atendimento ao cliente vai analisar a queixa e entrara em contato: Minha mala nao apareceu na esteira",
                cliente.prestarQueixa("Minha mala nao apareceu na esteira"));
    }

    @Test
    void reclamaAtendimentoAoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de Atendimento ao cliente vai encontrar formas de melhorar o serviço em questao: Atraso do aviao",
                cliente.prestarReclamacao("Atraso do aviao"));
    }

    @Test
    void sugestaoAtendimentoAoCliente() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de Atendimento ao cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de Atendimento ao cliente vai analisar a sugestao enviada: Comecar a embarcacao no aviao pelas pessoas idosas",
                cliente.apresentarSugestao("Comecar a embarcacao no aviao pelas pessoas idosas"));
    }

}