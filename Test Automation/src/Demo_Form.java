import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_Form {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\zakiya\\screena.jpeg"));
		System.out.println("Saved the screenshot");
		
		/*Get Title*/
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);
	   
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		//firstname
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Sam");
	
		//lastname
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Bing");
		
		//sex
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		
		//years of experience
		driver.findElement(By.xpath("//input[@id='exp-0']")).click();
		
		//date
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("20/08/18");
		
		//profession
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		
		//Profile picture
		WebElement upload=driver.findElement(By.xpath("//input[@id='photo']"));
		upload.sendKeys("E:\\shinchan.png");
				
		//Automation tool
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		//scroll down
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(100,500)");
				System.out.println("scrolled Down");
				Thread.sleep(5000);
		
		//continents
		driver.findElement(By.xpath("//select[@id='continents']")).click();
		//WebElement searchDropdownBox=driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
		driver.findElement(By.xpath(".//*[@id='continents']/option[4]")).click();
			
		//selenium commands
		driver.findElement(By.xpath(".//*[@id='selenium_commands']")).click();
		driver.findElement(By.xpath(".//*[@id='selenium_commands']/option[5]")).click();
		
		//submit button
		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		driver.close();
	}
}