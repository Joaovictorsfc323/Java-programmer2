package capitulo5.lab2;

public class Garagem {

   Carro carroPasseio;
   Carro carroUtilitario;


    public static void main(String[] args) {


        Garagem g = new Garagem();
       g.carroPasseio = new Carro();
       g.carroPasseio.cor = "Vermelho";
       g.carroPasseio.modelo = "Fusca";
       g.carroPasseio.potenciaDoMotor = "SCV";
       g.carroPasseio.imprimircarro();

       Carro utilitario = new Carro();
       utilitario.cor = "Azul";
       utilitario.modelo = "Kombi";
       utilitario.potenciaDoMotor = "12cv";
       g.carroUtilitario = utilitario;
       g.carroUtilitario.imprimircarro();



    }
}
