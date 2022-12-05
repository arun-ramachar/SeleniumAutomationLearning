package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Auckland");
		

		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(Keys.ENTER);
		
		
	}

}
