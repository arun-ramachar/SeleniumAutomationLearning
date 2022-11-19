package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed  //isEnabled
		WebElement searchStore = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		
		System.out.println("Display status:" +searchStore.isDisplayed());
		System.out.println("Display status:" +searchStore.isEnabled());
		
		
		WebElement male = driver.findElement(By.xpath("//*[@id='gender-male']"));
		
		//*[@id="gender-female"]
		WebElement female = driver.findElement(By.xpath("//*[@id='gender-female']"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

	}

}
