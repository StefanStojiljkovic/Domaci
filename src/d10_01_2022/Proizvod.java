package d10_01_2022;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

	String naziv;
	double cena;
	double tezina;
	
	public void stampaj() {
		
		System.out.print("{{" + this.naziv + "}}, ");
		System.out.print("{{" + this.cena + "}}, ");
		System.out.print("{{" + this.tezina + "}} ");
		System.out.println();
		
	}
	
	
	

}
