package entidades;

public class Tripulacion {

    private String nombre;
    private String apellido;
    private int DNI;
    private String cargo;

    public Tripulacion() {
        this.nombre = "";
        this.apellido = "";
        this.cargo = "";
        this.DNI = 0;
    }

    public Tripulacion(String nombre, String apellido, int DNI, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cargo = cargo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Tripulacion{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", DNI=" + DNI + ", cargo='" + cargo + '\'' + '}';
    }



}
