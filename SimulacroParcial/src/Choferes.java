public class Choferes {
    private String nombre;
    private String apellido;
    private int dni;
    private double salario;
    private double km;


    public Choferes(String nombre, String apellido, int dni, double salario, double km) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
        this.km = km;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
