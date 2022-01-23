package d20_01_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected int godRodjenja;
	
	public Osoba() {
		
	}

	public Osoba(String ime,String prezime, String jmbg, int godRodjenja) {
		super();
		this.ime = ime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getPrezime() {
		return prezime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}

//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
	public void stampaj() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + ", JMBG: " + this.jmbg + ", godina rodjenja: " + this.godRodjenja);
	}

}
