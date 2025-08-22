package capitulo13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteNumerosDaMegaSena {

    @Test
    void testeNumeroMegaSena(){
        int numero = NumerosDaMegaSena.sortearNumeroMegaSena();
        System.out.println(numero);
        Assertions.assertTrue(numero >0 && numero <= 60);

    }

    @Test
    void validaJogoDaMegaSena(){
// int[] resultado = NumerosDaMegaSena.jogoMegaSena();
//
// for (int numero : resultado){
//
//     Assertions.assertEquals(6, resultado.length, "resultado" );
//
//     System.out.println(numero);
// }

        int[]jogoMegaSena = NumerosDaMegaSena.jogoMegaSena();
   for(int numeroSorteado: jogoMegaSena){
       System.out.println("Valor do numero:" + numeroSorteado);
       Assertions.assertTrue(numeroSorteado >0 && numeroSorteado <= 60);

   }

    }
}
