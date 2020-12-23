import entidades.*;
import throwable.CombustibleInsuficienteException;
import throwable.PuertasInsuficientesException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CombustibleInsuficienteException, PuertasInsuficientesException {

        ArrayList<Avion> estacionados = new ArrayList<>();




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



        Crucero crucero = new Crucero(20,8,70.00,tripulacion,pasajeros,"new york",80,100);
        System.out.println(" Esta listo para despegar " + crucero.estaListoParaDespegar());
        Avioneta avioneta = new Avioneta(5,2,50.00,tripulacion,pasajeros,"rio de janeiro",20,30);
        System.out.println(" Esta listo para despegar " + avioneta.estaListoParaDespegar());

        Crucero crucero1 = new Crucero(20,8,70.00,tripulacion,pasajeros,"new york",120,100);
        Avioneta avioneta1 = new Avioneta(5,2,50.00,tripulacion,pasajeros,"rio de janeiro",20,30);
        Crucero crucero2 = new Crucero(20,8,70.00,tripulacion,pasajeros,"new york",80,100);
        Avioneta avioneta3 = new Avioneta(5,2,50.00,tripulacion,pasajeros,"rio de janeiro",20,30);
        //avioneta.ingresarTripulante();
        estacionados.add(crucero);
        estacionados.add(crucero1);
        estacionados.add(crucero2);
        estacionados.add(avioneta);
        estacionados.add(avioneta1);
        System.out.println("crusero1 esta volando a "  + crucero1.getAltura() +" Pies y a una Velocidad de "+ crucero1.getVelocidad() + " Km/h" );
        crucero1.aterrizarDeEmergencia();
        System.out.println("crusero1 Solicito Aterrizar de Emergencia y Ahora esta volando a "  + crucero1.getAltura() +" Pies y a una Velocidad de "+ crucero1.getVelocidad() + " Km/h" );

        System.out.println("avioneta3 puede aterrizar. = " + avioneta3.puedeAterrizar(estacionados,100));




    }


}
