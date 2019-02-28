import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PHP_Flights {
 @Test
 public void main() throws InterruptedException, IOException {
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://www.phptravels.net/admin");

 
 
 //email
 driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
 //passwrd
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
 //button
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 
 
 //flights
 Thread.sleep(3000);

 driver.findElement(By.xpath("//a[@href='#Flights']")).click();
 Thread.sleep(3000);
 
 //Routes
 driver.findElement(By.xpath("//a[contains(text(),'Routes')]")).click();
 
 //click on Add button
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 
 //Click on Price
 driver.findElement(By.xpath("//input[contains(@name,'adultprice[]')]")).sendKeys("10000");
 
 //airport -sub
 driver.findElement(By.xpath("//a[contains(text(),'Airports')]")).click();
 //add
 driver.findElement(By.xpath("//a[@class='btn btn-success xcrud-action']")).click();
 Thread.sleep(3000);
 //code
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb2Rl']")).sendKeys("BZW");
 
 //name
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5uYW1l']")).sendKeys("BEI WEI Arpt");
 
 //citycode
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5Q29kZQ--']")).sendKeys("BZW");
 
 //cityname
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5TmFtZQ--']")).sendKeys("Beijing");
 
 //countryname
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5TmFtZQ--']")).sendKeys("China");
 
 //countrycode
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5Q29kZQ--']")).sendKeys("CN");
 
 //timezone
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy50aW1lem9uZQ--']")).sendKeys("8");
 
 //lat
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5sYXQ-']")).sendKeys("22.639258");
 
 //lon
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5sb24-']")).sendKeys("113.810664");
 
 //city
 driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5']")).sendKeys("true");
 
 //save and return
 driver.findElement(By.xpath("//a[@class='btn btn-primary xcrud-action']")).click();
 
 Thread.sleep(3000);
 //search
 driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default']")).click();
 //enter search values
 driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("BZW");
 //click on GO
 driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-primary']")).click();

 //logout
 driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']")).click();
 
 TakesScreenshot ts=(TakesScreenshot)driver;
 File file=ts.getScreenshotAs(OutputType.FILE);
 org.apache.commons.io.FileUtils.copyFile(file, new File("E:\\demo.jpeg"));
 System.out.println("Saved the screenshot");
 
 driver.close();
 
 
}


@AfterTest
public static void skip() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 
 driver.manage().window().maximize();
 driver.get("https://www.phptravels.net/user");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
 driver.close();
 
}
}
