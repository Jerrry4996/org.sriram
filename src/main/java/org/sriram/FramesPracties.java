package org.sriram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesPracties {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		WebElement topic = driver.findElement(By.xpath("//input[@type='text']"));
		topic.sendKeys("not a Friendly Topic");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium [Python]']"));
		selenium.click();
		
		driver.switchTo().defaultContent();
		WebElement checkbok = driver.findElement(By.xpath("//a[text()='Home']"));
		checkbok.click();
	}
	

}
