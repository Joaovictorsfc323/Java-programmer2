package capitulo6;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Alex");

        System.out.println(cliente.getNome());

    }
    // static serve sem precisar fazer instancia de "new" aonde as pessoas pode acessar
    public static void outro(String[] args) {
        Cliente.testeStatic = "teste";

        System.out.println(Cliente.testeStatic);

    }
}
