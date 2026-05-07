package andere;

public class Katze {
	
	String name;
	String rasse;
	double gewicht;
	String geschlecht;
	int alter;
	

	public Katze() {
		
	}
	public Katze(String name) {
		this.name = name;
	}
	public Katze(String name, String geschlecht) {
		this.name = name;
		this.geschlecht = geschlecht;
		
	}
	public Katze(String name, double gewicht, String geschlecht) {
		this.name = name;
		this.gewicht = gewicht;
		this.geschlecht = geschlecht;
	}
	public Katze(String name, String rasse, int alter, double gewicht, String geschlecht) {
		this.name = name;
		this.rasse = rasse;
		this.alter = alter;
		this.gewicht = gewicht;
		this.geschlecht = geschlecht;
	}
	
	
	@Override
	public String toString() {
		return "Katze name: " + name + ", rasse: " + rasse + ", gewicht: " + gewicht + ", geschlecht: " + geschlecht
				+ ", alter: " + alter;
	}
	public static void main(String[] args) {
		
		Katze garfield = new Katze("Garfield", "siamesischen", 3, 0, "Mänlisch");
		Katze lisa = new Katze("Lisa");
		Katze sam = new Katze("Sam", 15,"Mänlich" );
		
		System.out.println(sam);
		System.out.println(lisa);
		System.out.println(garfield);
	}
	
}
