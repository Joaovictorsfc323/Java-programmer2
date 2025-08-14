package capitulo7;

public class Construtor {

    public static void main(String[] args) {
        Produto produto = new Produto(); // Construtor padrão

        produto.setNome("bebida");
        produto.setTipo("red bull");
        String tipo = produto.getTipo();
        System.out.println(produto.getTipo());


        // Construtor do tipo construido
        Produto produto1 = new Produto("refrigerante", "coca-cola");
        System.out.println(produto1);
    }
}
