package capitulo9.lab1;

public class Cap9Lab1 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jose", 15, 'm', 123456789, "05/05/2011", 8000.0f, "Java");


        Rg rgAluno2 = new Rg(123456789, "06/06/2010");
        Aluno aluno2 = new Aluno("joao", 17, 'm', rgAluno2, 8.000f, "java");

        Pessoa professor = new Professor("Alex", 26, 'm', 133456786, "05/09/1986",1_000_000.00f, "Java");


        aluno1.falar("esta presente");
        aluno2.falar("esta aqui");
        professor.falar("falou boa noite");

        aluno1.mostrarDados();
        aluno2.mostrarDados();
        professor.mostrarDados();

    }


}
