package app;

import java.util.ArrayList;
import java.util.List;

import laiteosat.Laiteosa;

public class Kokoonpano implements Laiteosa{
	
	private List<Laiteosa> osat;
	
	public Kokoonpano() {
		this.osat = new ArrayList<>();
	}

	@Override
	public double getHinta() {
		return getOsat().stream().mapToDouble(Laiteosa::getHinta).sum();
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
	public void getInfo() {
		List<Laiteosa> osat = getOsat();
		System.out.println("kokoonpanon kokonaishinta: " + getHinta());
		System.out.println("osat: ");
		osat.forEach(Laiteosa::getInfo);
	}
	
}
