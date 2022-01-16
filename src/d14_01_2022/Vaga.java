package d14_01_2022;

public class Vaga {
//Kreirati klasu Vaga koja ima:
//merna jedinica (kg ili lb)
//proizvod (proizvod koji se meri)
//default-ni konstuktor
//getteri i setteri za sve atribute
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
//Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//metodu stampaj koja stampa racun u formatu:
//   (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//   Ukupno: (ukupna cena) 	      

	private String mernaJedinica;
	private Proizvod proizvod;

	public Vaga() {

	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	// metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je
	// parametar funkcije).
	// Na racunanje cene utice i merna jedinica na koju je vaga podesena.

	public double sracunajCenu(double tezina) {
		double ukupnaCena = 0;
		

		if (mernaJedinica == "Kg") {
			ukupnaCena = proizvod.getCenaKg() * tezina;
		
		} 		
		else if (mernaJedinica == "Lb") {
			ukupnaCena = proizvod.getCenaLb() * tezina;
		}
		return ukupnaCena;

	}

	public void stampaj(double tezina) {
		proizvod.stampaj();
		
		if (this.mernaJedinica == "Kg") {
			System.out.println(proizvod.getCenaKg() + " dinara po " + this.mernaJedinica + " * " + tezina);
			System.out.println("Ukupno: " + this.sracunajCenu(tezina) + "din");
			
		} else if (this.mernaJedinica == "Lb") {
			System.out.println("Cena po funti: " + proizvod.getCenaLb());
			System.out.println("Ukupno: " + this.sracunajCenu(tezina) + "din");
		}
		System.out.println();
	}

//  (sifra) - (naziv)
//  (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//  Ukupno: (ukupna cena) 	      

}
