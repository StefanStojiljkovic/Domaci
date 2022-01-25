package d24_01_2022;

public abstract class Packaging {

//	Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//		abstraktnu metodu koja vraca cenu artikla
//		abstraktnu metodu stampaj

	protected String barcode;
	protected String name;
	protected double netWeight;
	protected double grossWeight;

	public Packaging() {
		super();
	}

	public Packaging(String barcode, String name, double netWeight, double grossWeight) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}

	public double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		this.grossWeight = grossWeight;
	}

//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	public double weight() {
		double weight = this.grossWeight - this.netWeight;
		return weight;
	}

	public abstract double price();

	public abstract void print();

}
