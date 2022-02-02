package d31_01_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji ucitava stranicu https://geodata.solutions/
//			Bira proizvoljan Country, State i City
//			Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//			I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//			Izabrerit Country, State i City tako da imate podatke da selektujete!

		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.navigate().to("https://geodata.solutions/");
		driver.manage().window().maximize();
		
		
		Select zemlja = new Select(driver.findElement(By.id("countryId")));		
		zemlja.selectByVisibleText("Bulgaria");
		
		Thread.sleep(5000);
		
		Select okrug = new Select(driver.findElement(By.id("stateId")));	
		okrug.selectByVisibleText("Plovdiv");
		
		driver.wait(3);
		
		Select grad =  new Select(driver.findElement(By.id("cityId")));	
		grad.selectByVisibleText("Asenovgrad");
	
		

	}
}
