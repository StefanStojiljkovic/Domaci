package d21_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

		ArrayList<Sektor> magacionerSektori = new ArrayList<Sektor>();
		ArrayList<Sektor> menadzerSektori = new ArrayList<Sektor>();

		Magacioner magacioner1 = new Magacioner("Stefan Stojiljkovic", magacionerSektori);

		Menadzer menadzer1 = new Menadzer("Nikola Nikolic", menadzerSektori);

		Sektor magacin = new Sektor("Sektor Magacina", 33000.00);
		Sektor distribucija = new Sektor("Distribucija", 25000.00);
		Sektor prodaja = new Sektor("Prodaja", 40000.00);

		Sektor logistika = new Sektor("Logistika", 35000.00);
		Sektor finansije = new Sektor("Finansije", 42000.00);
		Sektor nabavka = new Sektor("Nabavka", 39000.00);

		magacioner1.zaposliUSektor(magacin);
		magacioner1.zaposliUSektor(distribucija);
		magacioner1.zaposliUSektor(prodaja);

		menadzer1.zaposliUSektor(logistika);
		menadzer1.zaposliUSektor(finansije);
		menadzer1.zaposliUSektor(nabavka);

		System.out.println("Plata magacionera je: " + magacioner1.plata());
		System.out.println("Plata menadzera je: " + menadzer1.plata());

	}
}