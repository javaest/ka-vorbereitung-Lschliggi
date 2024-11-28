package vorlage;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Gericht> speisekarte;
    private List<Bestellung> bestellungen;

    // Methoden zur Verwaltung von Gerichten und Bestellungen
    public void bestellungAufnehmen(Bestellung bestellung) {
        bestellungen.add(bestellung);
    }

    public void bestellungEntfernen(Bestellung bestellung){
        bestellungen.remove(bestellung);
    }

    public void gerichtHinzufuegen(Gericht gericht) {

    }

    public Restaurant(){
        this.bestellungen = new ArrayList<Bestellung>();
    }

    public List<Bestellung> getBestellungen(){
        return bestellungen;
    }
}