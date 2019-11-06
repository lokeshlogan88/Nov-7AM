package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		driver.manage().window().maximize();
		
		WebElement btnCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions move=new Actions(driver);
		move.moveToElement(btnCourses).perform();
		//span[text()='Oracle Training ']
		//span[text()='Oracle DBA Training']
		
		WebElement btnOracle=driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		Actions move1=new Actions(driver);
		move1.moveToElement(btnOracle).perform();
		
		WebElement btnOracleDBA=driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		Actions move3=new Actions(driver);
		btnOracleDBA.click();
		
	}

}
