package org.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeQ1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji official\\eclipseworkspace\\org.sample.selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");
		
		WebElement btnCtus=driver.findElement(By.xpath("(//a[@href='contact.php'])"));
		btnCtus.click();
		
		Thread.sleep(2000);
		
		WebElement txtName=driver.findElement(By.xpath("(//input[@type='text'])"));
		txtName.sendKeys("lokesh");
		
		WebElement txtMail=driver.findElement(By.xpath("(//input[@type='email'])"));
		txtMail.sendKeys("lokesh@gamil");
		
		WebElement txtPhon=driver.findElement(By.xpath("(//input[@name='phone'])"));
		txtPhon.sendKeys("9874563210");

		WebElement txtCours=driver.findElement(By.xpath("(//select[@name='courses'])"));
		txtCours.click();

		Select drpCourse=new Select(driver.findElement(By.name("courses")));
		drpCourse.selectByVisibleText("Selenium");
		
		WebElement txtBran=driver.findElement(By.xpath("(//select[@name='branch'])"));
		txtBran.click();
		
		Select drpBranchs=new Select(driver.findElement(By.name("branch")));
		drpBranchs.selectByVisibleText("OMR");
		
		WebElement txttime=driver.findElement(By.xpath("(//select[@name='time'])"));
		txttime.click();
		
		Select drptime=new Select(driver.findElement(By.name("time")));
		drptime.selectByVisibleText("Immediately");
		
		WebElement txtcmt=driver.findElement(By.xpath("(//textarea[@name='comments'])"));
		txtcmt.sendKeys("Good");
		
		WebElement txtBtn=driver.findElement(By.xpath("(//button[@id='submit'])"));
		txtBtn.click();

	}

}
