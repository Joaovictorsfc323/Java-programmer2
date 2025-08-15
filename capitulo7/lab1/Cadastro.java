package capitulo7.lab1;

public class Cadastro {

    private String nome;
    private String sobrenome;
    private int idade;

    public Cadastro() {

    }

    Cadastro(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }



    Cadastro(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

    }

    public void mostrar(){

        System.out.println("nome:"  + nome);
        System.out.println("sobrenome:"  + sobrenome);
        System.out.println("idade:"  + idade);
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
