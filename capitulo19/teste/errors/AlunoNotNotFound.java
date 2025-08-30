package capitulo19.teste.errors;

public class AlunoNotNotFound  extends AlunoError{

    public AlunoNotNotFound(String message) {
        super(message);
    }

    public AlunoNotNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
