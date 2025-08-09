package capitulo3;

public class OperadroLogico {

	public static void main(String[] args) {

		int valor = 10;

		boolean teste = valor > 15; // falso
		boolean teste2 = valor < 15;
                          //FALSE    E  //TRUE = TRUE 
		boolean teste3 = valor > 15 && valor < 15; // Sempre que tiver um false sempre vai ser false s� da true se for
						                           // dois true 
		                 //true        //true
        boolean teste4 = valor ==10 && valor <15;
        
        
        boolean teste5 = valor == 10 || valor <15; // nesse caso do ou || ele sempre procura true s� retorna false se for os dois false 
        boolean teste6 = valor == 10 | valor <15;// se ele utilizar | ele s� valida primeira parte valor == 10 |
        
        
       boolean teste7 = valor != 3;//true valores de nega��o
       boolean teste8  =  !teste7;
       
       
       
       ///Operados precendecnia
       
       boolean teste9 = valor + 10 / 2 == 10;
       boolean teste10 = (valor + 10)/ 2 == 10;
       
       // Tenario � um comparativo tipo um if 
       String tenario = true ? "valor verdadeiro" : "valor se falso";
       String teste11 = 10 == 10 ? "10 � maior que 10 " : "10 n�o � maior que 10"; 
      
       
       
       
       
       
       
        
	}

}
