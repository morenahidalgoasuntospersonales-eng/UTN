import java.util.ArrayList;

public class Gestora {
    private Personal personal;
    private ArrayList<Personal> personalList;

    public Gestora(ArrayList<Personal> personalList, Personal personal) {
        this.personalList = personalList;
        this.personal = personal;
    }
}
