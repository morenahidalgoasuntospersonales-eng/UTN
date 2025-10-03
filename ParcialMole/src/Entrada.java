public class Entrada {
    private int idUnico;
    private Usuario titular;
    private double precio;
    private int idPuesto;
    private boolean escaneado;


    public Entrada(int idUnico, Usuario titular, double precio, int idPuesto, boolean escaneado) {
        this.idUnico = idUnico;
        this.titular = titular;
        this.precio = precio;
        this.idPuesto = idPuesto;
        this.escaneado = escaneado;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public boolean isEscaneado() {
        return escaneado;
    }

    public void setEscaneado(boolean escaneado) {
        this.escaneado = escaneado;
    }
}
