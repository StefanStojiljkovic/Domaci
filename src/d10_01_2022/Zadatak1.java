package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod a = new Proizvod();
		a.naziv = "Kikiriki";
		a.cena = 59.99;
		a.tezina = 120;
		
		a.povecajCenu(15.00);
		double cenaJe =  a.vratiCenuSaPopustom(10);
		int cenaPostarine = a.racunajPostarinu();
		a.stampaj();
		
		System.out.print("Cena sa popustom je: ");
		System.out.format("%.2f", cenaJe);
		System.out.println("din");
		System.out.println("Cena postarine je: " + cenaPostarine + " din");
		System.out.println(" ");
		
		
		
		
		
		Proizvod b = new Proizvod();
		
		b.naziv = "Secer";
		b.cena = 44.99;
		b.tezina = 100;
		b.stampaj();
		
		b.povecajCenu(15);
		double cenaJeSada = b.vratiCenuSaPopustom(5.00);
		int cenaPostarineJe = b.racunajPostarinu();		
		
		System.out.print("Cena sa popustom je: ");
		System.out.format("%.2f", cenaJeSada);
		System.out.println("din");
		System.out.println("Cena postarine je: " + cenaPostarine + " din");
		System.out.println(" ");
		
		
		
	}
	
	

}
