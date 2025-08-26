package capitulo13.testeunitario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisaoTeste {

   @Test
    void testeDivisaoPorDouble(){
    double resultado = Divisao.dividir(10,10);

       Assertions.assertEquals(1, resultado);
    }
}
