package capitulo19.cap19lab1br.com.impacta.java;

public class DAOException extends Exception {

    public DAOException(){
        super();

    }

    public DAOException(String massage){
    super(massage);
    }

    public DAOException(Throwable cause){
  super(cause);

    }
    public DAOException(String massage ,Throwable cause){

        super(massage,cause);
    }
}
