package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComtainsText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		
		WebElement txtname=driver.findElement(By.xpath("//p[contains(text(),'Greens Technology,')]"));
		String name=txtname.getText();
		System.out.println(name);
		
		WebElement txtname1=driver.findElement(By.xpath("//p[contains(text(),'Learn ')]"));
		String name1=txtname1.getText();
		System.out.println(name1);

		driver.quit();
		
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();		


	}

}
