package capitulo9;

public class Funcionario {

    private String funcional;
    private String nome;
    private String email;

    public Funcionario() {


    }

    Funcionario(String funcional, String nome, String email) {
        this.funcional = funcional;
        this.nome = nome;
        this.email = email;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimir() {
        System.out.println("Funcional:" + this.funcional);
        System.out.println("Nome:" + this.nome);
        System.out.println("Email:" + this.email);

    }

    public final double salario(){
        double salario = 10_000_000_00;
        System.out.println(salario);
        return salario;
    }

    //protected so consegue visualizar quando faz uma herença ou se estiver no mesmo pacote
    protected void mostrar(){
        System.out.println("nome:" + this.nome);

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "funcional='" + funcional + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
