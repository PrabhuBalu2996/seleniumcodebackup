package org.table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
	click.click();
	
	WebElement fname = driver.findElement(By.xpath("//input[@type='text']"));
	fname.sendKeys("prabhu");
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(9);
	
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByValue("12");
	
	WebElement year = driver.findElement(By.id("year"));
	//Select n = new Select(year);
	Thread.sleep(2000);
	//n.selectByVisibleText("1995");
	
	year.sendKeys("1996");

	
	driver.close();
	
}
}
