import entidades.Avion;
import entidades.Crucero;
import entidades.Pasajero;
import entidades.Tripulacion;

public class Main {
    public static void main(String[] args) {
        Tripulacion tripulacion1 = new Tripulacion("jose","gonzales",25488486,"Piloto");
        Pasajero pasajero1= new Pasajero("maria","gomez",11594976);

        Avion avion = new Crucero(15,8,100.00,tripulacion1,pasajero1,80,40);

    }
}
