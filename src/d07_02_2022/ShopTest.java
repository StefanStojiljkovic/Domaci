package d07_02_2022;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022.NavigationPage;
import d07_02_2022.ProductPage;
import java.io.File;
//2.Zadatak
//Napisati test koji:
//Ucitava stranicu http://cms.demo.katalon.com/
//Vrsi klik na Shop link iz navigacije
//Otvara stranicu prvog proizvoda klikom na karticu prvog proizvoda
//Dodaje proizvod u korpu sa kolicinom 2
//Verifikuje poruku nakon dodavanja “has been added to your cart.”
//Odlazi u korpu klikom na dugme VIew Cart
//Verifikuje stanje u korpi, tj. da postoji proizvod sa kolicinom 2.
//Brise stavku iz korpe klikom na dugme x.
//Verifikuje poruku za praznu korpu.
//Osmislite pageve za ovaj zadatak!

public class ShopTest {
	private WebDriver driver;
	private WebDriverWait wait;
	private NavigationPage navigate;
	private ProductPage product;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		navigate = new NavigationPage(driver);
		product = new ProductPage(driver, wait);
		driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://cms.demo.katalon.com/");
	}

	@Test
	public void Form() {
		navigate.getShopButton().click();
		product.getProduct(1).click();
		product.getNumber().clear();
		product.getNumber().sendKeys("2");
		product.getAddCartButton().click();
		product.waitForMessage();
		product.getViewCart().click();
		Assert.assertTrue(product.enoughProducts(), "Not added 2");
		product.getRemoveButton().click();
		Assert.assertTrue(product.isDeleted(), "Not all items have been deleted.");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}