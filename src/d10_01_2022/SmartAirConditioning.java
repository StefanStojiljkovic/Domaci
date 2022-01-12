package d10_01_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//	atribut za mod (hladi/greje)
	
//	metodu za stampu - stampa u formatu 
//	marka - mod - termperatura
	
//	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
	
//	metodu koja racuna koliko klima novca potrosi za mesec dana
//	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//	Metoda vraca ukupnu cenu za taj mesec
//
//	U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

	
	String marka;
	int potrosnjaHladjenja;
	int potrosnjaGrejanja;
	int temperatura;
	boolean grejanjeUkljuceno;
	
	int mesecnaPotrosnja = 0;
	
	
	public void stampaj() {
		
		
		System.out.println("Marka klime: " + this.marka + " - " + "Hladnjenje ukljuceno, grejanje iskljuceno: " + this.grejanjeUkljuceno + " - " +
		"izabrana temperatura: " + this.temperatura);
		
	}
	
	public void mesecnaPotrosnja() {
		if (grejanjeUkljuceno = true) {
			mesecnaPotrosnja = 30 * 15 * potrosnjaGrejanja;
			System.out.println("Mesecna potrosnja: " + mesecnaPotrosnja + "kW/h");
			
		}else if (grejanjeUkljuceno = false) {
			mesecnaPotrosnja = 30 * 15 * potrosnjaHladjenja;
			System.out.println("Mesecna potrosnja: " + mesecnaPotrosnja + "kW/h");
		}
	}
	
	public int potrosnjaNovca() {
		int plavaZona = 0;
		int zelenaZona = 0;
		
		if (mesecnaPotrosnja > 350) {
			zelenaZona = 350 * 6;
			plavaZona = (mesecnaPotrosnja - 350) * 9;
			
		}
		else if (mesecnaPotrosnja <=350) {
			zelenaZona = mesecnaPotrosnja * 6;
			
		}
		int ukupnaCena = zelenaZona + plavaZona;
		
		return ukupnaCena;
		
	}
}
