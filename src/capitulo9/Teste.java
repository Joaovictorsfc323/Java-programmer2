package capitulo9;

public class Teste {
    public static void main(String[] args) {

        Professor professor = new Professor("Programação em java");
        professor.setFuncional("IP202501");
        professor.setNome("Joao");
        professor.setEmail("joaovictor@gmail.com");
        professor.imprimir();
        professor.salario();

        Professor professor1 = new Professor("IP202502", "joao","Joao@joao","Excel basico");
        professor1.imprimir();


        Funcionario funcionario = new Professor("Logica de programação");
        Professor professor2 = (Professor)funcionario;
        professor2.getMateria();

        //cache para acessar objeto porque saida é tipo professor e imprimi tudo que esta no professor
        ((Professor)funcionario).imprimir();

       Funcionario funcionario1 = new Funcionario();




    }
}
