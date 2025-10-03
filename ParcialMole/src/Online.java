public class Online extends Ventas {
    private String dominio;

    public Online(int stock, int cantidadVendidas, boolean abiertoONo, double recaudacion, String dominio) {
        super(stock, cantidadVendidas, abiertoONo, recaudacion);
        this.dominio = dominio;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
}

