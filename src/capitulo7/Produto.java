package capitulo7;

public class Produto {

    // Atributos  private são caracteristicas da classe
    private String tipo;
    private String nome;

    //Construtor padrão e defailt, não precisa ser criado
    // A não ser quie seja criado um construido
   public Produto() {


    }

    // Construtor é diferenciado quando ele tem mesmo nome da classe, já metodo é quando ele tem nome setado
    // no Construtor não precisa ter return
    public Produto(String tipo, String nome) {
        // toUpperCase transforma para letras maiscula
        this.tipo = tipo.toUpperCase();
        this.nome = nome.toUpperCase();


    }

   public Produto(String nome){this.nome.toUpperCase();}

    // get ele recupera valor dos atributos se for private
    //Construtor é diferenciado quando ele tem mesmo nome da classe, já metodo é quando ele tem nome setado
    // Já metodo sempre precisa ter um return
    public String getTipo() {
        return tipo;
    }

    /// public é aonde que posso utilizar metodo em qualquer lugar(modificador de acesso)
    // tipo é sempre String , int , double
    // e qual nome do metodo
    public String getNome() {
        return nome;
    }

    /// tipo void é quando eu quiser não retornar nada
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(tipo);
    }
}
