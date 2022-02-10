package d08_02_2022;
import d08_02_2022.FormPage;

//Za potrebe zadatka kreirati FormPage koji ima sve potrebne metode.
//Zatim kreirati FormTest koji 
//Ucitava form.html stranicu (form.html je u folderu za domaci skinite je i otvorite u chrome i iskopirajte url)
//I popunjava formu koristeci FormData.xlsx fajl (u folderu je za domaci)
//Postavite odgovarajuce waitere tako da se saceka sledeci unos podataka u formu nakon submitovanja
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FormTest {

	private WebDriver driver;
	private FormPage formPage;
	private WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("file:///C:/Users/Nivak/Downloads/form%20(2).html");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert softAssertion = new SoftAssert();
		formPage = new FormPage(driver, wait);
	}

	@Test
	public void formTest() throws InterruptedException, IOException {
		File file = new File("C:\\Users\\Nivak\\Downloads/FormData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("form");
		DataFormatter format = new DataFormatter();

		for (int i = 1; i < 7; i++) {
			String fullName = format.formatCellValue(sheet.getRow(i).getCell(0));
			String gender = sheet.getRow(i).getCell(1).getStringCellValue();
			String dot = format.formatCellValue(sheet.getRow(i).getCell(2));
			String email = format.formatCellValue(sheet.getRow(i).getCell(3));
			String role = format.formatCellValue(sheet.getRow(i).getCell(4));
			String comment = format.formatCellValue(sheet.getRow(i).getCell(6));
			formPage.dataInput(fullName, gender, dot, email, role, comment);
			formPage.getSubmitButton().click();
			
			Thread.sleep(2000);
			Assert.assertTrue(formPage.isDataSaved(), "Data is not saved.");
			driver.navigate().refresh();
		}

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}

}
