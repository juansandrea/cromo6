package entidades;

public class Avion {

    private int largo;
    private int puerta;
    private int combustible;
    private Tripulacion tripulacion;
    private Pasajero pasajeros;
    private int altura;
    private int velocidad;

    public Avion(int largo, int puerta, int combustible, Tripulacion tripulacion, Pasajero pasajeros, int altura, int velocidad) {
        this.largo = largo;
        this.puerta = puerta;
        this.combustible = combustible;
        this.tripulacion = tripulacion;
        this.pasajeros = pasajeros;
        this.altura = altura;
        this.velocidad = velocidad;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public Tripulacion getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Pasajero getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero pasajeros) {
        this.pasajeros = pasajeros;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
