package laiteosat;

import java.util.List;

public class Muisti implements Laiteosa{

	private double hinta;
	
	public Muisti(double hinta) {
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
	public String toString() {
		return "muisti";
	}

	@Override
	public void getInfo() {
		System.out.println(this + " " + getHinta());
	}

}
