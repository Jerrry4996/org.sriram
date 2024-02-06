package org.sriram;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDrag {
            public static void main(String[] args) {
            	System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
        		WebDriver driver = new EdgeDriver();
        		driver.get("https://demo.guru99.com/test/drag_drop.html");
        		driver.manage().window().maximize();
        		
        		WebElement drag = driver.findElement(By.xpath("//a[contains(text(), 'BANK ')]"));
        		WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder']"));
        		WebElement drag1 = driver.findElement(By.xpath("//a[contains(text(), ' 5000 ')]"));
        		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
            Actions ac =new Actions(driver);
            ac.dragAndDrop(drag, drop).perform();
            ac.dragAndDrop(drag1, drop1).perform();
            }
	
	
}
