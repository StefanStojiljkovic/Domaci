package d24_01_2022;

import java.util.ArrayList;

public class Cart {
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
//		kao parametar funkcije se prima Super karticu iz koje se cita popust.

	ArrayList<Packaging> Packagings = new ArrayList<Packaging>();

	public void addPackaging(Packaging p) {
		this.Packagings.add(p);
	}

	public void removePackaging(String barcode) {
		for (int i = 0; i < Packagings.size(); i++) {

			if (this.Packagings.get(i).getBarcode().equals(barcode)) {
				this.Packagings.remove(i);
			}
		}
	}

	private double discountedPrice(int discount) {
		double discountedPrice = 0;

		for (int i = 0; i < Packagings.size(); i++) {
			discountedPrice = discountedPrice(this.Packagings.get(i).price() - discount);

		}
		return discountedPrice;
	}

	private double discountedPrice(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double priceSumm(SuperCard card) {
		double priceSumm = 0;

		priceSumm = this.discountedPrice(card.getDiscount());

		return priceSumm;
	}

}
