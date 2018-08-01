//import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class guru_99 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		
		//email
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr47659");
		//password
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345@");
		//login
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//insurance project
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[3]/a")).click();
		Thread.sleep(3000);
		//register
		driver.findElement(By.xpath("html/body/div[4]/a")).click();
		//title
		driver.findElement(By.xpath(".//*[@id='user_title']")).click();
		
		/* //Scroll Down-up
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		*/
		//miss
		driver.findElement(By.xpath(".//*[@id='user_title']/option[3]")).click();
		//name
		driver.findElement(By.xpath(".//*[@id='user_firstname']")).sendKeys("sam");
		
		//surname
		driver.findElement(By.xpath(".//*[@id='user_surname']")).sendKeys("roa");
		
		//phone#
		driver.findElement(By.xpath(".//*[@id='user_phone']")).sendKeys("1234567891");
		
		//year
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_1i']")).click();
		
		//1995
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_1i']/option[61]")).click();
		
		//month
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_2i']")).click();
		
		//june
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_2i']/option[6]")).click();
		
		//date
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_3i']")).click();
		
		//22
		driver.findElement(By.xpath(".//*[@id='user_dateofbirth_3i']/option[22]")).click();
		//full
		driver.findElement(By.xpath(".//*[@id='licencetype_t']")).click();
	
		// licence period
		driver.findElement(By.xpath(".//*[@id='user_licenceperiod']")).click();
		
		//10years
		driver.findElement(By.xpath(".//*[@id='user_licenceperiod']/option[10]")).click();
		
		//occupation
		driver.findElement(By.xpath(".//*[@id='user_occupation_id']")).click();
		
		//student
		driver.findElement(By.xpath(".//*[@id='user_occupation_id']/option[6]")).click();
		
		
		//Scroll Down-up
		JavascriptExecutor jsa=(JavascriptExecutor)driver;
		jsa.executeScript("window.scrollBy(250,500)", "");
		Thread.sleep(3000);
		
		//address
		
		//street
		driver.findElement(By.xpath(".//*[@id='user_address_attributes_street']")).sendKeys("xyz");
		
		//city
		driver.findElement(By.xpath(".//*[@id='user_address_attributes_city']")).sendKeys("delhi");
		
		//country
		driver.findElement(By.xpath(".//*[@id='user_address_attributes_county']")).sendKeys("India");
		
		//postcode
		driver.findElement(By.xpath(".//*[@id='user_address_attributes_postcode']")).sendKeys("sy245be");
		
		//email
		driver.findElement(By.xpath(".//*[@id='user_user_detail_attributes_email']")).sendKeys("zak@gmail.com");
		
		//password
		driver.findElement(By.xpath(".//*[@id='user_user_detail_attributes_password']")).sendKeys("12345");

		//confirm password
		driver.findElement(By.xpath(".//*[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("12345");
			
		//create button
		driver.findElement(By.xpath(".//*[@id='new_user']/div[5]/input[2]")).click();
		
		
		
		//sign-in
		//email
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("zak@gmail.com");
				
		//password
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("12345");
				
		//login button
		driver.findElement(By.xpath(".//*[@id='login-form']/div[3]/input")).click();
		Thread.sleep(2000);
		
		//request quotation
		driver.findElement(By.xpath(".//*[@id='ui-id-2']")).click();
		Thread.sleep(2000);
		
		//retrieve quotation
		driver.findElement(By.xpath(".//*[@id='ui-id-3']")).click();
		Thread.sleep(2000);
		
		
		//profile
		driver.findElement(By.xpath(".//*[@id='ui-id-4']")).click();
		//Scroll Down-up
				JavascriptExecutor jsb=(JavascriptExecutor)driver;
				jsb.executeScript("window.scrollBy(250,500)", "");
				Thread.sleep(2000);
				
		//logout
		driver.findElement(By.xpath("html/body/div[4]/form/input")).click();
		

		Thread.sleep(3000);
		driver.close();
	}
}
	