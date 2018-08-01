

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ecommerce {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.ecwid.com/cp/#dashboard:wizard=tiles");
		
	
		//email click
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div/div[1]/div[2]/div[1]/div[1]")).click();
		
		//email input
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("zak@gmail.com");
		
		//password click
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div/div[2]/div[2]/div[1]/div[1]")).click();
		
		//password input
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div/div[2]/div[2]/div[1]/div[1]/input")).sendKeys("zak123");
		
		//login
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div/button")).click();
		
		//catalog
		Thread.sleep(2000);
		Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[2]/div[2]/div[1]/div[2]/li[4]/a"))).build().perform();
		
	    //products
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[2]/div[2]/div[1]/div[2]/li[4]/div[2]/ul/li[1]/a")).click();
		
		//add
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/div/div[1]/button[1]")).click();
		
		//name
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/input")).sendKeys("Mindsnxt");
		
		//SKU
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/input")).sendKeys("9");
		
		//weight
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td/div/input")).sendKeys("50");
		
		//price
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td/div[2]/div[2]/span/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input")).sendKeys("100.0");
		
		//availability
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/div[3]/span[2]/a")).click();
		
		//button
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[3]/div[1]/div/div/div/div/div[4]/div/div/table/tbody/tr[1]/td/div/div[2]/div/button")).click();
		
		//A
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div/div[5]/div[1]/div/a/div")).click();
		//logout
		driver.findElement(By.xpath("html/body/div[7]/div/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div/div[5]/div[3]/div/div[3]/a")).click();
	
	
	
	
	
	
	
	
	}
}