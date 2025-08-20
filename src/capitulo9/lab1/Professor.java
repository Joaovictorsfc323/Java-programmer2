package capitulo9.lab1;

public class Professor extends Pessoa {

    private float salario;
    private String disciplina;


    public Professor(String nome, int idade, char sexo, Rg rg, float salario, String disciplina) {
        super(nome, idade, sexo, rg);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Professor(String nome, int idade, char sexo, int numeroRg, String dataNasc, float salario, String disciplina) {
        super(nome, idade, sexo, numeroRg, dataNasc);
        this.salario = salario;
        this.disciplina = disciplina;
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

    @Override
    public void falar(String fala){
        System.out.println(super.getNome() + "Fala");

    }
    @Override
    public void mostrarDados() {
        System.out.println("----------Prodessor-------------");
        System.out.println("nome:" + super.getNome());
        System.out.println("Idade:" + super.getIdade());
        System.out.println("sexo:" + super.getSexo());
        System.out.println("rg-numero:" + super.getRg().getNumero());
        System.out.println("rg-dataNascimento:" + super.getRg().getDataNasc());
        System.out.println("Disciplina:" + this.getDisciplina());
        System.out.println("Salario:" + this.getSalario());
        System.out.println();

    }
}
