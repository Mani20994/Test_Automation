import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Chrome_Test {
	
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
       //WebDriver driver= new ChromeDriver();

       //for headless browser testing
       ChromeOptions options= new ChromeOptions();
       options.addArguments("window-size-1400,800");
       options.addArguments("headless");
       
       WebDriver driver= new ChromeDriver(options);
       
      driver.manage().window().maximize();
       driver.get("https://classic.crmpro.com/index.html");

       System.out.println("Login page title=="+driver.getTitle());
       
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("priya1");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Minds123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);
	
        System.out.println("Home page title=="+driver.getTitle());
	
	}	
	
}
