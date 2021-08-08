package Mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorTest {

    @Test
    void reclamaRecursosHumanos() {
        Colaborador colaborador = new Colaborador();
        assertEquals("A Ouvidoria agradece seu contato.\nO recursos humanos respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>O recursos humanos vai encontrar formas de resolver o problema em questao: Estou tendo que trabalhar horas extras nao remuneradas",
                colaborador.reclamarRH("Estou tendo que trabalhar horas extras nao remuneradas"));
    }

    @Test
    void sugestaoRecursosHumanos() {
        Colaborador colaborador = new Colaborador();
        assertEquals("A Ouvidoria agradece seu contato.\nO recursos humanos respondeu sua demanda conforme mensagem a seguir.\n"
                + ">>O recursos humanos vai analisar a sugestao enviada: Aumentar salario dos funcionarios",
                colaborador.sugerirRH("Aumentar salario dos funcionarios"));
    }

}
