package capitulo11;

public interface Soma {



    static int somar(int valor1, int valor2){
        if(valor1 <0 || valor2 <0){

            //throw ele lança a exceções dando uma instancia de outra class RuntimeException
            throw new RuntimeException("Não deve ser informado numeros negativos");
        }

        return valor1 + valor2;


    }

    //tratativa de uma exception especifica
    static long somar(long valor1, long valor2){
        if(valor1 <0 || valor2 <0){

            //throw ele lança a exceções dando uma instancia de outra class RuntimeException
            throw new SomarNumeroNegativosException("Não deve ser informado numeros negativos");
        }

        return valor1 + valor2;


    }
}
