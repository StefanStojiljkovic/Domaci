package d07_02_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {
//	FormTest
//	Ucitava stranicu
//	Popunite formu proizvoljnim podacima
//	Submitujte formu 
//	Proverite da li su podaci uspesno sacuvani. (imate metodu iz page-a koja vam vraca da li je uspesno sacuvano, iskorisite je)
//	U AfterClass metodi zatvaramo stranicu

	private WebDriver driver;
	private FormPage formPage;
		
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		
		formPage = new FormPage(driver);
	
	}
	@Test
	public void searchTest() throws InterruptedException {

		driver.get("file:///C:/Users/Nivak/Downloads/form.html");
	
		formPage.getFullName().click();
		formPage.getFullName().clear();
		formPage.getFullName().sendKeys("Stefan Stojiljkovic");
		Thread.sleep(1000);
		
		formPage.getGender().click();
		
		formPage.getDateOfBirth().click();
		formPage.getDateOfBirth().clear();
		formPage.getDateOfBirth().sendKeys("31.08.1995");
		
		formPage.getEmail().click();
		formPage.getEmail().clear();
		formPage.getEmail().sendKeys("nivak@gmail.com");
		
		formPage.getRole().click();
		
		formPage.getCheckBox().click();
		
		formPage.getComment().sendKeys("Pozdrav.");
		
		Thread.sleep(1000);
		
		formPage.submit();
		Thread.sleep(2000);
		formPage.uspesnoSacuvano();

}
	@AfterMethod
	public void quit() {
		
		this.driver.quit();	
	}
}
