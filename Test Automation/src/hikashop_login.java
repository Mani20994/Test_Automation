import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hikashop_login {
	
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
	
	//kids
	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[2]/div/ul/li[3]/a")).click();
	
	//mouse hover 
	Actions action=new Actions(driver);
	 action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div/div[1]"))).build().perform();
	
	 // grey sneakers add to wish list
	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div/div[2]/a[2]/span")).click();
	
	//mouse hover
	Actions action1=new Actions(driver);
	 action1.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div/div[1]"))).build().perform();
	
	 //grey sneakers add to cart
	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[2]/div/div/div[2]/a[1]/span")).click();
	
	 //Scroll Down-up
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)", "");
	
	/*// blue sneakers wish list
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[8]/div/div/div[2]/a[2]/span")).click();
	*/
	Actions action2=new Actions(driver);
	action2.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[4]/div/div/div[1]"))).build().perform();
	
	//green shoes wish list
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[4]/div/div/div[2]/a[2]/span")).click();
	
	Actions action3=new Actions(driver);
	action3.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[4]/div/div/div[1]"))).build().perform();
	
	//green shoes add to cart
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/ul/li[4]/div/div/div[2]/a[1]/span")).click();
		
	 
	 //checkout
	 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/a/span")).click();
	
	
	 Thread.sleep(5000);
	 //Scroll Down-up
	 JavascriptExecutor jsea=(JavascriptExecutor)driver;
	 jsea.executeScript("window.scrollBy(0,250)", "");
	 Thread.sleep(5000);
	
	 JavascriptExecutor jseb=(JavascriptExecutor)driver;
	 jseb.executeScript("window.scrollBy(250,500)", "");
	 Thread.sleep(5000);
	
	//quantity for grey sneakers
		//driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[2]/table/tbody/tr[1]/td[4]/input")).sendKeys("1");
		
		//quantity for green sneakers
		//driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[2]/table/tbody/tr[2]/td[4]/input")).sendKeys("1");
		
		Thread.sleep(2000);
	 //next
	 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[4]/div[2]/button")).click();
	
	 
	/* //Scroll Down-up
	 JavascriptExecutor jsei=(JavascriptExecutor)driver;
	 jsei.executeScript("window.scrollBy(0,250)", "");
		
	//Scroll Down-up
	JavascriptExecutor jsep=(JavascriptExecutor)driver;
	jsep.executeScript("window.scrollBy(250,500)", "");
	Thread.sleep(3000);*/
	
	/* //delivery date
	 driver.findElement(By.xpath(".//*[@id='deliverydate_input']s")).click();
	 
	 //date
	 driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[4]/td[3]/a")).click();*/
	
	 Thread.sleep(3000);
	
	 //credit card name
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/table/tbody/tr[1]/td/div[2]/dl/dd[1]/input")).sendKeys("aish");
	Thread.sleep(3000);
	
	//credit card number
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/table/tbody/tr[1]/td/div[2]/dl/dd[2]/input")).sendKeys("123254367");
	Thread.sleep(3000);
	
	//expiration month
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/table/tbody/tr[1]/td/div[2]/dl/dd[3]/input[1]")).sendKeys("12");
	Thread.sleep(3000);
	 
	//expiration year
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/table/tbody/tr[1]/td/div[2]/dl/dd[3]/input[2]")).sendKeys("22");
		
	//submit
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/table/tbody/tr[1]/td/div[2]/div/button")).click();
		
	
	
	
	
	
	
	
	 //	next	
	 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[6]/div[2]/button")).click();
	 
	 Thread.sleep(3000);
	 
	 //Scroll Down-up
	JavascriptExecutor jseo=(JavascriptExecutor)driver;
	jseo.executeScript("window.scrollBy(250,500)", "");
	Thread.sleep(3000);
	 //box
	 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[5]/label")).click();
	//finish
	 driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/div/div[6]/div[2]/button")).click();
	
	 //logout
	 Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[2]/div/div/div/div/div[2]/div/div/div[6]/div/div/form/div[2]/input[1]")).click();

	Thread.sleep(3000);
	driver.close();
	
	

}
}