import entidades.*;
import throwable.CombustibleInsuficienteException;
import throwable.PuertasInsuficientesException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CombustibleInsuficienteException, PuertasInsuficientesException {

        ArrayList<Pasajero> pasajeros = new ArrayList<>();

        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));
        pasajeros.add(new Pasajero("jose","gonzales",20548485,"pasjero"));

        ArrayList<Tripulacion> tripulacion = new ArrayList<>();

        tripulacion.add(new Tripulacion("jose","gonzales",20548485,"piloto"));
        tripulacion.add(new Tripulacion("jose","gonzales",20548485,"coopiloto"));
        tripulacion.add(new Tripulacion("jose","gonzales",20548485,"sobrecargo"));



        Crucero crucero = new Crucero(20,8,50.00,tripulacion,pasajeros,"new york",80,100);
        System.out.println(" Esta listo para despegar " + crucero.estaListoParaDespegar());
        Avioneta avioneta = new Avioneta(5,2,10.00,tripulacion,pasajeros,"Rio de Janeio",20,30);
        System.out.println(" Esta listo para despegar " + avioneta.estaListoParaDespegar());

        avioneta.ingresarTripulante();

        avioneta.aterrizarDeEmergencia();



    }


}
