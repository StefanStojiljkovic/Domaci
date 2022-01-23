package d20_01_2022;

public class Igrac extends Osoba{
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	
	private int brojIgraca;
	private String pozicijaIgraca;
	private boolean daLiJeKapiten;
	
	public Igrac() {
		
	}

	public Igrac(String ime, String prezime, String jmbg, int godRodjenja, int brojIgraca, String pozicijaIgraca, boolean daLiJeKapiten) {
		super(ime,prezime, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicijaIgraca = pozicijaIgraca;
		this.daLiJeKapiten = daLiJeKapiten;
	
	}
	

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}

	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}

	public boolean isDaLiJeKapiten() {
		return daLiJeKapiten;
	}

	public void setDaLiJeKapiten(boolean daLiJeKapiten) {
		this.daLiJeKapiten = daLiJeKapiten;
	}
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj igraca: " + this.brojIgraca + ", pozicija: " + this.pozicijaIgraca);
		
		if(isDaLiJeKapiten() == true) {
		System.out.println("Kapiten tima.");
		
		}
		else if (isDaLiJeKapiten() == false) {
			System.out.println("Nije kapiten tima.");
		}

		
		


		
	}


	

}
