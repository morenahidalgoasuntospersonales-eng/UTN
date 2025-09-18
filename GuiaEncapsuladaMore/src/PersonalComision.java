public class PersonalComision extends Personal{
    private double sueldofijo;
    private int clientes;
    private double montoPorCliente;

    public PersonalComision() {
    }

    public PersonalComision(int dni, String nombre, String apellido, int anioIngreso, int clientes, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldofijo = 750000;
        this.clientes = clientes;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSueldofijo() {
        return sueldofijo;
    }

    public void setSueldofijo(double sueldofijo) {
        this.sueldofijo = sueldofijo;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double CalcularSalario(){
        double monto=clientes*montoPorCliente;
        if(monto<sueldofijo){
            return sueldofijo;
        }else{
           return monto;
        }

    }
    @Override
    public void imprimir(){
        System.out.println("\nEL DNI DEL EMPLEADO ES: "+getDni()+"\nEL NOMBRE DEL EMPLEADO ES: "+getNombre()+"\nLA CANTIDAD DE CLIENTES DE ESTE EMPLEADO ES DE :"+getClientes()+"\nEL SALARIO DEL EMPLEADO ES: "+CalcularSalario()+"\nEL AÑO DE INGRESO DE ESTE EMPLEADO ES: "+getAnioIngreso());
    }
}
