package d21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {

//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String imeIPrezime, ArrayList<Sektor> sektoriUKojimaRadi) {
		super(imeIPrezime, sektoriUKojimaRadi);

	}

	private double prosecnaPlata() {
		double suma = 0;

		for (int i = 0; i < sektoriUKojimaRadi.size(); i++) {
			suma = suma + sektoriUKojimaRadi.get(i).getPlataSektora();

		}

		double prosecnaPlata = suma / sektoriUKojimaRadi.size() * 0.5;
		return prosecnaPlata;
	}

	@Override
	public double plata() {
		double plata = this.prosecnaPlata() * sektoriUKojimaRadi.size();

		return plata;
	}

}
