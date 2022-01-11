package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
	
		SmartAirConditioning a = new SmartAirConditioning();
		a.markaKlime = "Samsung";
		a.temperaturaKlime = 30;
		a.klimaHladi = false;
		a.stampaj();
		
		
		System.out.println();
		
		SmartAirConditioning b = new SmartAirConditioning();
		b.markaKlime = "Gree";
		b.temperaturaKlime = 16;
		b.klimaHladi = true;
		b.stampaj();
	}

}
