package d13_01_2022;

import d10_01_2022.FacebookPost;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od gettera i settera:
//			korisnik moze da procita bilo koji atribut 
//			ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//			 Konstruktore:
//				konstruktori koji su potrebni i logicni
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1

		FaceBookPost1 post1 = new FaceBookPost1 ("Stefan Stojiljkovic","Mitar Miric", "Cao Mitre!", 14, 5);
		
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.dislike();
		post1.share();
		post1.print();
		System.out.println(" ");
		
		FaceBookPost1 post2 = new FaceBookPost1 (36,11);
		post2.setProfileFrom("Nikola Kojo");
		post2.setProfileTo("Marinko Rokvic");
		post2.setPost("Sve najbolje!");
		
		post2.like();
		post2.like();
		post2.like();
		post2.like();
		post2.dislike();
		post2.share();
		post2.print();
		
		

	}

}
