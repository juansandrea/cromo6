package entidades;

import throwable.CombustibleInsuficienteException;
import throwable.PuertasInsuficientesException;

import java.util.HashMap;
import java.util.Map;

public class Avion {

    private int largo;
    private int puerta;
    private double combustible;
    private Tripulacion tripulacion;
    private Pasajero pasajeros;
    private int altura;
    private int velocidad;
    private Map<String,Double> combustiblePorDestino;

    public Avion(int largo, int puerta, double combustible, Tripulacion tripulacion, Pasajero pasajeros, int altura, int velocidad) {
        this.largo = largo;
        this.puerta = puerta;
        this.combustible = combustible;
        this.tripulacion = tripulacion;
        this.pasajeros = pasajeros;
        this.altura = altura;
        this.velocidad = velocidad;

        combustiblePorDestino = new HashMap<>();
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getPuerta() {
        return this.puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public double getCombustible() {
        return this.combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public Tripulacion getTripulacion() {
        return this.tripulacion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Pasajero getPasajeros() {
        return this.pasajeros;
    }

    public void setPasajeros(Pasajero pasajeros) {
        this.pasajeros = pasajeros;
    }


    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void estaListoParaDespegar(double combustible , int cantidad)throws CombustibleInsuficienteException, PuertasInsuficientesException {

        if (this.combustible < combustible){
            throw new CombustibleInsuficienteException(100.00d);
        }

        if (this.puerta > cantidad){
            throw new PuertasInsuficientesException(2);
        } else {
            return ;
        }

    }


    public void aterrizarDeEmergencia(){

    }


}
