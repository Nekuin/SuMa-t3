package laiteosat;

import java.util.List;

public class Näytönohjain implements Laiteosa {
	
	private double hinta;
	
	public Näytönohjain(double hinta) {
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
		System.out.println("näytönohjain " + getHinta());
	}

}
