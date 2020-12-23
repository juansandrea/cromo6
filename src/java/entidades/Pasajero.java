package entidades;

public class Pasajero extends Tripulacion {


    public Pasajero(String nombre, String apellido, int DNI,String cargo) {
        super(nombre, apellido, DNI,cargo);
    }

    @Override
    public String toString() { return "Pasajero{}";
    }
}
