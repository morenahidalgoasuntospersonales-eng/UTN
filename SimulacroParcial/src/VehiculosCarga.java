public class VehiculosCarga extends Vehiculos{
    private double capacidadMaxima;
    private Medicion medicion;

    public VehiculosCarga(Modelo modelo, String marca, String patente, double velocidadRecomendada, double kilometraje, double capacidadMaxima, Medicion medicion) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.capacidadMaxima = capacidadMaxima;
        this.medicion = medicion;
    }

    public VehiculosCarga(double capacidadMaxima, Medicion medicion) {
        this.capacidadMaxima = capacidadMaxima;
        this.medicion = medicion;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }
}
