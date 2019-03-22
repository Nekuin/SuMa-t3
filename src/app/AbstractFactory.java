package app;

import java.util.Random;

import laiteosat.Emolevy;
import laiteosat.Kotelo;
import laiteosat.Laiteosa;
import laiteosat.Muisti;
import laiteosat.N�yt�nohjain;
import laiteosat.Prosessori;
import laiteosat.Verkkokortti;

public abstract class AbstractFactory {
	
	private Random r;
	
	public AbstractFactory() {
		r = new Random();
	}
	
	public Kokoonpano createKokoonpano() {
		Kokoonpano k1 = new Kokoonpano();
		k1.addOsa(createKotelo());
		return k1;
	}
	
	private Laiteosa createKotelo() {
		Laiteosa kotelo = new Kotelo(r.nextInt(20)+80+hintaOffset());
		kotelo.addOsa(createEmolevy());
		return kotelo;
	}

	private Laiteosa createEmolevy() {
		Laiteosa emolevy = new Emolevy(r.nextInt(20)+200+hintaOffset());
		emolevy.addOsa(new Muisti(r.nextInt(5)+20+hintaOffset()));
		emolevy.addOsa(new Prosessori(r.nextInt(50)+150+hintaOffset()));
		emolevy.addOsa(new Verkkokortti(r.nextInt(5)+15+hintaOffset()));
		emolevy.addOsa(new N�yt�nohjain(r.nextInt(70)+300+hintaOffset()));
		return emolevy;
	}
	
	//eri tehtailla eri offset
	public abstract double hintaOffset();
}
