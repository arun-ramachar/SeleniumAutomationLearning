package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();

		 
		 driver.get("https://itera-qa.azurewebsites.net/home/automation");
		 
		 WebElement element=driver.findElement(By.xpath("//input[@id='sunday']"));
		 
		 Actions action = new Actions(driver);
		 
		 action.moveToElement(element);
		 action.perform();
		 //how to check specific check box
		 
		 //driver.findElement(By.xpath("//input[@id='monday']")).click();
		 
		 //how to select all check boxes
		 
		 List<WebElement> elements=driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,'day')]"));
		 
		 System.out.println("total no of check boxes:"+ elements.size());
		 
	     //using for loop
//		 
//		  for(int i=0;i<elements.size();i++) {
//			  elements.get(i).click();
//		  }
		  
//		  //using for each loop
//          for(WebElement ele: elements) {
//        	  
//        	  ele.click();
//          }
          
          //how to select check box y chocie:
          
//          for(WebElement ele: elements) {
//        	  
//        	  String checkboxname = ele.getAttribute("id");
//        	  
//        	  if(checkboxname.equals("monday") || checkboxname.equals("sunday")) {
//        		  ele.click();        	 
//        		  }
//          }
          
          //select last 2 check boxes..
          //note: when we use int use get
                int chkbox=elements.size();
                
//                for(int i=chkbox-2;i<chkbox;i++) {
//                	 elements.get(i).click();
//                }
                for(int i=0;i<chkbox-5;i++) {
               	 elements.get(i).click();
               }
               
                
	}

}
