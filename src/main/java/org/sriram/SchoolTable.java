package org.sriram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SchoolTable {
	static int rowNumber;
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\org.sriram\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		// To get a size of the entire table
		
		List<WebElement> entireTableRowSize = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int size = entireTableRowSize.size();
		System.out.println("entireTableRowSize :" + entireTableRowSize.size());
		
		// to get table header row count
		
		int headerrowsize = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr")).size();
		System.out.println("headerrowsize :" + headerrowsize);
		
		// to get table body count
		
		int bodyrowsize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		System.out.println("bodyrowsize :" + bodyrowsize);
		
		// to get the coloum size of the table
		
		int columsize = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
		System.out.println("columsize :" + columsize);
		
		// to  get the particular coloumvalue for all the rows 
		for (int i = 1; i <=bodyrowsize; i++) {
			String text = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+ i +"]//td[1]")).getText();
			System.out.println(text);
			
		}
		
		//To get aparticular row value 
		for (int j = 1; j <=columsize ; j++) {
			String rowvalue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td["+ j +"]")).getText();
			System.out.println("particular row value -->"+ rowvalue);
		 
			
		}
		// to get a  text avilable in the row position of
		  for (int i = 1; i<= bodyrowsize; i++) {
			  
			  String text = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+ i +"]//td[1]")).getText();
			  if (text.contains("Central Bank")) {
				  System.out.println("text avilable in the row position of -->"+ i);
				  rowNumber=i;
		}
			
		}
		// to get a particular row value of selected text
		  for (int k = 1; k <=columsize; k++) {
				String rowvalue = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+rowNumber+"]//td["+ k +"]")).getText();
				System.out.println("particular row value of selected text -->"+ rowvalue);
			  
			
		}
	}
                 	


}
