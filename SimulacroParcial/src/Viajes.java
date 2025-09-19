import java.util.ArrayList;

public class Viajes {
    private int id;
    private Vehiculos vehiculo;
    private String patente;
    private Choferes chofer;
    private int cantidadPasajeros;
    private String destino;
    private double distanciaKm;
    private double tarifa;
    private static int ix=1;

    public Viajes(double tarifa, double distanciaKm, String destino, int cantidadPasajeros, Choferes chofer, String patente) {
        this.id=ix;
        ix++;
        this.tarifa = tarifa;
        this.distanciaKm = distanciaKm;
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
        this.chofer=chofer;
        this.patente = vehiculo.getPatente();
    }

    public void registrarViajes(double tarifa, double distanciaKm, String destino, int cantidadPasajeros, Choferes chofer, Vehiculos vehiculo) {
        ArrayList<Viajes> viajes = new ArrayList<>();
        viajes.add(new Viajes(tarifa,distanciaKm,destino,cantidadPasajeros,chofer,vehiculo.getPatente()));
    }
}
