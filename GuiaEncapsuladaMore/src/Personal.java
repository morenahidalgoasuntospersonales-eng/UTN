public abstract class Personal {
    private int dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Personal() {
    }

    public Personal(int dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
    public abstract double CalcularSalario();
    public abstract void imprimir();
}
