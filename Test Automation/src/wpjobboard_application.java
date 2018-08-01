
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wpjobboard_application {
	

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpjobboard.net/wp-admin");
		
		//user name
		driver.findElement(By.xpath("html/body/div[1]/form/p[1]/label/input")).sendKeys("user");
		//password
		//driver.findElement(By.xpath("html/body/div[1]/form/p[2]/label/input")).sendKeys("user");
		//login button
		driver.findElement(By.xpath("html/body/div[1]/form/p[4]/input[1]")).click();
		//job board
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/ul/li[3]/a/div[3]")).click();
		//application
		driver.findElement(By.xpath("html/body/div/div[1]/div[2]/ul/li[3]/ul/li[3]/a")).click();
		//add new
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[3]/h1/a")).click();
		//name
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[2]/form/div/div/div[1]/div/div/table/tbody/tr[1]/td/input")).sendKeys("Aish");
		//
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[2]/form/div/div/div[1]/div/div/table/tbody/tr[2]/td/input")).sendKeys("Aishwaryadinni98@gmail.com");
		//message
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[2]/form/div/div/div[1]/div/div/table/tbody/tr[3]/td/textarea")).sendKeys("asfdfgf");
		//save application
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div[2]/form/div/div/div[1]/p/input")).click();
		//logout (mouse hover)
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/ul[2]/li/a/span"))).build().perform();
		//logout
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div/div[2]/div[1]/div/ul[2]/li/div/ul/li[3]/a")).click();
		driver.close();


	}
}