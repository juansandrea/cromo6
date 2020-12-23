package entidades;

import throwable.CombustibleInsuficienteException;
import throwable.PuertasInsuficientesException;

import java.util.*;

public abstract class Avion {

    private int largo;
    private int puerta;
    private double combustible;
    private ArrayList<Tripulacion> tripulacion;
    private ArrayList<Pasajero> pasajeros;
    private String destino;
    private int altura;
    private int velocidad;
    private Map<String, Double> combustiblePorDestino;


    public Avion(int largo, int puerta, double combustible, ArrayList<Tripulacion> tripulacion, ArrayList<Pasajero> pasajeros, String destino, int altura, int velocidad) {
        this.largo = largo;
        this.puerta = puerta;
        this.combustible = combustible;
        this.tripulacion = tripulacion;
        this.pasajeros = pasajeros;
        this.destino = destino;
        this.altura = altura;
        this.velocidad = velocidad;

        combustiblePorDestino = new HashMap<>();
        combustiblePorDestino.put("rio de janeiro", 50.00);
        combustiblePorDestino.put("new york", 60.00);
        combustiblePorDestino.put("barcelona", 35.00);
        combustiblePorDestino.put("madrid", 40.00);

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


    public boolean estaListoParaDespegar() throws CombustibleInsuficienteException, PuertasInsuficientesException {

        if (this.puerta < (this.tripulacion.size() + this.pasajeros.size()) / 50)
            throw new PuertasInsuficientesException();

        double combust = 0;
        Iterator it = combustiblePorDestino.keySet().iterator();
        while (it.hasNext()) {
            String destinos = (String) it.next();
            if (destinos.equals(this.destino)) {
                combust = combustiblePorDestino.get(destinos);
                break;
            }
        }
        if (combust <= this.combustible) {
            return true;
        } else {
            throw new CombustibleInsuficienteException();
        }
    }


    public Tripulacion ingresarTripulante() {
        Tripulacion tripulante = new Tripulacion();
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Ingres el nombre del tripulante ");
        tripulante.setNombre(teclado.nextLine());
        System.out.println(" Ingres el apellido del tripulante ");
        tripulante.setApellido(teclado.nextLine());
        System.out.println(" Ingres el cargo del tripulante ");
        tripulante.setCargo(teclado.nextLine());
        System.out.println(" Ingres el dni del tripulante ");
        tripulante.setDNI(teclado.nextInt());

        tripulacion.add(tripulante);
        System.out.println("Carga Realizda con Exito");
        return tripulante;
    }


    public abstract void aterrizarDeEmergencia();


    public boolean puedeAterrizar(List<Avion> estacionados, int largoTotal) {
        int largoDeAviones = 0;
        for (Avion avionlenght : estacionados){
            largoDeAviones += avionlenght.largo;
        }
        return largoTotal - largoDeAviones >= 12 * this.largo;

    }
}



