public class VehiculoPasajeros extends Vehiculos {
    private int cantidadPax;
    private Categorias categoria;

    public VehiculoPasajeros(Modelo modelo, String marca, String patente, double velocidadRecomendada, double kilometraje, Categorias categoria, int cantidadPax) {
        super(modelo, marca, patente, velocidadRecomendada, kilometraje);
        this.categoria = categoria;
        this.cantidadPax = cantidadPax;
    }

    public int getCantidadPax() {
        return cantidadPax;
    }

    public void setCantidadPax(int cantidadPax) {
        this.cantidadPax = cantidadPax;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }




}
