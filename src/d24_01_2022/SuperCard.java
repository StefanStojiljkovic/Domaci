package d24_01_2022;

public class SuperCard {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	private int number;
	private String cardholderFullName;
	private double discount;

	public SuperCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperCard(int number, String cardholderFullName, int discount) {
		super();
		this.number = number;
		this.cardholderFullName = cardholderFullName;
		this.discount = discount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getUserFullName() {
		return cardholderFullName;
	}

	public void setUserFullName(String userFullName) {
		this.cardholderFullName = userFullName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void print() {
		System.out.println("Broj kartice: " + this.number + ", vlasnike je: " + this.cardholderFullName);
	}

}
