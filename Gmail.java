package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
WebElement txtuser=driver.findElement(By.xpath("(//input[@type='email'])"));
txtuser.sendKeys("tommy");

WebElement btnNxt=driver.findElement(By.xpath("//span[text()='Next']"));
btnNxt.click();	
Thread.sleep(2000);

WebElement txtpass=driver.findElement(By.name("password")); 
txtpass.sendKeys("tom&jerry");

WebElement btnNext=driver.findElement(By.xpath("//span[text()='Next']")); 
btnNext.click();


	}

}
