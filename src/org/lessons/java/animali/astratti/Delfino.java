package org.lessons.java.animali.astratti;

public class Delfino extends Animali implements INuotante {

	@Override
	public void verso() {
		System.out.println ("Click");
		
	}

	@Override
	public void mangia() {
		System.out.println ("Mangia i pesci");
		
	}
	@Override
	public void nuota () {
		System.out.println ("Sto nuotando!");
		
	}

}