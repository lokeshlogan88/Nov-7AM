package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
        WebElement txtUser=driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
		txtUser.sendKeys("jerry");

		WebElement txtPass=driver.findElement(By.xpath("(//input[@data-testid='royal_pass'])"));
		txtPass.sendKeys("sairam");
		
		WebElement btnmale=driver.findElement(By.xpath("(//input[@value='2'])"));
		btnmale.click();
		
		WebElement btnLogin=driver.findElement(By.xpath("(//input[@data-testid='royal_login_button'])"));
		btnLogin.click();
		
		
		
	
		
	}

	}


