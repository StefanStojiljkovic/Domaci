package d07_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
	private WebDriver driver;
//	Zadatak
//	Skinite form.html stranicu (iz ovog foldera za domaci) na svom racunaru i otvorite je u pretrazivacu, iskopirajte url stranice
//		Od klasa je potrebno:
//	FormPage koja ima:
//	getere za sve inpute
//	geter za radio - //*[@name='gender'][@value='"+ radioValue +"'] - kao parametar prima value (male/female/middle) tog radio dugmeta
//	geter za checkbox inpute - //*[@type='checkbox'][@value='"+ checkboxValue +"'] 
//	- kao parametar prima value (read_books, online_courses, opensource, tech_cons, tech_blogs, via_delivery - jednu od ovde navedenih) tog checkbox inputa
//	getter koji hvata dugme treba da ceka da element postane klikabilan pre nego sto vrati element. Koristite waiter za ovaj slucaj.
//	metodu koja vraca da li su podaci uspesno sacuvani, tako sto proverava da li element koji nosi poruku za atribut style ima vrednost "visibility: visible"
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getFullName() {
		return driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
	}
	public WebElement getGender() {
		return driver.findElement(By.xpath("//input[@value='male']"));
	}
	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getRole() {
		return driver.findElement(By.xpath("//*[@id=\"role\"]")).findElement(By.xpath("//select[@id=\"role\"]/option[3]"));
	}
	public WebElement getComment() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement getCheckBox() {
		return driver.findElement(By.xpath("/html/body/div/div/div[7]/div/div[2]/label/input"));
	}
	
	public void submit() {
		driver.findElement(By.id("submit")).click();
		
	}
	public  boolean uspesnoSacuvano() {
		boolean uspesnoSacuvano = false;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try { wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='visibility: visible']")));
		uspesnoSacuvano = true;
		} catch ( Exception e) {
			uspesnoSacuvano = false;
			
	}
		return uspesnoSacuvano;
	
	}
	
}