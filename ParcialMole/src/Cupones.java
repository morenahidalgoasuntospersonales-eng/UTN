public class Cupones {
    private producto ProductoCupon;
    private boolean escaneadoCupon;
    private int idCupon;
    private double PrecioCupon;

    public enum producto{
        BEBIDA_SIN_ALCOHOL,PIZZA,HAMBURGUESA,PANCHO;
    }

    public Cupones(producto productoCupon, boolean escaneadoCupon, int idCupon, double precioCupon) {
        ProductoCupon = productoCupon;
        this.escaneadoCupon = escaneadoCupon;
        this.idCupon = idCupon;
        PrecioCupon = precioCupon;
    }

    public boolean isEscaneadoCupon() {
        return escaneadoCupon;
    }

    public void setEscaneadoCupon(boolean escaneadoCupon) {
        this.escaneadoCupon = escaneadoCupon;
    }

    public int getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(int idCupon) {
        this.idCupon = idCupon;
    }
}

