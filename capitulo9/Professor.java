package capitulo9;

//Extends serve para extender os pamatros criado na class funcionario
//Super class
public class Professor extends Funcionario {

    private String materia;

    Professor(String materia) {
    this.materia = materia;

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Professor(String funcional, String nome , String email, String materia){
//        super.setFuncional(funcional);
//        super.setNome(nome);
//        super.setEmail(email);

//
        super(funcional,nome,email);
        this.materia = materia;

    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Materia:" + this.materia);


    }
}
