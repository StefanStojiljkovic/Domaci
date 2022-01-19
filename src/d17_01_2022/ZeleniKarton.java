package d17_01_2022;

public class ZeleniKarton {
//	Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)

//

	
	private String imePrezime;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProfesora;
	private int ocena;
	
	
	public ZeleniKarton(String imePrezime, int brojIndeksa, String nazivPredmeta, String imePrezimeProfesora,
			int ocena) {
	
		this.imePrezime = imePrezime;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProfesora = imePrezimeProfesora;
		this.ocena = ocena;
	}


	public String getImePrezime() {
		return imePrezime;
	}


	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	public int getBrojIndeksa() {
		return brojIndeksa;
	}


	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}


	public String getNazivPredmeta() {
		return nazivPredmeta;
	}


	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}


	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}


	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}


	public int getOcena() {
		return ocena;
	}


	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	
	public boolean rezultatIspita(){
		boolean ispitJePolozen = true;
		
		if(this.ocena == 5) {
			ispitJePolozen = false;
		}
		return ispitJePolozen;
		
	}
//	metodu stampaj koja stampa podatke u formatu:
//	(naziv predmeta) - (ocena)
//	Student: ime i prezime, broj indeksa
//	Profesor: ime i prezime
	
	public void stampaj() {
		System.out.println("(" + this.nazivPredmeta + ") - (" + this.ocena + ")");
		System.out.println("Student: " + this.imePrezime + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProfesora);
		System.out.println();
	}

}
