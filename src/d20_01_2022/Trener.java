package d20_01_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener() {
		
	}

	public Trener(String ime,String prezime, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
		super(ime, prezime, jmbg, godRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
	}
	
}
