package capitulo9.lab1;

public class Rg {

    private int numero;
    private String dataNasc;

    public Rg(String numeroRG, String dataNasc) {
    }

    public int getNumero() {
        return numero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public Rg(int numero, String dataNasc) {
        this.numero = numero;
        this.dataNasc = dataNasc;
    }
}
