public class Simple extends Entrada{
    private DiaFestival dia;

    public enum DiaFestival {
        PRIMER,SEGUNDO,TERCERO;
    }

    public Simple(int idUnico, Usuario titular, double precio, int idPuesto, boolean escaneado, DiaFestival dia) {
        super(idUnico, titular, precio, idPuesto, escaneado);
        this.dia = dia;
    }
}
