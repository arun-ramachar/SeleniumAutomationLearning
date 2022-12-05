package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTestAndAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailInputBox = driver.findElement(By.id("Email"));
		
//		emailInputBox.clear();
//		emailInputBox.sendKeys("adm123@gmail.com");
		
	    System.out.println(emailInputBox.getAttribute("value"));
	    
	    
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='log in]"));
		button.getText();//u will get inner text ..//not attribute...
	}

}
