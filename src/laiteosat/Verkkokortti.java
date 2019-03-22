package laiteosat;

import java.util.List;

public class Verkkokortti implements Laiteosa {
	
	private double hinta;
	
	public Verkkokortti(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void addOsa(Laiteosa osa) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Laiteosa> getOsat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getInfo() {
		System.out.println("verkkokortti " + getHinta());
	}

}
