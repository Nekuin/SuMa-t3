package laiteosat;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
	
	private double hinta;
	private List<Laiteosa> osat;
	
	public Kotelo(double hinta) {
		this.hinta = hinta;
		this.osat = new ArrayList<>();
	}

	@Override
	public double getHinta() {
		double osienHinta = getOsat().stream()
				.mapToDouble(Laiteosa::getHinta)
				.sum();
		return hinta + osienHinta;
	}

	@Override
	public void addOsa(Laiteosa osa) {
		this.osat.add(osa);
	}

	@Override
	public List<Laiteosa> getOsat() {
		return osat;
	}

	@Override
	public void getInfo() {
		System.out.println("kotelo (" + hinta + ") " + getHinta());
		getOsat().forEach(Laiteosa::getInfo);
	}

}
