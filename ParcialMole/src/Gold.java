public class Gold extends Entrada{
    private Banda meet_greet;

    public enum Banda {
        GREEN_DAY,KENDRICK_LAMAR,TYLER_THE_CREATOR;
    }

    public Gold(int idUnico, Usuario titular, double precio, int idPuesto, boolean escaneado, Banda meet_greet) {
        super(idUnico, titular, precio, idPuesto, escaneado);
        this.meet_greet = meet_greet;
    }
}
