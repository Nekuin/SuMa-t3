package laiteosat;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa{

	private List<Laiteosa> osat;
	private double hinta;
	
	public Emolevy(double hinta) {
		this.osat = new ArrayList<>();
		this.hinta = hinta;
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
		return this.osat;
	}
	
	@Override
	public String toString() {
		return "emolevy";
	}

	@Override
	public void getInfo() {
		System.out.println(this + " (" + hinta + ") " + getHinta());
		getOsat().forEach(Laiteosa::getInfo);
	}

}
