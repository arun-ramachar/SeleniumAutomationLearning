package ui;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleLinks {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		 int brokenLink = 0;
	        
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
        //driver.get("https://www.amazon.in/");
		
        driver.get("http://www.deadlinkcity.com/");
        
       
        driver.manage().window().maximize();
        
        //1. how to locate links in selenium WebDriver?
        
        //driver.findElement(By.linkText("Today's Deals")).click();
        
        //driver.findElement(By.partialLinkText("Deals")).click();
        
        //succesful output...
        
        //2.how to capture all the links from webPage ?
        
        //List<WebElement> list=driver.findElements(By.tagName("a"));
        
        //System.out.println("number of link present:" + list.size());
        
//        for(int i=0;i<list.size();i++) {
//        	
//        System.out.println(list.get(i).getText());
//        System.out.println(list.get(i).getAttribute("href"));
//        
//         
//       }
        
//        for(WebElement lists:list) {
//        	
//        	System.out.println(lists.getText());
//         System.out.println(lists.getAttribute("href"));
//        }
        
        
       // 3.  what is the broken Link? how to check broken lInk?
        
        List<WebElement> links=driver.findElements(By.tagName("a"));
        
        for(WebElement element: links) {
        	String url= element.getAttribute("href");
        	
        	if(url==null || url.isEmpty()) {
        		
        		System.out.println("URL is empty");
        		
        		continue;
        	}
        	
        	
        	//Actually url is in string format so we have to convert string url into 
        //proper url format by importing 
          URL link = new URL(url);
        	try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400) {
					System.out.println(httpconn.getResponseCode()+ url + "is" + "Broken LInk");
					brokenLink++;
				}else {
					System.out.println(httpconn.getResponseCode()+ url + "is" + "valid LInk");
				}
			} 
        	
        	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        
        
        System.out.println(brokenLink);
        driver.quit();
	}

}
