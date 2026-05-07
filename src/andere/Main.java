package andere;

import andere.Vase;

public class Main {

	public static void main(String[] args) {
		
		Vase meineVase = new Vase();
		meineVase.setzeVolumen(5);
		meineVase.farbe = "Blau";
		System.out.println(meineVase.farbe);
		System.out.println(meineVase.gebeVolumen());
		
		Vase neueVase = new Vase(10, "Gelb");
		neueVase.setzeVolumen(10);
		System.out.print(neueVase.gebeVolumen() + ", ");
		System.out.println(neueVase.farbe);
		
		
		//Rote vase
		
		Vase vase2 = new Vase(2);
		vase2.farbe = "rot";
		System.out.print(vase2.farbe + ", ");
		System.out.println(vase2.gebeVolumen());
		
		
		Tisch t1 = new Tisch();
		t1.stellVase(vase2);
		t1.stellVase(neueVase);
		System.out.println();
	}
	
	
}
