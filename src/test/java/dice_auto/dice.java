package dice_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dice {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/surkhaygurbanov/Documents/selenium dependency/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dice.com");
		
		driver.findElement(By.name("q")).sendKeys("java programmer");
		Thread.sleep(1000);
		driver.findElement(By.id("search-field-location")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("search-field-location")).sendKeys("virginia");
		Thread.sleep(1000);
		driver.findElement(By.id("findTechJobs")).click();
		
		String texty=driver.findElement(By.id("posiCountId")).getText();
		
		//String str = texty.getText();
		texty = texty.replace(",", "");
		System.out.println(texty);
		
	}

}
