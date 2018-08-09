

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WPJobBoard_demo {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpjobboard.net/wp-admin");
		
		//username
		driver.findElement(By.xpath("html/body/div[1]/form/p[1]/label/input")).sendKeys("user");
		//password
		//driver.findElement(By.xpath("html/body/div[1]/form/p[2]/label/input")).sendKeys("user");
		//login button
		driver.findElement(By.xpath("html/body/div[1]/form/p[4]/input[1]")).click();
		//job board
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/ul/li[3]/a/div[3]")).click();
		//add new
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[3]/h1/a")).click();
		//job title
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[1]/td/input")).sendKeys("Tester");
		
		Thread.sleep(10000);
		//description
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[2]/td/div/div/div/div/div[2]")).sendKeys("job description");
		//job type
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[3]/td/select")).click();
		//full time
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[3]/td/select/option[2]")).click();
		//category
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[4]/td/select")).click();
		//copywriting
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[1]/div/table/tbody/tr[4]/td/select/option[1]")).click();
		//company name
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[2]/div/table/tbody/tr[1]/td/input")).sendKeys("Mindsnxt");
		//contact email
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td/input")).sendKeys("abdulkhadercse@gmail.com");
		//country
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[3]/div/table/tbody/tr[1]/td/select")).click();
		//India
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[3]/div/table/tbody/tr[1]/td/select/option[102]")).click();
		//state
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/input")).click();
		//Kar
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[3]/div/table/tbody/tr[2]/td/input")).sendKeys("karnataka");
		//city
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div[3]/div/table/tbody/tr[4]/td/input")).sendKeys("kalburgi");
		//polish
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/p/input")).click();
		
		//logout (mouse hover)
		//Actions action=new Actions(driver);
	    //action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/ul[2]/li/a"))).build().perform();
	    //logout
	    //driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/ul[2]/li/div/ul/li[3]/a")).click();
	}

}
