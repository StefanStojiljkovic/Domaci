package d17_01_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
	
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
	
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
	
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
	
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
	
	private String idTransakcije;
	private Racun posaljilac;
	private Racun primalac;

	public Transakcija() {

	}

	public Transakcija(String idTransakcije, Racun posaljilac, Racun primalac) {
		
		this.idTransakcije = idTransakcije;
		this.posaljilac = posaljilac;
		this.primalac = primalac;
	}

	public String getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getPosaljilac() {
		return posaljilac;
	}

	public void setPosaljilac(Racun posaljilac) {
		this.posaljilac = posaljilac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 

	private double provizija(double iznos) {
		
		if (iznos < 4500) {
			iznos = 45;
			
		} else {
		iznos = iznos * 0.01;
		}
		return iznos;
	}
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
	
	public void prenosSredstva(double vrednost) {
		
		if(this.getPosaljilac().getStanjeNaRacunu() >= vrednost) {
			this.getPosaljilac().novoStanjeNaRacunu(vrednost + provizija(vrednost));
			this.getPrimalac().novoStanjeNaRacunu(-vrednost);
		}
		else {
			System.out.println("Transakcija nije moguca, nemate sredstva na racunu.");
		}
	}
	
	
	
	
	
	

//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	public void stampaj() {
		
		System.out.println(this.idTransakcije);
		System.out.println("Racun sa: " + this.posaljilac.getImePrezime() + " - " + getPosaljilac().getBrojRacuna());
		System.out.println("Racun na: " + this.primalac.getImePrezime() + " - " + getPrimalac().getBrojRacuna());
		
		
		
	}
	
	
	
	
	
	
}
