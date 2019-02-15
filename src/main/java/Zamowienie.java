
import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private Zwierze zwierze;
    private int ilosc;
    public List<String> zamowienia = new ArrayList<>();

    public Zamowienie(Zwierze zwierze, int ilosc) {
        this.zwierze = zwierze;
        this.ilosc = ilosc;
    }


}