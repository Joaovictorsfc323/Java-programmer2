package capitulo15;

public class TesteEquals {

    public static void main(String[] args) {

         boolean comparativiInt = 10 ==10;
        boolean comparativiChar = "c" == "c";
        boolean comparativoString = "igual" == "igual";

        Cliente cliente1 = new Cliente("Joao", "4947965857", "123123");
        Cliente cliente2 = new Cliente("Joao", "4947965857", "123123");
        Cliente cliente3 = cliente1;


        boolean comparativosObejtos = cliente1 == cliente2;
        boolean comparativosObejtos2 = cliente3.equals(cliente2);
        boolean comparativosObejtos3 = cliente3== cliente1;
        boolean comparativosObejtos4 = cliente3.equals(cliente1);
        boolean comparativosObejtos5 = cliente3.equals("Teste de objeto");

        System.out.println();

    }
}
