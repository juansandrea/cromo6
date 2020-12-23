package entidades;

import java.util.ArrayList;

public class Jumbo extends Avion {

    public Jumbo(int largo, int puerta, double combustible, ArrayList<Pasajero> pasajeros, String destino, int altura, int velocidad) {
        super(largo, puerta, combustible, pasajeros, destino, altura, velocidad);
    }

    @Override
    public void aterrizarDeEmergencia() {
        this.setVelocidad(50);
        this.setAltura(100);
    }
}
