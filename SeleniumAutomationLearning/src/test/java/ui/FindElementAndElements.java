package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://demo.nopcommerce.com/");
		 
		 WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		 searchBox.sendKeys("xyz");
		 
		//div[@class='footer-upper']//a
		 WebElement element=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 System.out.println(element.getText());
		 
		 //now find elements
		 
		 List<WebElement> listelement = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		 System.out.println(listelement.size());
		 
		 
		 //in find element if locator not found give no such element found exception
		 //in findelements if locator not found give 0
		 List<WebElement> logo =driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		 System.out.println(logo.size());
	}

}
