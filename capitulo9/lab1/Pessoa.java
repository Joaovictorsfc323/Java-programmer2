package capitulo9.lab1;

public abstract class Pessoa {

    String nome;
    int idade;
    char sexo;
    Rg rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Rg getRg() {
        return rg;
    }

    public void setRg(Rg rg) {
        this.rg = rg;
    }

    public Pessoa(String nome, int idade, char sexo, Rg rg) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = rg;
    }

    public abstract String falar(String fala, String mostrarDados);



}
