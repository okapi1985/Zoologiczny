
import java.util.*;

public class Sklep {
    public List<Zwierze> listaZwierzat = new ArrayList<>();
    public Set<Zwierze> katalogZwierzat = new HashSet<>();

    public void dodajZwierze(Zwierze zwierze){
        listaZwierzat.add(zwierze);
        katalogZwierzat.add(zwierze);
    }

    public void kupionoZwierze(Zwierze zwierze){
        listaZwierzat.remove(zwierze);
    }

    public Zwierze znajdzGatunek(String gatunek) {
        for (Zwierze zwierze : katalogZwierzat) {
            if (zwierze.getGatunek().equals(gatunek)){
                return zwierze;
            }
        }
        System.out.println("Nie ma takiego gatunku w sklepie");
        return null;
    }

    public Zwierze znajdzRodzaj(String rodzaj){
        for (Zwierze zwierze: katalogZwierzat){
            if (zwierze.getRodzaj().equals(rodzaj)){
                return zwierze;
            }
        }
        System.out.println("Nie ma takiego rodzaju w sklepie");
        return null;
    }

    public void wypiszDostepneZwierzetaOproczGatunku(){
        Iterator<Zwierze> iterator = katalogZwierzat.iterator();
        while (iterator.hasNext()) {
            System.out.println("Test: " + iterator.hasNext());
        }
    }

    public void znajdzLiczbeDostepnychZwierzat(){
        System.out.println();
        System.out.println("Obecnie w sklepie znajduje się "+listaZwierzat.size()+" zwierząt");
    }

//    public int obliczSumeZamowienia(){
//
//
//
//    }

    public static void main(String[] args) {

        Zwierze zwierze1 = new Zwierze("ssak", "chomik", 20);
        Zwierze zwierze2 = new Zwierze("ssak", "kot", 100);
        Zwierze zwierze3 = new Zwierze("ssak", "kot", 300);
        Zwierze zwierze4 = new Zwierze("ptak", "ara", 1000);
        Zwierze zwierze5 = new Zwierze("ptak", "kanarek", 50);
        Zwierze zwierze6 = new Zwierze("gad", "żółw", 70);
        Zwierze zwierze7 = new Zwierze("gad", "iguana", 700);
        Zwierze zwierze8 = new Zwierze("pajęczak", "ptasznik", 300);
        Zwierze zwierze9 = new Zwierze("pajęczak", "czarna wdowa", 600);

        Sklep sklep = new Sklep();

        sklep.dodajZwierze(zwierze1);
        sklep.dodajZwierze(zwierze2);
        sklep.dodajZwierze(zwierze3);
        sklep.dodajZwierze(zwierze4);
        sklep.dodajZwierze(zwierze5);
        sklep.dodajZwierze(zwierze6);
        sklep.dodajZwierze(zwierze7);
        sklep.dodajZwierze(zwierze8);
        sklep.dodajZwierze(zwierze9);

        System.out.println("Zwierzęta dostępne w sklepie zoologicznym: "+sklep.listaZwierzat);
        System.out.println();

        sklep.kupionoZwierze(zwierze1);
        sklep.kupionoZwierze(zwierze5);
        sklep.kupionoZwierze(zwierze7);

        System.out.println("Zwierzęta, które pozostały w sklepie po weekendzie: "+sklep.listaZwierzat);

        System.out.println();
        System.out.println("Wyszukiwanie gatunków: "+sklep.znajdzGatunek("kot"));
        System.out.println("Wyszukiwanie gatunków: "+sklep.znajdzGatunek("słoń"));

        System.out.println();
        System.out.println("Wyszukiwanie rodzajów: "+sklep.znajdzRodzaj("pajęczak"));
        System.out.println("Wyszukiwanie rodzajów: "+sklep.znajdzRodzaj("ryba"));

        sklep.wypiszDostepneZwierzetaOproczGatunku();
        sklep.znajdzLiczbeDostepnychZwierzat();







    }
}
