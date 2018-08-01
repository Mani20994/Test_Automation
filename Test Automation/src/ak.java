import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ak {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
	
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("abdulkhadercse");
		
		
		
	}

}
