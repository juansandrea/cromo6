package entidades;

import java.util.ArrayList;

public class Avioneta extends Avion{


    public Avioneta(int largo, int puerta, double combustible, ArrayList<Tripulacion> tripulacion, ArrayList<Pasajero> pasajeros, String destino, int altura, int velocidad) {
        super(largo, puerta, combustible, tripulacion, pasajeros, destino, altura, velocidad);
    }

    @Override
    public void aterrizarDeEmergencia() {
        this.setVelocidad(30);
        this.setAltura(50);

    }
}
