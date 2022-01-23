package d20_01_2022;


import java.util.Scanner;

import d17_01_2022.ZeleniKarton;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//		Podatke za igrace i trenere unosi korisnik sa tastature.
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj igraca: ");
		int brojIgraca = s.nextInt();
		
		
		Igrac[] igraci = new Igrac[brojIgraca];
		
		for(int i = 0; i<brojIgraca; i++) {
			Igrac igrac = new Igrac();
			igraci[i] = igrac;

			System.out.println("Unesite ime: ");
			String ime = s.next();
			igrac.setIme(ime);
			
			System.out.println("Unesite prezime: ");
			String prezime = s.next();
			igrac.setPrezime(prezime);
			
			System.out.println("Unesite jmbg: ");
			String jmbg = s.next();
			igrac.setJmbg(jmbg);
			
			System.out.println("Unesite godinu rodjenja: ");
			int godRodjenja = s.nextInt();
			igrac.setGodRodjenja(godRodjenja);

			System.out.println("Unesite broj igraca: ");
			int broj = s.nextInt();
			igrac.setBrojIgraca(broj);
			
			System.out.println("Unesite poziciju: ");
			String pozicijaIgraca = s.next();
			igrac.setPozicijaIgraca(pozicijaIgraca);
			
			System.out.println("Unesite da li je kapiten: ");
			boolean daLiJeKapiten = s.nextBoolean();
			igrac.setDaLiJeKapiten(daLiJeKapiten);
				
			
		}
		

		System.out.println("Unesite broj trenera: ");
		int brojTrenera = s.nextInt();

		Trener[] treneri = new Trener[brojTrenera];

		for(int i = 0; i<brojTrenera; i++) {
			Trener trener = new Trener();
			treneri[i] = trener;

			System.out.println("Unesite ime: ");
			String ime = s.next();
			trener.setIme(ime);
			
			System.out.println("Unesite prezime: ");
			String prezime = s.next();
			trener.setPrezime(prezime);
			
			System.out.println("Unesite jmbg: ");
			String jmbg = s.next();
			trener.setJmbg(jmbg);
			
			System.out.println("Unesite godinu rodjenja: ");
			int godRodjenja = s.nextInt();
			trener.setGodRodjenja(godRodjenja);

			System.out.println("Unesite godine iskustva: ");
			int godineIskustva = s.nextInt();
			trener.setGodineIskustva(godineIskustva);
			
			System.out.println("Unesite tip trenera: ");
			String tipTrenera = s.next();
			trener.setTipTrenera(tipTrenera);
			
			
		}
		for (int i = 0; i <igraci.length; i++) {
			System.out.println("Igrac broj: " + (i + 1));
			igraci[i].stampaj();
			System.out.println("");
			
		}
		
		for (int i = 0; i <treneri.length; i++) {
			System.out.println("Trener broj: " + (i + 1));
			treneri[i].stampaj();
			System.out.println("");
			
		}
		
	}
	

}
