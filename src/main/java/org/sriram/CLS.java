package org.sriram;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLS {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
        // WebDriverManager.chromedriver().setup();
		   WebDriver driver = new EdgeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	        
	     //  WebElement creat = driver.findElement(By.linkText("Create new account"));
	     //  String text = creat.getText();
	      // System.out.println(text);
	      // if (creat.isEnabled()) {
        //	   System.out.println(text+"   is enabled");
        //	   creat.click();
	//	}	       
      //     else {
	//	System.out.println(text+"is disabled");
		//}
	       
	        WebElement element = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	        element.click();
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sriram");	      
	      driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("ram"); 
	      driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("srirram");
	      driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("pasword");
	      //driver.findElement(By.xpath("//input[@aria-label=\"Day\"]"));
	       driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
	    Robot r = new Robot();
	    for (int i = 0; i <3; i++) {
	      

	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
			
		}
	    r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	
    	r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);
    WebElement drop = driver.findElement(By.id("day"));
    Select s = new Select(drop);
   s.selectByIndex(23);
  
   TakesScreenshot tk = (TakesScreenshot)driver;
   File Src = tk.getScreenshotAs(OutputType.FILE);
   File des = new File("C:\\Users\\user\\eclipse-workspace\\org.sriram\\src\\main\\resources\\takes//f1.png");
   FileUtils.copyFile(Src, des);

   
   
   
   
   
   // r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);
	
	//r.keyPress(KeyEvent.VK_TAB);
	//r.keyRelease(KeyEvent.VK_TAB);
   // WebElement drop2 = driver.findElement(By.id("Month"));
  //  Select s1 = new Select(drop2);
   // s1.selectByIndex(8);
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	      // String url = driver.getCurrentUrl();
	       //System.out.println(url);
	       
	      // String title = driver.getTitle();
	    //  System.out.println(title);
	      
	  //    driver.switchTo().newWindow(WindowType.TAB);
	 //     driver.get("https://www.instagram.com/");
	      
	     // String url1 = driver.getCurrentUrl();
	    //   System.out.println(url1);
	       
	    //   String title2 = driver.getTitle();
	    //  System.out.println(title2);
	     // driver.quit();
	    //  user.sendKeys("sriram");
	     // user.clear();
	    //  user.sendKeys("sriram4996");

//driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("sriram4996");
//driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("ram");
//driver.findElement(By.xpath("//input[@aria-label=\"Day\"]")).sendKeys("23");

					
	}
	
}

