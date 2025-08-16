package capitulo9.lab1;

public class Aluno extends Pessoa{


    public Aluno(String nome, int idade, char sexo, Rg rg) {
        super(nome, idade, sexo, rg);
    }

    @Override
    public String falar(String fala, String mostrarDados) {
        return null;
    }
}
