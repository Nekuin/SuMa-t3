package app;

import java.util.Random;

import laiteosat.*;

public class KokoonpanoFactory {
	
	private Random r;
	
	public KokoonpanoFactory() {
		r = new Random();
	}
	
	public Kokoonpano createKokoonpano() {
		Kokoonpano k1 = new Kokoonpano();
		k1.addOsa(createKotelo());
		return k1;
	}
	
	private Laiteosa createKotelo() {
		
		Laiteosa kotelo = new Kotelo(r.nextInt(20)+80);
		kotelo.addOsa(createEmolevy());
		return kotelo;
	}

	private Laiteosa createEmolevy() {
		Laiteosa emolevy = new Emolevy(r.nextInt(20)+200);
		emolevy.addOsa(new Muisti(r.nextInt(5)+20));
		emolevy.addOsa(new Prosessori(r.nextInt(50)+150));
		emolevy.addOsa(new Verkkokortti(r.nextInt(5)+15));
		emolevy.addOsa(new Näytönohjain(r.nextInt(70)+300));
		return emolevy;
	}
}
