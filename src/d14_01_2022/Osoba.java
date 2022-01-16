package d14_01_2022;

public class Osoba {
//	Evo jednog za vezbanje (mislim da ce ovaj zadatak ukoliko ga resite da vam mnogo pomogne u razumevanju veza)
//	Kreirati klasu Osoba koja ima:
//	Ime i prezime
//	godinu rodjenja
//	pol
//	oca- koji je takodje Osoba
//	majku - takodje je Osoba
//	Gettere i settere
//	difoltni konstruktor
//	konstruktor koji postavlja ime i prezime i godinu rodjenja i pol
//	metodu za stampu koja stampa ovako:

	private String imePrezime;
	private int godRodjenja;
	private String pol;
	private Osoba otac;
	private Osoba majka;
	
	public Osoba() {
		
	}

	public Osoba(String imePrezime, int godRodjenja, String pol) {
		super();
		this.imePrezime = imePrezime;
		this.godRodjenja = godRodjenja;
		this.pol = pol;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}
	
	public Osoba getOtac() {
		return otac;
	}

	public void setOtac(Osoba otac) {
		this.otac = otac;
	}

	public Osoba getMajka() {
		return majka;
	}

	public void setMajka(Osoba majka) {
		this.majka = majka;
	}

	//	Ime i prezime, godina rodjenja [pol]
//			(ako je cale setovan)
//			OTAC: 
//			Stampamo caleta preko njegove metode za stampu
//			(Ako je majka setovana)
//			MAJKA:
//			Stampamo majku preko njene metode za stampu
	
	public void stampaj() {
		
		System.out.println(this.imePrezime + ", " + this.godRodjenja + "[" + this.pol + "]");
		System.out.println();
		
		System.out.println("OTAC: ");
		
		if (this.getOtac() != null) {
			otac.stampaj();
		} else {
			System.out.println("Nije definisan otac.");
		}
		
		System.out.println();
		System.out.println("MAJKA: ");
		 
		if (this.getMajka() != null) {
			majka.stampaj();
		} else {
			System.out.println("Nije definisana majka.");
		}
	
	}
	
}
