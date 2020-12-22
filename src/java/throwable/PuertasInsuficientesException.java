package throwable;

public class PuertasInsuficientesException extends Exception{
    public PuertasInsuficientesException(int puertas){super(String.valueOf(puertas));}
}
