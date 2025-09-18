public class PersonalFijo extends Personal {
    private double sueldoBasico;
    private double porcentajeAdicional;

    public PersonalFijo(int dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    public PersonalFijo() {
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public double PorcentajeReal(){
        int antiguedad=2025-getAnioIngreso();

         if (antiguedad>15){

            setPorcentajeAdicional(0.20);
            return getPorcentajeAdicional();

        } else if (antiguedad<=15&& antiguedad>8) {

             setPorcentajeAdicional(0.15);
             return getPorcentajeAdicional();

         }else if(antiguedad<8 && antiguedad>=4){

            setPorcentajeAdicional(0.10);
            return getPorcentajeAdicional();

         } else if(antiguedad<4&&antiguedad>=2){

             setPorcentajeAdicional(0.05);
             return getPorcentajeAdicional();

         } else {

             setPorcentajeAdicional(0);
            return getPorcentajeAdicional();

        }

    }
    @Override
    public double CalcularSalario(){
        double aumento= sueldoBasico*porcentajeAdicional;
        double salario=sueldoBasico+aumento;
        return salario;
    }
    @Override
    public void imprimir(){
        System.out.println("EL DNI DEL EMPLEADO ES: "+getDni()+"\nEL NOMBRE DEL EMPLEADO ES: "+getNombre()+"EL SUELDO DEL PERSONAL ES DE $"+CalcularSalario()+"\nEL AÑO DE INGRESO DEL EMPLEADO ES :"+getAnioIngreso());
    }
}

