package org.table;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement totalbody = driver.findElement(By.tagName("tbody"));
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		
		for(int i=0; i<trows.size();i++) {
			
				WebElement arows = trows.get(i);
				List<WebElement> adata = arows.findElements(By.tagName("td"));
				
				for(int j = 0; j<adata.size();j++) {
					
					WebElement sadata = adata.get(j);
					String text = sadata.getText();
					System.out.println(text);
							
						}				
			}
		       TakesScreenshot tk = (TakesScreenshot)driver;
	           File source = tk.getScreenshotAs(OutputType.FILE);
	           File dest = new File(".\\ScreenshotRecord\\report4.png");
	           FileUtils.copyFile(source, dest);
            
	           JavascriptExecutor j = (JavascriptExecutor)driver;
	           j.executeScript("window.scrollBy(0,800)");
	           
	           File source1 = tk.getScreenshotAs(OutputType.FILE);
	           File dest1 = new File(".\\ScreenshotRecord\\report5.png");
	           FileUtils.copyFile(source1, dest1);
				
		           
		           
		

		}
	}