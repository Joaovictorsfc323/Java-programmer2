package capitulo6;

public class Cliente {

   // static serve sem precisar fazer instancia de "new" aonde as pessoas pode acessar
    static String testeStatic;

   private String nome;
    private String cpf;

    // para recuperar o nome que esta private
    public String getNome(){
        return nome;

    }
    // Utilizando set para atribuir ao parametro valor
    // this é utilizado para acessar um metodo ou variavel da minha classe
    // this ele entende que se tiver uma variavel igual do atributo ele consegue diferenciar
    public void setNome(String nome){
        this.nome = nome;

    }


}
