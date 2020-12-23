package entidades;

import throwable.CombustibleInsuficienteException;
import throwable.PuertasInsuficientesException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public abstract class Avion {

    private int largo;
    private int puerta;
    private double combustible;
    private ArrayList<Tripulacion> tripulacion;
    private ArrayList<Pasajero> pasajeros;
    private String destino;
    private int altura;
    private int velocidad;
    private Map<String,Double> combustiblePorDestino;


    public Avion(int largo, int puerta, double combustible,ArrayList<Pasajero> pasajeros,String destino, int altura, int velocidad) {
        this.largo = largo;
        this.puerta = puerta;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.altura = altura;
        this.velocidad = velocidad;

        combustiblePorDestino = new HashMap< String, Double>();

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



    public boolean estaListoParaDespegar()throws CombustibleInsuficienteException, PuertasInsuficientesException {

        if (this.puerta < (this.tripulacion.size() + this.pasajeros.size()) /50 )
            throw new PuertasInsuficientesException();

        double combust = 0;
        Iterator it = combustiblePorDestino.keySet().iterator();
        while (it.hasNext()) {
                String dest = (String) it.next();
                if (dest.equals(this.destino)) {
                    combust = combustiblePorDestino.get(dest);
                    break;
                }
            }
        if (combust <= this.combustible) {
                return true;
        } else {
            throw new CombustibleInsuficienteException();
            }
    }


    public Tripulacion ingresarTripulante(){
        Tripulacion tripulante = new Tripulacion();
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Ingres el nombre del tripulante " );
        tripulante.setNombre(teclado.nextLine());
        System.out.println(" Ingres el nombre del tripulante " );
        tripulante.setApellido(teclado.nextLine());
        System.out.println(" Ingres el nombre del tripulante " );
        tripulante.setCargo(teclado.nextLine());
        System.out.println(" Ingres el nombre del tripulante " );
        tripulante.setDNI(teclado.nextInt());

        tripulacion.add(tripulante);
        System.out.println("Carga Realizda con Exito");
        return tripulante;
    }



    public abstract void aterrizarDeEmergencia();


}
