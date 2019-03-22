package laiteosat;

import java.util.List;

public class Prosessori implements Laiteosa {

	private double hinta;
	
	public Prosessori(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void addOsa(Laiteosa osa) {

	}

	@Override
	public List<Laiteosa> getOsat() {
		return null;
	}

	@Override
	public void getInfo() {
		System.out.println("prosessori " + getHinta());
	}

}
