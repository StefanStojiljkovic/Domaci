package d14_01_2022;

public class Knjiga {
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga

	
	private String naziv;
	private int ISBN;
	private int godIzdanja;
	private Autor autor;
	
	
	
	public Knjiga() {
	}

	public Knjiga(String naziv, int ISBN, int godIzdanja, Autor autor) {
		this.naziv = naziv;
		this.ISBN = ISBN;
		this.godIzdanja = godIzdanja;
		this.autor = autor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void stampaj() {
		System.out.println(this.ISBN);
		System.out.println(this.naziv + " - " + this.godIzdanja + "god");
		System.out.print("Autor: ");
		autor.stampaj();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
