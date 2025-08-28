package capitulo15.cap15_lab02;

import java.util.ArrayList;

public class Cap15_Lab02 {
    public static void main(String[] args) {

        ArrayList<Estudante> estudanteList = new ArrayList<>();

        estudanteList.add(new Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Estudante("Antonio", 6.0, 9.0));
        estudanteList.add(new Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
        estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
        estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));

        estudanteList.forEach(estudante -> {

            double media = (estudante.getNotaMatematica() + estudante.getNotePortugues()) / 2;
            estudante.setMedia(media);
        });

        estudanteList.forEach(estudante -> {
            System.out.println("Nome: " + estudante.getNome() + ",Media:" + estudante.getMedia());

        });

    }
}
