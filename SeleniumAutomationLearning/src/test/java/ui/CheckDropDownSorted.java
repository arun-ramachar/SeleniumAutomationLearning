package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/newsearchserviceneed']")).click();
		
		WebElement drpElement = driver.findElement(By.name("category_id"));
		
		Select select = new Select(drpElement);
		
		List<WebElement> options=select.getOptions();
		
		ArrayList originalList= new ArrayList();
		ArrayList tempList = new ArrayList();
		
		for(WebElement option: options) {
			
			originalList.add(option.getText());
			tempList.add(option.getText());
			
		}
		System.out.println("Original List:"+ originalList);
		System.out.println("temp List:"+ tempList);
		
		Collections.sort(tempList);
		
		System.out.println("Original List:"+ originalList);
		System.out.println("temp List:"+ tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("sorted");
		}
			else  {
				System.out.println("unsorted");
			
		}
	}

}
