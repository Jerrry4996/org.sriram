package org.sriram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeliniumTestclass {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/popups");
		
		//simpleAlert
		WebElement simpleAlert = driver.findElement(By.name("alert"));
		simpleAlert.click();
		
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// confirmalert
		WebElement confirmArlert = driver.findElement(By.name("confirmation"));
		confirmArlert.click();
		Thread.sleep(2000);
		Alert confirmA = driver.switchTo().alert();
		confirmA.dismiss();

		
		// pormpt alert
		
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		String sriram ="sriram";
		promptAlert.sendKeys(sriram);
		
		String alertMessage = promptAlert.getText();
		System.out.println(alertMessage);
		
}
}