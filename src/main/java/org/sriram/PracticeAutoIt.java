package org.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.IOException;


public class PracticeAutoIt {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAwvKtBhDrARIsAJj-kTjf46yO-vmtoNtnJjWbaXY4RCHLmHK3Wzjcpeyai8CR4nkRUq60ZCMaAnbKEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement Upload = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		Upload.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\FileUpload.exe");
		
		
	
		
		
	}

}
