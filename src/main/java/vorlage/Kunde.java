package vorlage;

public class Kunde extends Person{
    private int kundennummer;
	public Kunde(String name, int kundennummer) throws Exception {
		super(name);
		this.name = name;
		this.kundennummer = kundennummer;
	}

    // Konstruktor, Getter und Setter
}