package capitulo6.lab3;

public class Aluno {

   public static int contadorDeAluno;
    private String nome;


    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void imprimir(){
        System.out.println("nome:" + nome);
        System.out.println("contadorDeAluno:" + contadorDeAluno);
        System.out.println();

    }


}
