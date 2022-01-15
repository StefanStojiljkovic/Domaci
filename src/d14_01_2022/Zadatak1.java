package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
	//
//		Kreirati klasu Knjiga koji ima:
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
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		
		Autor autor1 = new Autor("Marina", "Vujcic");
		Autor autor2 = new Autor("Ivan", "Ivanji");
		Autor autor3 = new Autor("Andus", "Rusland");
		
		
		Knjiga knjiga1  = new Knjiga("Pedeset cigareta za Elenu", 353999655, 2009, autor1);
		Knjiga knjiga2  = new Knjiga ("Vila na Dedinju", 59595959, 2019, autor2);
		Knjiga knjiga3  = new Knjiga ("72 sata", 16695959, 2015, autor3);
		
		knjiga1.stampaj();
		System.out.println();
		knjiga2.stampaj();
		System.out.println();
		knjiga3.stampaj();
		
		
		
	}

}
