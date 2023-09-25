package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of the web page is:"+ driver.getTitle());
		
		System.out.println("url of the web page is:"+ driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
	}
}
