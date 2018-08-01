import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.hikashop.com/index.php/en/");
	
	//login
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[3]/div/div/h3/span/span")).click();
	Thread.sleep(5000);
	//login button
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[3]/div/div/div/div[1]/form/div/div[4]/div/button")).click();
	Thread.sleep(3000);
	
	//women
	driver.findElement(By.xpath(".//*[@id='category_pane_0']/div/ul/li[2]/a")).click();
	
	//Scroll Down-up
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
	
		//mouse hover 
		Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath(".//*[@id='hikashop_category_information_module_110']/div/div/div[1]/ul/li[4]/div/div/div[1]"))).build().perform();
		
	//Grey stiletto add to cart
		 driver.findElement(By.xpath(".//*[@id='hikashop_category_information_module_110']/div/div/div[1]/ul/li[4]/div/div/div[2]/a[1]/span")).click();
			
		//checkout
		 driver.findElement(By.xpath(".//*[@id='hikashop_cart_100']/a/span")).click();
		
		
		 Thread.sleep(5000);
		 //Scroll Down-up
		 JavascriptExecutor jsea=(JavascriptExecutor)driver;
		 jsea.executeScript("window.scrollBy(0,250)", "");
		 
		 Thread.sleep(5000);
		 JavascriptExecutor jseb=(JavascriptExecutor)driver;
		 jseb.executeScript("window.scrollBy(250,500)", "");
		 Thread.sleep(5000);
		
		 
		 //next
		 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[4]/div[2]/button")).click();
		 Thread.sleep(10000);
		 
	/*	//Scroll Down-up
		 JavascriptExecutor jsei=(JavascriptExecutor)driver;
		 jsei.executeScript("window.scrollBy(0,250)", "");
			
		//Scroll Down-up
		JavascriptExecutor jsep=(JavascriptExecutor)driver;
		jsep.executeScript("window.scrollBy(250,500)", "");
		Thread.sleep(3000);*/

		/* //credit card name
		driver.findElement(By.xpath(".//*[@id='hikashop_checkout_payment_3_3__1__card']/dl/dd[1]/input")).sendKeys("aish");
		Thread.sleep(3000);
		
		//credit card number
		driver.findElement(By.xpath(".//*[@id='hk_co_p_c_1']")).sendKeys("123254367");
		Thread.sleep(3000);
		
		//expiration month
		driver.findElement(By.xpath(".//*[@id='hk_co_p_c_e_1']")).sendKeys("12");
		Thread.sleep(3000);
		 
		//expiration year
		driver.findElement(By.xpath(".//*[@id='hikashop_checkout_payment_3_3__1__card']/dl/dd[3]/input[2]")).sendKeys("22");
			
		//submit
		driver.findElement(By.xpath(".//*[@id='hikashop_checkout_payment_3_3__1__card']/div/button")).click(); */
			
		
	}
}