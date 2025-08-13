package capitulo6.lab3;

public class Cap6_Lab3 {

    public static void main(String[] args) {


        Aluno joao = new Aluno();
        joao.setNome("Joao");
        joao.contadorDeAluno += 1;
        joao.imprimir();

        Aluno maria = new Aluno();
        maria.setNome("maria");
        maria.contadorDeAluno = maria.contadorDeAluno + 1;
        maria.imprimir();

        Aluno marcos = new Aluno();
        marcos.setNome("marcos");
        marcos.contadorDeAluno++;
        marcos.imprimir();


    }
}
