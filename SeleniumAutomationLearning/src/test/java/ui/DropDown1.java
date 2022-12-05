package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("input-country"));
		
		Select select = new Select(dropdown);
//		select.selectByVisibleText("New Zealand");
//		//Remember u have to give specific name ..case sensitive ..
//		
//		select.selectByValue("12");//aruba
//		select.selectByIndex(13);//australia
//      //remember count from zero only but option with no value is zero..
		
		List<WebElement> list = select.getOptions();
		
		//Initially capture list of webelement
		//then we have to identify single element so we have store in webelement
		//then get text and compare to all country..if it is equal select..
		
		for(WebElement option:list) {
			if(option.getText().equals("New Zealand")) {
				option.click();
				break;
			}
		}
		//for multiple dropdowns here is the code
		
		//Select noOfEmpsDrp = new Select( driver.findElement(By.name("NoOfEmployees")));
		
		WebElement noOFEmpsEle=driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOFEmpsEle, "16-20");
		WebElement industryDrp=driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industryDrp, "healthcare");
		WebElement country=driver.findElement(By.name("Country"));
		selectOptionFromDropDown(country, "ghana");
		
		
		
		
	}
	
	  public static void selectOptionFromDropDown(WebElement ele, String value) {
		  
		        Select select = new Select(ele);
		        
		        List<WebElement> allOption=select.getOptions();
		        
		              for( WebElement element:allOption) {
		            	  
		            	  if (element.getText().equals(value)) {
		            		  element.click();
		            		  break;
		            	  }
		              }
	  }

}
