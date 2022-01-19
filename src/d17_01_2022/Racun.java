package d17_01_2022;

public class Racun {
	
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
	

	
	private String brojRacuna;
	private String imePrezime;
	private double stanjeNaRacunu;
	
	
	public Racun(String brojRacuna, String imePrezime, int stanjeNaRacunu) {

		this.brojRacuna = brojRacuna;
		this.imePrezime = imePrezime;
		this.stanjeNaRacunu = stanjeNaRacunu;
	}


	public String getBrojRacuna() {
		return this.brojRacuna;
	}


	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}


	public String getImePrezime() {
		return this.imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public double getStanjeNaRacunu() {
		return this.stanjeNaRacunu;
	}
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
	
	public double novoStanjeNaRacunu(double iznos) {
		
		if (this.getStanjeNaRacunu() < 0) {
			return this.stanjeNaRacunu = 0;
			
		} else {
			return this.stanjeNaRacunu = this.getStanjeNaRacunu() - iznos;
		}
	}
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	public void stampaj() {
		
		System.out.println(this.imePrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanjeNaRacunu + "rsd");
		System.out.println();
		
		
		
	}

}
