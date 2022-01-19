package d18_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Student student1 = new Student("33", "Stefan Stojiljkovic", "master");
		
		Ispit ispit1 = new Ispit("Prava", 6, "Milorad Dodik");
		Ispit ispit2 = new Ispit("Ekonomija", 5, "Ana Anic");
		Ispit ispit3 = new Ispit("Turizam", 8, "Jovan Jocic");
		Ispit ispit4 = new Ispit("Fizika", 7, "Marija Topic");
		Ispit ispit5 = new Ispit("Biologija", 10, "Nenad Nedic");
		
		
		student1.dodajIspit(ispit1);
		student1.dodajIspit(ispit2);
		student1.dodajIspit(ispit3);
		student1.dodajIspit(ispit4);
		student1.dodajIspit(ispit5);
		
		student1.stampajListuIspita();
		
	}

}
