package entidades;

import java.util.ArrayList;

public class Crucero extends Avion {

    public Crucero(int largo, int puerta, double combustible, ArrayList<Pasajero> pasajeros, String destino, int altura, int velocidad) {
        super(largo, puerta, combustible, pasajeros, destino, altura, velocidad);
    }

    @Override
    public void aterrizarDeEmergencia() {
        this.setVelocidad(40);
        this.setAltura(80);
    }
}
