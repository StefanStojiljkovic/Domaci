package d10_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1

		FacebookPost post1 = new FacebookPost();
		post1.imeKorisnika = "Stefan Stojilkovic";
		post1.gdeJeObjavljeno = "Mitar Miric";
		post1.tekst = "Dobar dan svima!";
		post1.brojLajkova = 8;
		post1.brojDeljenja = 22;
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.dislike();
		post1.share();
		post1.share();
		post1.share();
		post1.share();
		post1.print();
		
		
		System.out.println();
		
		
		FacebookPost post2 = new FacebookPost();
		post2.imeKorisnika = "Ana Vulic";
		post2.gdeJeObjavljeno = "Aco Pejovic";
		post2.tekst = "Najbolji si!";
		post2.brojDeljenja = 7;
		post2.brojLajkova = 3;
		post2.like();
		post2.like();
		post2.like();
		post2.like();
		post2.dislike();
		post2.dislike();
		post2.dislike();
		post2.share();
		post2.share();
		post2.print();
		

	}
	
	

}
