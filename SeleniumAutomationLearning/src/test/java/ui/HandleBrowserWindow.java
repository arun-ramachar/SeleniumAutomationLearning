package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
		
		
//		String windowID=driver.getWindowHandle();//Return ID of the single browser window
//		
//		System.out.println(windowID);//every time it return different id remember..
//		
		 
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
	     //first mehod..
		
//		 Iterator<String> it=windowIDs.iterator();
//		
//		 String parentID = it.next();//it gives first string element
//		 String childID = it.next();//it gives child element..
//		 
//		 System.out.println(parentID);
//		 System.out.println(childID);
		 
      // i couldnot identify the path.. please take care later..
		 
		  
		 //second method using list/ArrrayList..
		 
		 //we converted set into list by creating Arraylist..
		//ArrayList is a class.. list is a interface..
		  List<String> windowIDList = new ArrayList(windowIDs);
//		  
//		String parentWindowId=windowIDList.get(0);
//		String childWindowId = windowIDList.get(1);
//		
//		System.out.println("parentWindowId:" + parentWindowId);
//		System.out.println("childWindowId:" + childWindowId);
		
		
		
		
		//what to do with this ids?
		//ids mainly used to switch between one browser window to another browser..
		
		 //third method:
		  
		  for(String windowId:windowIDList) {
			  
			  String title =driver.switchTo().window(windowId).getTitle();
			  System.out.println(title);
		  }
		
		
		 //difference between close() and quit()..
		  //close() will close single browsere which is pointing driver..
		  
		//quit() will close all browsers...
		  
		  
	}
	

}
