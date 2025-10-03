public class Boleteria extends Ventas {
    private Persona personaAcargo;

    public Boleteria(int stock, int cantidadVendidas, boolean abiertoONo, double recaudacion, Persona personaAcargo) {
        super(stock, cantidadVendidas, abiertoONo, recaudacion);
        this.personaAcargo = personaAcargo;
    }

    public Persona getPersonaAcargo() {
        return personaAcargo;
    }

    public void setPersonaAcargo(Persona personaAcargo) {
        this.personaAcargo = personaAcargo;
    }
}
