package capitulo7.lab1;

public class Cap7_lab1 {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
//    cadastro.setNome("joao2");
//    cadastro.setSobrenome("Sant Ana2");
//    cadastro.setIdade(26);
        cadastro.mostrar();

        Cadastro cadastro1 = new Cadastro();
        cadastro1.setNome("joao2");
        cadastro1.setSobrenome("Sant Ana2");
        cadastro1.mostrar();


        Cadastro cadastro2 = new Cadastro("joao", "Sant Ana", 26);
        cadastro2.mostrar();
    }
}
