package org.lessons.java.animali.astratti;

public class Cane extends Animali {

	@Override
	public void verso() {
		System.out.println ("Bau Bau Bau");	
	}
	@Override
	public void mangia() {
		System.out.println ("Mangia: Carne di tutti i tipi e Croccantini");
	}
}

