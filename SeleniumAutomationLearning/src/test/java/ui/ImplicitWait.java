package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static String browser = "chrome";

//	 webdriver is a interface we can create reference for 
//	 interface we cant create objects for interface
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		

		

			if (browser.equals("firefox")) {
				WebDriverManager.chromedriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			driver.get("https://www.ebay.com.au");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//thread .sleep is a hard code not recomendded
			//bcoz if u say 2000 milliseconds it will wait 2000 sec../
			//but implicit wait wont wait 2sec it will access fast..only 
			//its wait if dont get element...depend on sec
			WebElement element = driver.findElement(By.xpath(" //*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(element).perform();
			
           // WebElement wait= new WebDriverWait(driver, timeOutInSeconds:10);
            
//			wait.until(ExpectedConditions.visibilityOfElementLocated(
//      By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
			
			driver.close();
	}

	
}
