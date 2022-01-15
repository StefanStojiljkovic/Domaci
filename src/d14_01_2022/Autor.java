package d14_01_2022;

public class Autor {
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
//
//		U glavnom programu napraviti vise autora sa vise knjiga.
	
	private String firstName;
	private String lastName;
	
	public Autor() {
		
	}
	public Autor(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void stampaj() {
		System.out.println(firstName + " " + lastName);
	}
	
	
	
	
	
	

}
