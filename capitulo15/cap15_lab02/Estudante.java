package capitulo15.cap15_lab02;

public class Estudante {

    private String nome;
    private double notaMatematica;
    private double notePortugues;
    private double media;

    public Estudante(String nome, double notaMatematica, double notePortugues) {
        this.nome = nome;
        this.notaMatematica = notaMatematica;
        this.notePortugues = notePortugues;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotePortugues() {
        return notePortugues;
    }

    public void setNotePortugues(double notePortugues) {
        this.notePortugues = notePortugues;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
