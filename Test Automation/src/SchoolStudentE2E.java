import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SchoolStudentE2E {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://school.demo.moodle.net/");
		driver.findElement(By.xpath(".//*[@id='page-wrapper']/nav/ul[2]/li[2]/div/span/a")).click();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("moodle");
		driver.findElement(By.xpath(".//*[@id='loginbtn']")).click();
		Thread.sleep(5000);
		
		//DropDown-Up
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(2500,-2500)");
		System.out.println("scrolled up");

		//Site Home
		driver.findElement(By.xpath(".//*[@id='nav-drawer']/nav/a[2]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,2500)");
		System.out.println("scrolled Down for second page");
		Thread.sleep(5000);
		/*driver.findElement(By.xpath(".//*[@id='region-main']/div/div/div/div/div/div/div[2]/div/div[2]/p[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='region-main']/div/div/div/div[1]/div[2]/div/div[1]/div[1]/h3/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='region-main']/div/div/div[2]/div[2]/div/div/div[1]/div[1]/h3/a")).click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(5000);*/
		
		//Calender
		driver.findElement(By.xpath(".//*[@id='nav-drawer']/nav/a[3]")).click();
		Thread.sleep(5000);
		
		
		//Logout
		driver.findElement(By.xpath(".//*[@id='action-menu-1-menubar']/div/div")).click();;
		Thread.sleep(5000);
		/*Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();*/
		driver.findElement(By.xpath(".//*[@id='actionmenuaction-6']")).click();
		driver.close();
	}

}
