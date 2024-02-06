package org.sriram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowhandlePractice {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.click();
		Searchbox.sendKeys("RedmiMobiles");
		
		Thread.sleep(2000);
		WebElement Search = driver.findElement(By.id("nav-search-submit-button"));
		Search.click();
		
		Thread.sleep(2000);
		WebElement Redmimobile = driver.findElement(By.xpath("(//span[text()='Redmi A2 (Aqua Blue, 2GB RAM, 64GB Storage)'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Redmimobile);
		Redmimobile.click();
		
		Thread.sleep(1000);
	    WebElement MobilesRedmi = driver.findElement(By.xpath("(//span[text()='Redmi A2 (Aqua Blue, 2GB RAM, 64GB Storage)'])[1]"));
		MobilesRedmi.click();
		
		String ParentURL = driver.getWindowHandle();
		
		Set<String> childern = driver.getWindowHandles();
		
		for (String x : childern) {
			if (!x.equals(ParentURL)) {
				driver.switchTo().window(x);
				String name = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
				System.out.println(name);
			}
			
		}
		
		
	}
	}
	
	
	
