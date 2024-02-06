package org.sriram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTwo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
//	WebElement Dropdown = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//	
//	Dropdown.click();
//	Select s = new Select(Dropdown);
//	s.selectByIndex(0);
//	Thread.sleep(1000);
//	s.selectByValue("Google");
//	Thread.sleep(1000);
//	s.selectByVisibleText("Iphone");
//	
//	List<WebElement> options = s.getOptions();
//	for (int i = 0; i < options.size(); i++) {
//		WebElement element = options.get(i);
//		String Values = element.getText();
//		System.err.println(Values);
		
		WebElement Mvdropdown = driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Mvdropdown.click();
		Select s = new Select(Mvdropdown);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByIndex(3);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < allSelectedOptions.size(); i++) {
		WebElement webElement = allSelectedOptions.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
	}
		
		
		
	}
	
		
		
		
	}
	
	

