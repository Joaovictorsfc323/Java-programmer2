package capitulo9;

public class Teste {
    public static void main(String[] args) {

        Professor professor = new Professor("Programação em java");
        professor.setFuncional("IP202501");
        professor.setNome("Joao");
        professor.setEmail("joaovictor@gmail.com");
        professor.imprimir();

        Professor professor1 = new Professor("IP202502", "joao","Joao@joao","Excel basico");
        professor1.imprimir();
    }
}
