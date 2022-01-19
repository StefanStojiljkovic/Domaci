package d18_01_2022;

public class Ispit {
	

//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
	
	
	

	private String nazivPredmeta;
	private double ocena;
	private String imePrezimeProfesora;

	public Ispit() {

	}

	public Ispit(String nazivPredmeta, double ocena, String imePrezimeProfesora) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imePrezimeProfesora = imePrezimeProfesora;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}

	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}
	//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
	public boolean daLiJePolozen() {
		boolean ispitJePolozen = true;
		if(this.ocena>=6 || this.ocena<=10) {
			
			ispitJePolozen = true;	
		}
		else if (this.ocena==5) {
			
			ispitJePolozen = false;	
			}
		
		return ispitJePolozen;
	}
	//metodu koja stampa ispit u formatu:
	//(naziv predmeta) - (profesor) - (ocena)
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.getImePrezimeProfesora() + " - " + this.ocena);
	}


}
