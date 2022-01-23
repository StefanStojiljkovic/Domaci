package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	private String ImeIPrezime;
	ArrayList<Sektor> sektoriUKojimaRadi = new ArrayList<Sektor>();
	
	public Radnik(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
		super();
		ImeIPrezime = imeIPrezime;
		this.sektoriUKojimaRadi = sektoriUKojimaRadi;
	}

	public abstract double plata();

	public void zaposliUSektor(Sektor sektor) {
		sektoriUKojimaRadi.add(sektor);
	}

}
