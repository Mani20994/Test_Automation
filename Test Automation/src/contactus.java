import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath(".//a[@class='login']")).click();
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("ap.math90@gmail.com");
		driver.findElement(By.xpath(".//input[@id='passwd']")).sendKeys("pqu772_90");
		Thread.sleep(1000);
		
driver.findElement(By.xpath("//a[contains(@title, 'Contact Us')]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select")).click();
driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select/option[2]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[4]/input")).sendKeys("ap.math90@gmail.com");
		
		//driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[2]/div/select")).sendKeys("OCVAJ");
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[5]/div/input")).sendKeys("D:\\Doc_Integrated_Farming.docx");
		driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("sdsfgd");
		driver.findElement(By.xpath(".//*[@id='submitMessage']")).click();
}
}
