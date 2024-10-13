package org.lessons.java.animali.astratti;

public class Aquila extends Animali {

	@Override
	public void verso() {
		System.out.println ("Stridio");
		
	}

	@Override
	public void mangia() {
		System.out.println ("Mangia: Volpi, Lepri, Marmotte, Conigli selvatici e Faine");
		
	}

}
