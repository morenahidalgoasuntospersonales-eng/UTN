public class Ventas {
    private int stock;
    private int cantidadVendidas;
    private boolean abiertoONo;
    private double recaudacion;


    public Ventas(int stock, int cantidadVendidas, boolean abiertoONo, double recaudacion) {
        this.stock = stock;
        this.cantidadVendidas = cantidadVendidas;
        this.abiertoONo = abiertoONo;
        this.recaudacion = recaudacion;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public boolean isAbiertoONo() {
        return abiertoONo;
    }

    public void setAbiertoONo(boolean abiertoONo) {
        this.abiertoONo = abiertoONo;
    }

    public int getCantidadVendidas() {
        System.out.println("LA CANTIDAD DE ENTRADAS VENDIDAS ES: "+cantidadVendidas);
        return cantidadVendidas;
    }

    public void setCantidadVendidas(int cantidadVendidas) {
        this.cantidadVendidas = cantidadVendidas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void  Vender(int cantidad){
        if(isAbiertoONo()){
            if(stock>=cantidad){
            setStock(stock-cantidad);
            setCantidadVendidas(getCantidadVendidas()+cantidad);
        }else{
                System.out.println("NO ES POSIBLE CONCRETAR LA VENTA POR FALTA DE STOCK");
            }
        }
        else{
            System.out.println("LAS VENTAS YA NO SE ENCUENTRAN DISPONIBLES");
        }
    }
}
