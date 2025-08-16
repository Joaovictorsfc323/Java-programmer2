package capitulo9.lab1;

public class Professor extends Pessoa {


    private float salario;
    private String disciplina;


    public Professor(String nome, int idade, char sexo, Rg rg) {
        super(nome, idade, sexo, rg);
    }

    @Override
    public String falar(String fala, String mostrarDados) {
        return null;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    Rg rg = new Rg("numeroRG","1999");

    public Professor(String nome, int idade, char sexo, int numeroRG, float salario, String disciplina) {
        super(nome, idade, sexo,numeroRG);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
