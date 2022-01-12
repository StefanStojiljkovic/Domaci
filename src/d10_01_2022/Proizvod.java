package d10_01_2022;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
	
//	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//	Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.
//	Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//	Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


	String naziv;
	double cena;
	double tezina;
	
	public void stampaj() {
		
		System.out.println("Naziv proizvoda: " + this.naziv + ", " + "Cena: " + this.cena + "din" + ", " + "Tezina: " + this.tezina + "gr");
		
	
		
	}
	public void povecajCenu(double povecanje) {
		cena = this.cena + povecanje;
	}
	public double vratiCenuSaPopustom (double popust) {
		double novaCena = cena - cena * (popust / 100);
	
		
		return novaCena;
	
		} 
		public int racunajPostarinu() {
		int postarina = 0;
		
		if( tezina<= 100.00) {
			postarina = 200;
		}
		else if (tezina >=101.00 && tezina <= 500.0) {
			postarina = 400;
		} else if ( tezina > 500) {
			postarina = 1000;
		}
		return postarina;
		
		
	}
	
	

}
