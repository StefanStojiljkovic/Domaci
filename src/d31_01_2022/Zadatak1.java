package d31_01_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji:
//		Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//		Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa 
//		stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//		POMOC: Brisite elemente odozdo.
//		(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		driver.manage().window().maximize();

		for (int i = 5; i > 0; i--) {
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//button[@class='close'])[last()]")).click();
			//driver.findElement(By.xpath("(//button[@class='close'])[1]")).click();
			
			try {
				WebElement e = driver.findElement(By.xpath("(//button[@class='close'])["+ i +"]"));
				
				System.out.println("Element nije obrisan.");
				
			} catch (Exception e) {
				
				System.out.println("Element je obrisan.");
				
			}
			
		}

		driver.close();
	}

}