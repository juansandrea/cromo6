package throwable;

public class CombustibleInsuficienteException extends Exception{

    public CombustibleInsuficienteException(double combustible){super(String.valueOf(combustible));}
}
