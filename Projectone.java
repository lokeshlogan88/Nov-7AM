package org.sample.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectone {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Search.sendKeys("Shoes");
		
		Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
		
	List<WebElement> items=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
	int size = items.size();
	System.out.println(size);
	
	for (WebElement x : items) {
		String text = x.getText();
		System.out.println(text);
		
		
	}
	
	//driver.quit();
		
		
	}

}
