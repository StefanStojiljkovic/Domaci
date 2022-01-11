package d10_01_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 
//
//
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
	
	String markaKlime;
	int temperaturaKlime;
	boolean klimaHladi = true;
	
	
	public void stampaj() {
		
		
		System.out.println("Marka klime: " + this.markaKlime);
		System.out.println("Izabrana temperatura: " + this.temperaturaKlime);
		System.out.println("Da li klima hladi: " + this.klimaHladi);
	}
	
}
