package d14_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		U glavom programu kreirajte svoje porodicno stablo bar do babe i dede :grin:
//		Da vas odmah usmerim, IMAMO SAAAAAMO JEDNU KLASU OSOBA  i imamo main program nista vise od klasa vam ne treba!

		
		
		Osoba ja = new Osoba("Stefan Stojiljkovic", 1995, "muski");
		Osoba majka = new Osoba("Suzana Stojiljkovic", 1964, "zenski");
		Osoba otac = new Osoba("Bratislav Stojiljkovic", 1957, "muski");
		ja.setMajka(majka);
		ja.setOtac(otac);
		
		Osoba babaMajka = new Osoba("Bozidarka Stojanovic", 1940, "zenski");
		majka.setMajka(babaMajka);
		Osoba dedaMajka = new Osoba ("Dusan Stojanovic", 1939, "muski");
		majka.setOtac(dedaMajka);
		
		Osoba babaOtac = new Osoba("Anka Stojiljokvic", 1937, "zenski");
		otac.setMajka(babaOtac);
		Osoba dedaOtac = new Osoba ("Dragoljub Stojiljkovic", 1935, "muski");
		otac.setOtac(dedaOtac);
		
		ja.stampaj();
		
		
	}

}
