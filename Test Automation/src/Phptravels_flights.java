import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Phptravels_flights {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/admin");
		
		//admin back-end

		//email
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@phptravels.com");
		//passwrd
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/input[2]")).sendKeys("demoadmin");
				//button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/button[1]")).click();
		//flights
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/div[1]/div[6]/div[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(3000);
		//airport -sub
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/div[1]/div[6]/div[1]/ul[1]/li[8]/ul[1]/li[2]/a[1]")).click();
		//add
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		//code
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("BZW");
		
		//name
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("BEI WEI Arpt");
		
		//citycode
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")).sendKeys("BZW");
		
		//cityname
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]")).sendKeys("Beijing");
		
		//countryname
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]")).sendKeys("China");
		
		//countrycode
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")).sendKeys("CN");
		
		//timezone
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/input[1]")).sendKeys("8");
		
		//lat
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")).sendKeys("22.639258");
		
		//lon
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]")).sendKeys("113.810664");
		
		//city
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/input[1]")).sendKeys("true");
		
		//save and return
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		Thread.sleep(3000);
		//search
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
		//enter search values
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/input[1]")).sendKeys("BZW");
		//click on GO
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/span[1]/a[1]")).click();
	
		//logout
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
	
		//driver.close();
	
	}
	
}