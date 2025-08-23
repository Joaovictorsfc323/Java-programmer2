package capitulo15;

public class TesteGenerico {
    public static void main(String[] args) {

        MinhaClasseGenerica<String> genericoString = new MinhaClasseGenerica<>("meu texto generico");

        MinhaClasseGenerica<Integer> genericoInteger = new MinhaClasseGenerica<>(10);
    }
}
