package laiteosat;

import java.util.List;

public interface Laiteosa {
	public double getHinta();
	public void addOsa(Laiteosa osa);
	public List<Laiteosa> getOsat();
	public void getInfo();
}
