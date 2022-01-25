package d24_01_2022;

public class GlassPackaging extends Packaging {

//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double deposit;
	private boolean isDepositPaid;
	private double basicPrice;

	public GlassPackaging(String barcode, String name, double netWeight, double grossWeight, boolean isDepositPaid,
			double basicPrice) {
		super(barcode, name, netWeight, grossWeight);
		this.deposit = deposit;
		this.isDepositPaid = isDepositPaid;
		this.basicPrice = basicPrice;
	}

	public GlassPackaging(String barcode, String name, double netWeight, double grossWeight, double deposit, boolean isDepositPaid,
			double basicPrice) {
		super(barcode, name, netWeight, grossWeight);
		this.deposit = deposit;
		this.isDepositPaid = isDepositPaid;
		this.basicPrice = basicPrice;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public boolean isDepositPaid() {
		return isDepositPaid;
	}

	public void setDepositPaid(boolean isDepositPaid) {
		this.isDepositPaid = isDepositPaid;
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
		if (this.isDepositPaid == true) {
			price = this.basicPrice * 1.2 + this.deposit;
		} else {
			price = this.basicPrice * 1.2;
		}
		return price;
	}

	@Override
	public void print() {
		System.out.println("Za staklenu flasu se");

		if (this.isDepositPaid == true) {
			System.out.println(" placa deposit od " + this.deposit + "din.Osnovna cena flase iznosi " + this.basicPrice
					+ "din, a ukupna cena je " + this.price() + "din");
		} else {
			System.out.println("ne placa se deposit. Osnovna cena flase je " + this.basicPrice
					+ "din, a ukupna cena je " + this.price() + "din");
		}

	}
}
