package d04_02_2022;

public class Zadatak1 {

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Zadatak1 {
//	Napisti TestNg test koji:
//	Ucitava stranicu https://www.udemy.com/
//	U delu za pretragu ukucajte tekst “Selenium” i lupite enter
//	Sortirajte rezultate pretrage prema rejtingu (Highest Rated)
//	Dohvatite rejting prvog rezultata pretrage
//	Dohvatite rejting zadnjeg rezultata pretrage (HELP: trebace vam getText metoda)
//		[HELP] Dohvatite rejting kao listu  pa iz liste izvucite prvi i zadnji element.
//		//*[@data-purpose=\"rating-number\"]
//	Proverite da li je reting prvog veci od rejtinga zadnjeg rezultata
//	pretvaranje stringa u double link ce vam trebati za ovaj zadatak

//	
//	Umesto prvog za Udemy imamo kupujem prodajem.
//	Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
//	Ukucajte za pretragu iphone
//	postavice za valutu eure
//	Sortirajte prema ceni da bude najjefinije prvo
//	Onda izvrsite proveru sortiranja kao sto je bilo za udemy

	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	public void kupujemProdajem() throws InterruptedException {

		driver.get("https://www.kupujemprodajem.com/");

		driver.findElement(By.className("kpBoxCloseButton")).click();

		driver.findElement(By.id("searchKeywordsInput")).sendKeys("Iphone");
		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"priceSecondSelection\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//input[@action-name='currency-eur']")).click();
		driver.findElement(By.xpath("//input[@action-name='confirm']")).click();

		driver.findElement(By.xpath("//div[@id='orderSecondSelection']//span[@class='choiceLabelText']")).click();
		driver.findElement(By.xpath("//div[@data-text='Jeftinije']")).click();

		driver.findElement(By.xpath("(//input[@name='submit[search]'])[3]")).click();

		List<WebElement> cene = driver.findElements(By.xpath("//span[@class='adPrice ']"));
		String din = "din";
		String eur = "€";
		double cenaNajjeftinijeg = 0;
		double cenaNajskupljeg = 0;
		
		String najnizaCena = cene.get(0).getText();
		String najvisaCena = cene.get(cene.size() - 1).getText();

		if (najnizaCena.contains(din)) {
			najnizaCena = najnizaCena.replaceAll(din, "");
			najnizaCena = najnizaCena.trim();
			double cenaDouble = new Double(najnizaCena);
			cenaNajjeftinijeg = cenaDouble / 117;

		} else if (najnizaCena.contains(eur)) {
			najnizaCena = najnizaCena.replaceAll(eur, "");
			najnizaCena = najnizaCena.trim();
			double cenaDouble = new Double(najnizaCena);
			cenaNajjeftinijeg = cenaDouble;

		}
		if (najvisaCena.contains(din)) {
			najvisaCena = najvisaCena.replaceAll(din, "");
			najvisaCena = najvisaCena.trim();
			double cenaDouble = new Double(najvisaCena);
			cenaNajskupljeg = cenaDouble / 117;

		} else if (najvisaCena.contains(eur)) {
			najvisaCena = najvisaCena.replaceAll(eur, "");
			najvisaCena = najvisaCena.trim();
			double cenaDouble = new Double(najvisaCena);
			cenaNajskupljeg = cenaDouble;

		}
		Assert.assertTrue(cenaNajskupljeg > cenaNajjeftinijeg, "Sortiranje ne radi!");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();		
	}
}
}
