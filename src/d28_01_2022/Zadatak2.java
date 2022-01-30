package d28_01_2022;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
//		Zadatak
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.
		
		
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		int add = 4;
		
		for (int i = 0; i < 5; i++) {
			
			driver.findElement(By.xpath("//button[@class='btn btn-info add-new']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Stefan");
			driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Vezba");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("Selenium");
			driver.findElement(By.xpath("(//a[@class='add'])[" + add + "]")).click();
			Thread.sleep(2000);
			add = add + 1;
			
		}
		
		driver.close();
	}
	
}


