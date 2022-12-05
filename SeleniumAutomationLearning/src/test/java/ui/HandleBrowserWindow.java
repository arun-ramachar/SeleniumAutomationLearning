package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle..returns the ID of the window
		//getWindowHandles..returns the multiple id of the window
		
		
		String windowID=driver.getWindowHandle();//retrun ID of the single browser window
		
		System.out.println(windowID);
		
		
		
		
	}

}
