package entidades;

public class Pasajero extends Tripulacion {


    public Pasajero(String nombre, String apellido, int DNI) {
        super(nombre, apellido, DNI);
    }

    @Override
    public String toString() { return "Pasajero{}";
    }
}
