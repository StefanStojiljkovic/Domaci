package d18_01_2022;

import java.util.ArrayList;

public class Student {

//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
	
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
	
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	private String brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> listaIspita = new ArrayList<Ispit>();

	public Student() {

	}

	public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
	public ArrayList<Ispit> getListaIspita() {
		return listaIspita;
	}
	
//	metodu dodaj ispit u niz ispita

	public void dodajIspit(Ispit ispit) {
		this.listaIspita.add(ispit);
	}
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
	
	private double prosekOcena() {
		double zbirOcena = 0;
		double brojPolozenih = 0;
		double prosek = 0;
		
		for(int i = 0; i < listaIspita.size(); i++) {
			
			if (this.listaIspita.get(i).daLiJePolozen()) {
				zbirOcena = zbirOcena + this.listaIspita.get(i).getOcena();
				brojPolozenih = brojPolozenih + 1;
				
			} else {
				zbirOcena = 0;
				brojPolozenih = 0;
				
			}
			
		}
		return prosek = zbirOcena / brojPolozenih;
		
	}
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	public void stampajListuIspita() {
		System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		
		for (int i = 0; i < listaIspita.size(); i++) {
			this.listaIspita.get(i).stampaj();
		}
		System.out.println();
		System.out.println("Prosecna ocena: " + prosekOcena());
	}
		
	}
	


