package app;

public class Main {

	public static void main(String[] args) {

		
		System.out.println("halpa");
		AbstractFactory halpa = new HalpaFactory();
		Kokoonpano k1 = halpa.createKokoonpano();
		k1.getInfo();
		System.out.println("--pelkkä hinta: " + k1.getHinta());
		
		AbstractFactory kallis = new KallisFactory();
		System.out.println("\n\nkallis");
		Kokoonpano k2 = kallis.createKokoonpano();
		k2.getInfo();
		System.out.println("--pelkkä hinta: " + k2.getHinta());
		
	}

}
