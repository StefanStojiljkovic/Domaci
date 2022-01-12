package d10_01_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1

	String imeKorisnika;
	String gdeJeObjavljeno;
	String tekst;
	int brojDeljenja;
	int brojLajkova;

	public void print() {
		System.out.println(imeKorisnika + " >>> " + gdeJeObjavljeno);
		System.out.println(tekst);
		System.out.println("Likes " + brojLajkova + " | " + "Shares " + brojDeljenja);

	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;

	}

	public void dislike() {
		this.brojLajkova = this.brojLajkova - 1;

		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

}
