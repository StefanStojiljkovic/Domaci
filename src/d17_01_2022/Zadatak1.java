package d17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {


//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
		
		
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton ispit1 = new ZeleniKarton("Stefan Stojiljkovic", 33, "Informatika", "Jovan Jovanovic", 7);
		ZeleniKarton ispit2 = new ZeleniKarton("Marko Mitic", 3, "Prava", "Zvonko Ilic", 6);
		ZeleniKarton ispit3 = new ZeleniKarton("Ana Nikolic", 14, "Ekologija", "Miloje Kikic", 5);
		ZeleniKarton ispit4 = new ZeleniKarton("Jovan Jucic", 23, "Hemija", "Jadranka Ilic", 8);
		ZeleniKarton ispit5 = new ZeleniKarton("Matija Matic", 43, "Mehanika", "Nikola Matic", 10);
		ZeleniKarton ispit6 = new ZeleniKarton("Marija Lukic", 35, "Energetika", "Ana Anic", 9);
		ZeleniKarton ispit7 = new ZeleniKarton("Milica Jovic", 7, "Tehnologija", "Jelena Panic", 5);
		ZeleniKarton ispit8 = new ZeleniKarton("Nemanja Jovic", 29, "Matematika", "Milos Obilic", 9);
		ZeleniKarton ispit9 = new ZeleniKarton("Edin Popovic", 37, "Biologija", "Aganlija Kucuk", 5);
		ZeleniKarton ispit10 = new ZeleniKarton("Mula Jusuf", 2, "Fizika", "Azer Aga", 10);
		
		ispiti.add(ispit1);
		ispiti.add(ispit2);
		ispiti.add(ispit3);
		ispiti.add(ispit4);
		ispiti.add(ispit5);
		ispiti.add(ispit6);
		ispiti.add(ispit7);
		ispiti.add(ispit8);
		ispiti.add(ispit9);
		ispiti.add(ispit10);
		
		for (int i = 0; i < ispiti.size(); i++) {
		
			ispiti.get(i).stampaj();
			
		}
		
		double prosecnaOcena = 0;
		
		for (int i = 0; i < ispiti.size(); i++) {
			prosecnaOcena = prosecnaOcena + ispiti.get(i).getOcena();
		}
		prosecnaOcena = prosecnaOcena / ispiti.size();
		System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

		System.out.println();

	}

}
