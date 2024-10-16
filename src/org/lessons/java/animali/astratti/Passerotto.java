package org.lessons.java.animali.astratti;

public class Passerotto extends Animali implements IVolante {

	@Override
	public void verso() {
		System.out.println ("Cip Cip Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println ("Mangia: Fiocchi d'avena, Noci e Nocciole, Uvette e Frutta");
		
	}
	@Override
	public void vola () {
		System.out.println ("Sto volando!");
		
	}

}