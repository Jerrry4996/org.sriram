package org.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class ClassTwo {
	public static void main(String[] args) {
		System.setProperty("WebDriver.edge.driver","C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       
	       WebElement username = driver.findElement(By.id("email"));

	       if (username.isDisplayed()) {
	    	   String name = "sriram96@gmail.com";
	    	   username.sendKeys(name);
	    	   String attribute = username.getAttribute("value");
			if (attribute.isEmpty()) {
				System.out.println("Not accepting alphabets");
				
			}
			else if (!attribute.equals(name)) {
				System.out.println("Expected value should be: "+name+" instead we got " +attribute);
			}
			else {
				System.out.println("As per requirments Expected value entered: " + attribute);
			}
				
		}
	       else {
			System.err.println("Username text box is not displayed");
		}

	       WebElement pass = driver.findElement(By.name("pass"));
	            pass.sendKeys("8378393938372");
	       
	       WebElement forget = driver.findElement(By.linkText("Forgotten password?"));
	       String text = forget.getText();
	       System.out.println(text);
               if (forget.isEnabled()) {
            	   System.out.println(text+"is enabled");
            	   forget.click();
			}	       
               else {
				System.out.println(text+"is disabled");
			}
	       
	       
	       
	       
	       
	       
	}

}
