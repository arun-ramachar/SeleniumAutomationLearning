package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();//to navigate back
		
		driver.navigate().forward();//to navigate forward
		
		driver.navigate().refresh(); //refresh or reload page..
		
		
		//whats the difference between get and navigateto()
		//

	} 

}
