public class VehiculosEmpresariales extends Vehiculos {
    private int cantidadButacas;
    private int anioDeAdquisicion;

    public VehiculosEmpresariales(Modelo modelo, String marca, String patente, double velocidadRecomendada, double kilometraje, int cantidadButacas, int anioDeAdquisicion) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.cantidadButacas = cantidadButacas;
        this.anioDeAdquisicion = anioDeAdquisicion;
    }

    public int getCantidadButacas() {
        return cantidadButacas;
    }

    public void setCantidadButacas(int cantidadButacas) {
        this.cantidadButacas = cantidadButacas;
    }

    public int getAnioDeAdquisicion() {
        return anioDeAdquisicion;
    }

    public void setAnioDeAdquisicion(int anioDeAdquisicion) {
        this.anioDeAdquisicion = anioDeAdquisicion;
    }
}
