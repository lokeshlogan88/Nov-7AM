package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeXpath {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver ();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement txtName=driver.findElement(By.xpath("(//input[@placeholder='First Name'])"));
	txtName.sendKeys("greens");
	
	WebElement txtLastName=driver.findElement(By.xpath("(//input[@placeholder='Last Name'])"));
	txtLastName.sendKeys("tech");
	
	WebElement txtadds=driver.findElement(By.xpath("(//textarea[@rows='3'])"));
	txtadds.sendKeys("OMR");
	
	WebElement txtemail=driver.findElement(By.xpath("(//input[@type='email'])"));
	txtemail.sendKeys("Jerry@gmail.com");
	
	WebElement txtphno=driver.findElement(By.xpath("(//input[@type='tel'])"));
	txtphno.sendKeys("9874563210");
	
	WebElement btnmale=driver.findElement(By.xpath("(//input[@type='radio'])"));
	btnmale.click();
	
	WebElement ckbox=driver.findElement(By.xpath("(//input[@type='checkbox'])"));
	ckbox.click();
	
	WebElement txtLan=driver.findElement(By.xpath("(//div[@id='msdd'])"));
	txtLan.click();
	
	Select txtLang=new Select(driver.findElement(By.id("msdd")));
	txtLang.selectByVisibleText("English");
	
	WebElement selskills=driver.findElement(By.xpath("(//select[@id='Skills'])"));
	selskills.click();
	
	Select selskill=new Select(driver.findElement(By.id("Skills")));
	selskill.selectByVisibleText("Excel");
	
	WebElement selcount=driver.findElement(By.xpath("(//select[@id='countries'])"));
	selcount.click();
	
	Select selcountr=new Select(driver.findElement(By.id("countries")));
	selcountr.selectByVisibleText("India");
	
	WebElement selLan=driver.findElement(By.xpath("(//a[@class='ui-corner-all'])"));
	selLan.click();
	

	}

}
