package org.lessons.java.animali.astratti;

public class Main {
	
	public static void main(String[] args) {
		
		Animali cane = new Cane ();
		Animali passerotto = new Passerotto ();
		Animali aquila = new Aquila ();
		Animali delfino = new Delfino ();
		
		System.out.println ("Cane");
		cane.dormi();
		cane.verso();
		cane.mangia();
		System.out.println ("Passerotto");
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		System.out.println ("Aquila");
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		System.out.println ("Delfino");
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		
	}

}
