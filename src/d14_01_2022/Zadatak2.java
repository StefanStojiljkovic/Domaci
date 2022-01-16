package d14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		Proizvod proizvod1 = new Proizvod("353", "So", 25);
		Proizvod proizvod2 = new Proizvod("211", "Jabuka", 50);
		Proizvod proizvod3 = new Proizvod("952", "Krompir", 30);
		
		Vaga vaga1 = new Vaga();
		vaga1.setMernaJedinica("Kg");
		vaga1.setProizvod(proizvod1);
		
		Vaga vaga2 = new Vaga();
		vaga2.setMernaJedinica("Lb");
		vaga2.setProizvod(proizvod2);
		
		Vaga vaga3 = new Vaga();
		vaga3.setMernaJedinica("Kg");
		vaga3.setProizvod(proizvod3);
		vaga1.stampaj(3);
		vaga2.stampaj(5);
		vaga3.stampaj(6);
	}

}
