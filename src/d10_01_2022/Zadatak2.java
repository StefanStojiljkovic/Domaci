package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
	
		SmartAirConditioning a = new SmartAirConditioning();
		a.marka = "Samsung";
		a.potrosnjaHladjenja = 2;
		a.potrosnjaGrejanja = 3;
		a.temperatura = 30;
		a.grejanjeUkljuceno = true;
		a.stampaj();
		a.mesecnaPotrosnja();
		
		int mesecnaCena = a.potrosnjaNovca();
		System.out.println("Mesecna cena koriscenja klime: " + mesecnaCena + "din");
		
		
		System.out.println();
		
		SmartAirConditioning b = new SmartAirConditioning();
		b.marka = "Gree";
		b.potrosnjaHladjenja = 4;
		b.potrosnjaGrejanja = 2;
		b.temperatura = 16;
		b.grejanjeUkljuceno = false;
		b.stampaj();
		b.mesecnaPotrosnja();
		
		mesecnaCena = b.potrosnjaNovca();
		System.out.println("Mesecna cena koriscenja klime: " + mesecnaCena + "din");
	}

}
