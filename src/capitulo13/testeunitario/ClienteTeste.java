package capitulo13.testeunitario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTeste {

    private String nome;
    private int idade;
    private Cliente cliente;

    //@BeforeEach ele prepara seu testes

    @BeforeEach
    void setUP(){

        System.out.println("vou rodar todas as vezes");
        this.nome = "joao";
        this.idade = 26;
        this.cliente = new Cliente(nome,idade);
        System.out.println(cliente.toString());
    }

     @Test
    void testeINstanciaCliente(){



         Assertions.assertNotNull(this.cliente);


    }
    @Test
    void TesteClienteNulo(){
         Cliente cliente = null;

         Assertions.assertNull(cliente);

    }

    @Test
    void testeMetodosGet(){


         Assertions.assertEquals(nome,cliente.getNome());
        Assertions.assertEquals(idade,cliente.getIdade());


    }

    @Test
    void testesMetodosSet(){

        String nome = "Joao";
        int idade = 26;


        cliente.setNome(nome);
        cliente.setIdade(26);

        Assertions.assertEquals(nome,cliente.getNome());
        Assertions.assertEquals(idade,cliente.getIdade());


    }
}
