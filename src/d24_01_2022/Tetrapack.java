package d24_01_2022;

public class Tetrapack extends Packaging {
//	
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean isRecyclable;
	private double basicPrice;

	public Tetrapack(String barcode, String name, double netWeight, double grossWeight, boolean isRecyclable,
			double basciPrice) {
		super(barcode, name, netWeight, grossWeight);
		this.isRecyclable = isRecyclable;
		this.basicPrice = basicPrice;
	}

	public boolean isRecyclable() {
		return isRecyclable;
	}

	public void setRecyclable(boolean isRecyclable) {
		this.isRecyclable = isRecyclable;
	}

	public double getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}

	@Override
	public double price() {
		double price = 0;

		if (this.isRecyclable == true) {
			price = this.weight() * 1.5 + this.basicPrice;
		} else {
			price = this.basicPrice;
		}
		return price;
	}

	@Override
	public void print() {
		System.out.println("Pakovanje ");

		if (this.isRecyclable == true) {
			System.out.println(" se moze reciklirati, osnovna cena pakovanje iznosi " + this.basicPrice
					+ "din, a ukupna cena je " + this.price() + "din");
		} else {
			System.out.println(" se ne moze reciklirati " + this.price() + "din");
		}

	}

}
